package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：ObjectType
 * @description：自定义枚举
 * @author     ：wxl
 * @date       ：2024/12/08 13:24
 */
@Getter
public enum ObjectType implements BaseEnum {

    ORDER(1, "订单"),
    POST_SALE(2, "售后单"),
    FEEDBACK(3, "反馈");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    ObjectType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static ObjectType fromMember (Integer val){
        return Arrays.stream(ObjectType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
