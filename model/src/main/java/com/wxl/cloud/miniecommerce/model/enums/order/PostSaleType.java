package com.wxl.cloud.miniecommerce.model.enums.order;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：PostSaleType
 * @description：售后类型
 * @author     ：wxl
 * @date       ：2024/12/05 12:19
 */
@Getter
public enum PostSaleType implements BaseEnum {

    REFUND(1, "退款"),
    REPLACE(2, "换货");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    PostSaleType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static PostSaleType fromMember (Integer val){
        return Arrays.stream(PostSaleType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
