package com.wxl.cloud.miniecommerce.model.enums.order;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：OrderStatus
 * @description：订单状态
 * @author     ：wxl
 * @date       ：2024/12/05 12:10
 */
@Getter
public enum OrderStatus implements BaseEnum {

    CANCEL(0, "已取消"),
    CONFIRM(1, "已确认"),
    NOT_PAY(2, "未付款"),
    NOT_SEND(3, "未发货"),
    SHIPPING(4, "运送中"),
    GET_GOODS(5, "确认收货"),
    DONE(6, "已完成");


    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    OrderStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static OrderStatus fromMember (Integer val){
        return Arrays.stream(OrderStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
