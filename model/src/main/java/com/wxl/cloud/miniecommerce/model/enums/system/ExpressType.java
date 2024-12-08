package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：ExpressType
 * @description：快递类型
 * @author     ：wxl
 * @date       ：2024/12/05 11:44
 */
@Getter
public enum ExpressType implements BaseEnum {

    SEND(1, "发货"),
    BACK(2, "退货");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    ExpressType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static ExpressType fromMember (Integer val){
        return Arrays.stream(ExpressType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
