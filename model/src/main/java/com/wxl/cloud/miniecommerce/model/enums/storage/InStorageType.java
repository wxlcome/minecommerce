package com.wxl.cloud.miniecommerce.model.enums.storage;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：InStorageType
 * @description：自定义枚举
 * @author     ：wxl
 * @date       ：2024/12/05 13:01
 */
@Getter
public enum InStorageType implements BaseEnum {

    MARKETING(1, "营销"),
    PURCHASE(2, "采购"),
    MOVE(3, "调动");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    InStorageType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static InStorageType fromMember (Integer val){
        return Arrays.stream(InStorageType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
