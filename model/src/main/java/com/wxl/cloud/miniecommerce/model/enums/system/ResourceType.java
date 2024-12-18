package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：ResourceType
 * @description：资源类型
 * @author     ：wxl
 * @date       ：2024/12/05 11:19
 */
@Getter
public enum ResourceType implements BaseEnum {

    IMAGE(1, "图片"),
    VIDEO(2, "视频");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    ResourceType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static ResourceType fromMember (Integer val){
        return Arrays.stream(ResourceType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
