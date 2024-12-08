package com.wxl.cloud.miniecommerce.model.enums.order;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：RefundType
 * @description：退款类型
 * @author     ：wxl
 * @date       ：2024/12/05 12:38
 */
@Getter
public enum RefundType implements BaseEnum {

    REFUND_AND_GOODS(1, "退货退款（已收货）"),
    ONLY_REFUND(2, "仅退款（未收货）");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    RefundType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static RefundType fromMember (Integer val){
        return Arrays.stream(RefundType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
