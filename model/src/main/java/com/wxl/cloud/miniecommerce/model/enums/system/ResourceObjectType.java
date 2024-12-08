package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：ResourceObjectType
 * @description：自定义枚举
 * @author     ：wxl
 * @date       ：2024/12/08 13:24
 */
@Getter
public enum ResourceObjectType implements BaseEnum {

    ADVERTISEMENT(1, "广告");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    ResourceObjectType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static ResourceObjectType fromMember (Integer val){
        return Arrays.stream(ResourceObjectType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
