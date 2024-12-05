package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：PaymentType
 * @description：支付类型
 * @author     ：wxl
 * @date       ：2024/12/05 11:12
 */
@Getter
public enum PaymentType implements BaseEnum {

    E_PAY(1, "电子支付"),
    BANK(2, "银行卡");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    PaymentType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static PaymentType fromMember (Integer val){
        return Arrays.stream(PaymentType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }

}
