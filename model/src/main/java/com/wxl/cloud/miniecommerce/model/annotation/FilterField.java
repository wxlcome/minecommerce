package com.wxl.cloud.miniecommerce.model.annotation;

import lombok.Getter;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface FilterField {

    /**
     * @return 列名
     */
    String column() default "";

    /**
     * @return 列名组
     */
    String[] columns() default {};

    /**
     * @return 自定义查询格式
     */
    String customFormatter() default "";

    /**
     * @return 比较类型
     */
    CompareType compareType();

    enum CompareType {
        EQ(" = ","%s"), //等于
        GE(" >= ","%s"), //大于等于
        LE(" <= ","%s"), //小于等于
        GT(" > ","%s"), //大于
        LT(" < ","%s"), //小于
        IN(" in ","( %s )"), //in
        BETWEEN(" between ","%s" ), //between
        EQ_LIKE(" LIKE ","%s"), //精确匹配
        LEFT_LIKE(" LIKE ","%%%s"), //左匹配
        RIGHT_LIKE(" LIKE ","%s%%"), //右匹配
        FULL_LIKE(" LIKE ","%%%s%%"); //全匹配

        @Getter
        private String val;  //符号
        @Getter
        private String formatter; //格式

        CompareType(String val, String formatter) {
            this.val = val;
            this.formatter = formatter;
        }

    }

}
