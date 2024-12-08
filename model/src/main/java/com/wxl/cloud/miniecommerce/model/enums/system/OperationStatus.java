package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：OperationStatus
 * @description：活动状态
 * @author     ：wxl
 * @date       ：2024/12/05 11:46
 */
@Getter
public enum OperationStatus implements BaseEnum {

    DISABLE(0, "禁用"),
    ENABLE(1, "启用");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    OperationStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static OperationStatus fromMember (Integer val){
        return Arrays.stream(OperationStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
