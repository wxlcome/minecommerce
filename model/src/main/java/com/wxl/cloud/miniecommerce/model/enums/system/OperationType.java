package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：OperationType
 * @description：活动类型
 * @author     ：wxl
 * @date       ：2024/12/05 11:17
 */
@Getter
public enum OperationType implements BaseEnum {

    DISCOUNT(1, "折扣"),
    SECKILL(2, "秒杀");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    OperationType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static OperationType fromMember (Integer val){
        return Arrays.stream(OperationType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }

}
