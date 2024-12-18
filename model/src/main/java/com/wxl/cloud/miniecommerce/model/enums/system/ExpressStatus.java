package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：ExpressStatus
 * @description：快递状态
 * @author     ：wxl
 * @date       ：2024/12/13 13:01
 */
@Getter
public enum ExpressStatus implements BaseEnum {
    NOT(0, "未收货"),
    GOT(1, "已收货");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    ExpressStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static ExpressStatus fromMember (Integer val){
        return Arrays.stream(ExpressStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
