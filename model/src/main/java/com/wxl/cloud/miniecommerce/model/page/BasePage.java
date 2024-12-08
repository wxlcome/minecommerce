package com.wxl.cloud.miniecommerce.model.page;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wxl.cloud.miniecommerce.model.annotation.PagerFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName  ：BasePage
 * @description：自定义类
 * @author     ：wxl
 * @date       ：2024/08/29 23:29
 */
@Data
@Schema(description = "分页器")
public class BasePage<T,F> implements IPage<T> {

    @Schema(description = "查询数据列表",accessMode = Schema.AccessMode.READ_ONLY)
    private List<T> records = Collections.emptyList();

    @Schema(description = "总记录数",accessMode = Schema.AccessMode.READ_ONLY)
    private long total = 0;

    @Schema(description = "每页显示条数",defaultValue = "10")
    private long size = 10;

    @Schema(description = "当前页",defaultValue = "1")
    private long current = 1;

    @Schema(description = "排序字段信息")
    private List<OrderItem> orders = new ArrayList<>();

    @Schema(description = "过滤条件")
    @PagerFilter
    private F filter;

    /**
     * 是否存在上一页
     *
     * @return true / false
     */
    public boolean hasPrevious() {
        return this.current > 1;
    }

    /**
     * 是否存在下一页
     *
     * @return true / false
     */
    public boolean hasNext() {
        return this.current < this.getPages();
    }

    @Override
    public List<T> getRecords() {
        return this.records;
    }

    @Override
    public BasePage<T,F> setRecords(List<T> records) {
        this.records = records;
        return this;
    }

    @Override
    public long getTotal() {
        return this.total;
    }

    @Override
    public BasePage<T,F> setTotal(long total) {
        this.total = total;
        return this;
    }

    @Override
    public long getSize() {
        return this.size;
    }

    @Override
    public BasePage<T,F> setSize(long size) {
        this.size = size;
        return this;
    }

    @Override
    public long getCurrent() {
        return this.current;
    }

    @Override
    public BasePage<T,F> setCurrent(long current) {
        this.current = current;
        return this;
    }


    /**
     * 查找 order 中正序排序的字段数组
     *
     * @param filter 过滤器
     * @return 返回正序排列的字段数组
     */
    private String[] mapOrderToArray(Predicate<OrderItem> filter) {
        List<String> columns = new ArrayList<>(orders.size());
        orders.forEach(i -> {
            if (filter.test(i)) {
                columns.add(i.getColumn());
            }
        });
        return columns.toArray(new String[0]);
    }

    /**
     * 移除符合条件的条件
     *
     * @param filter 条件判断
     */
    private void removeOrder(Predicate<OrderItem> filter) {
        for (int i = orders.size() - 1; i >= 0; i--) {
            if (filter.test(orders.get(i))) {
                orders.remove(i);
            }
        }
    }

    /**
     * 添加新的排序条件，构造条件可以使用工厂
     *
     * @param items 条件
     * @return 返回分页参数本身
     */
    public BasePage<T,F> addOrder(OrderItem... items) {
        orders.addAll(Arrays.asList(items));
        return this;
    }

    /**
     * 添加新的排序条件，构造条件可以使用工厂
     *
     * @param items 条件
     * @return 返回分页参数本身
     */
    public BasePage<T,F> addOrder(List<OrderItem> items) {
        orders.addAll(items);
        return this;
    }

    @Override
    public List<OrderItem> orders() {
        return this.orders;
    }


    @Override
    @Schema(description = "总页数",accessMode = Schema.AccessMode.READ_ONLY)
    public long getPages() {
        // 解决 github issues/3208
        return IPage.super.getPages();
    }




}
