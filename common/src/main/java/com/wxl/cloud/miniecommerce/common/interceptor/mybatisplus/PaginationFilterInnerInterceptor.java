package com.wxl.cloud.miniecommerce.common.interceptor.mybatisplus;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.ParameterUtils;
import com.baomidou.mybatisplus.core.toolkit.PluginUtils;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.wxl.cloud.miniecommerce.model.annotation.FilterField;
import com.wxl.cloud.miniecommerce.model.annotation.OrderField;
import com.wxl.cloud.miniecommerce.model.annotation.PagerFilter;
import com.wxl.cloud.miniecommerce.model.annotation.PagerOrder;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.*;

/**
 * @ClassName  ：MyPaginationInterceptor
 * @description：自定义分页拦截器 拦截查询sql并添加过滤条件
 * @author     ：wxl
 * @date       ：2024/08/30 12:06
 */
@Slf4j
public class PaginationFilterInnerInterceptor implements InnerInterceptor {

    @Override
    public void beforeQuery(Executor executor, MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) throws SQLException {

        IPage<?> page = ParameterUtils.findPage(parameter).orElse(null); //使用MybatisPlus自带的工具类获取到分页器

        if (page == null) //没有分页器，结束
            return;

        buildConditional(page, boundSql); //建立分页条件

        buildOrderBy(page, boundSql); //建立排序

    }

    /**
     * @Description 建立分页条件
     * @param page
     * @param boundSql
     */
    private void buildConditional(IPage<?> page, BoundSql boundSql) {
        Field filter = null;
        for (Field field : page.getClass().getDeclaredFields()) { //寻找条件过滤器（寻找是否有字段的类型加了@PagerFilter注解）
            PagerFilter ann = field.getAnnotation(PagerFilter.class);
            if (ann != null)
                if (filter != null)
                    throw new RuntimeException("一个类中不允许同时存在两个条件过滤器");
                else
                    filter = field;
        }

        if (filter == null) //没有使用条件过滤器注解，结束
            return;

        Object filterObj = null; //条件过滤器的实例
        try {
            filter.setAccessible(true);
            filterObj = filter.get(page); //获取条件过滤器的实例
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        if (filterObj == null) //没有条件过滤器实例，结束
            return;

        Class<?> filterType = filterObj.getClass(); //获取条件过滤器的类型
        Map<Field, FilterField> filterFields = new HashMap<>();
        for (Field field : filterType.getDeclaredFields()) { //获取所有条件过滤字段且值不能为空（获取添加@FilterField字段）
            try {
                field.setAccessible(true);
                Object val = field.get(filterObj);//获取字段值
                if (ObjectUtils.isEmpty(val))
                    continue;

                FilterField ann = field.getDeclaredAnnotation(FilterField.class);
                if (ann != null)
                    filterFields.putIfAbsent(field, ann); //添加到map中
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        StringBuffer newSql = new StringBuffer(boundSql.getSql());//创建新的sql语句

        checknAddWhere(newSql, 0);//检查sql语句是否有where,没有就添加
        for (Map.Entry<Field, FilterField> entry : filterFields.entrySet()) { //遍历所有条件过滤字段
            List<String> columns = new ArrayList<>(Arrays.asList(entry.getValue().columns()));//获取列名组
            String column = entry.getValue().column(); //获取列名

            if (ObjectUtils.isEmpty(column) && ObjectUtils.isEmpty(columns))
                throw new RuntimeException("过滤字段" + entry.getKey().getName() + "对应的列名不能为空");

            if (!ObjectUtils.isEmpty(column))
                if (ObjectUtils.isEmpty(columns))
                    columns = Collections.singletonList(column);
                else
                    columns.add(column);

            Object value = null;
            try {
                value = entry.getKey().get(filterObj);//获取字段值
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }


            if(ObjectUtils.isEmpty(value))
                continue;

            newSql.append(" and ("); //开始
            FilterField.CompareType compareType = entry.getValue().compareType(); //获取比较运算符
            String valueString = getValueString(value,compareType);
            String compareOptFormatter = null; //比较运算格式
            String formatter = entry.getValue().customFormatter();
            formatter = ObjectUtils.isEmpty(formatter) ? compareType.getFormatter() : formatter; //如果自定义格式为空，就使用默认格式
            if (entry.getKey().getType() == String.class ||entry.getKey().getType() == Date.class ) { //如果是字符串类型，就添加单引号
                compareOptFormatter = compareType.getVal() + "'" + formatter + "'";
            } else
                compareOptFormatter = compareType.getVal() + formatter;

            ArrayList<String> colVal = new ArrayList<>();
            for (String col : columns) { //遍历列名组
                colVal.add(col + String.format(compareOptFormatter, valueString));
            }
            newSql.append(String.join(" or ", colVal));
            newSql.append(")"); //结束
        }

        PluginUtils.mpBoundSql(boundSql).sql(newSql.toString());//使用MybatisPlus的工具类替换sql语句
    }

    /**
     * @Description 利用异常机制，检查sql语句是否有where,没有就添加
     * @param sql  sql
     * @param time 次数
     */
    private void checknAddWhere(StringBuffer sql, int time) {

        String testSql = sql.toString();

        if (time == 2) {
            return;
        }
        if (time == 1) {
            sql.append(" where 1 = 1");
        } else
            testSql += " and 1 = 1";

        try {
            CCJSqlParserUtil.parse(testSql);
        } catch (JSQLParserException e) {
            checknAddWhere(sql, ++time);
        }
    }


    private String getValueString(Object value,FilterField.CompareType compareType)  {

        if (compareType == FilterField.CompareType.IN && value instanceof Collection) {
            Collection collect = (Collection) value;
            return String.join(",", (String[]) collect.stream().map(Object::toString).toArray());
        }

        if (compareType == FilterField.CompareType.BETWEEN )
            if(!(value.getClass().isArray() || value instanceof Collection))  //如果不是数组或集合，就抛出异常
                throw new RuntimeException("between比较类型，字段值必须是数组或集合");
            else{
                List vals = null;
                if (value.getClass().isArray())
                    vals = new ArrayList(Arrays.asList(value)); //如果是数组，就转换为集合
                else
                    vals = (List) value; //如果是集合，就直接转换为集合

                if(vals.size() > 2)
                    throw new RuntimeException("between比较类型，集合中只能有两个值"); //如果集合大小大于2，就抛出异常

                return vals.get(0).toString() + " and " + vals.get(1).toString();
            }


        return value.toString();
    }


    /**
     * @Description 建立分页条件
     * @param page
     * @param boundSql
     */
    private void buildOrderBy(IPage<?> page, BoundSql boundSql) {

        Field order = null;
        for (Field field : page.getClass().getDeclaredFields()) { //寻找条件过滤器（寻找是否有字段的类型加了@PagerFilter注解）
            PagerOrder ann = field.getType().getDeclaredAnnotation(PagerOrder.class);
            if (ann != null)
                if (order != null)
                    throw new RuntimeException("一个类中不允许同时存在两个排序器");
                else
                    order = field;
        }

        if (order == null) //没有使用排序器注解，结束
            return;

        Object orderObj = null; //排序器的实例
        try {
            order.setAccessible(true);
            orderObj = order.get(page); //获取排序器的实例
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        if (orderObj == null) //没有排序器实例，结束
            return;

        Class<?> orderType = order.getType(); //获取排序器的类型
        Map<Field, OrderField> orderFields = new HashMap<>();
        List<String> values = Arrays.asList(new String[]{"asc", "desc"});
        for (Field field : orderType.getDeclaredFields()) { //获取所有排序字段且值不能为空，且值只能是['desc','asc']（获取添加@OrderField字段）
            try {
                field.setAccessible(true);
                Object val = field.get(orderObj);//获取字段值
                if (ObjectUtils.isEmpty(val))
                    continue;
                if(!values.contains(val.toString()))
                    throw new RuntimeException("排序字段"+field.getName()+"的值只能是['desc','asc']");

                OrderField ann = field.getDeclaredAnnotation(OrderField.class);
                if (ann != null)
                    orderFields.putIfAbsent(field, ann); //添加到map中
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        if(ObjectUtils.isEmpty(orderFields))
            return;

        StringBuffer newSql = new StringBuffer(boundSql.getSql());//创建新的sql语句
        ArrayList<String> colVal = new ArrayList<>();
        for (Map.Entry<Field, OrderField> entry : orderFields.entrySet()) { //遍历所有条件过滤字段
            String column = entry.getValue().column(); //获取列名

            if (ObjectUtils.isEmpty(column))
                throw new RuntimeException("排序字段" + entry.getKey().getName() + "对应的列名不能为空");

            Object value = null;
            try {
                value = entry.getKey().get(orderObj);//获取字段值
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

            colVal.add(column + " " + value);
        }

        String orderBySql = String.join(",", colVal);
        checknBuildOrderBy(newSql,orderBySql,0);
        PluginUtils.mpBoundSql(boundSql).sql(newSql.toString());//使用MybatisPlus的工具类替换sql语句
    }


    /**
     * @Description 利用异常机制，构建order by子句
     * @param sql  sql
     * @param time 次数
     */
    private void checknBuildOrderBy(StringBuffer sql, String orderBySql,int time) {

        String testSql = sql.toString();

        if (time == 2) {
            return;
        }
        if (time == 1) {
            sql.append(orderBySql);
            return;
        } else
            testSql += ","+orderBySql;

        try {
            CCJSqlParserUtil.parse(testSql);
            sql.append(","+orderBySql);
        } catch (JSQLParserException e) {
            sql.append(" order by ");
            checknBuildOrderBy(sql,orderBySql,++time);
        }
    }


}
