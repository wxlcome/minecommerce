package com.wxl.cloud.miniecommerce.model.enums.order;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：RefundStatus
 * @description：自定义枚举
 * @author     ：wxl
 * @date       ：2024/12/05 12:44
 */
@Getter
public enum RefundStatus implements BaseEnum {

    CANCEL(0, "已取消"),
    REFUSE(1, "拒绝退款"),
    CONFIRM(2, "确认退款"),
    BUYER_NOT_SEND(3, "买家未发货"),
    BACK_SHIPPING(4, "退货物流运输中"),
    SYSTEM_CONFIRM(5, "系统确认收货"),
    SUCCESS(6, "退款成功");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    RefundStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static RefundStatus fromMember (Integer val){
        return Arrays.stream(RefundStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
