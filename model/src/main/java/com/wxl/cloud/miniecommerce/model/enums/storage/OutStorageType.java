package com.wxl.cloud.miniecommerce.model.enums.storage;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：OutStorageType
 * @description：自定义枚举
 * @author     ：wxl
 * @date       ：2024/12/05 13:03
 */
@Getter
public enum OutStorageType implements BaseEnum {

    MARKETING(1, "营销"),
    MOVE(2, "调动");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    OutStorageType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static OutStorageType fromMember (Integer val){
        return Arrays.stream(OutStorageType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
