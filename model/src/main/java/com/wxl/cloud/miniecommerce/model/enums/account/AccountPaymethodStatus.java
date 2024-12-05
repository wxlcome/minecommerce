package com.wxl.cloud.miniecommerce.model.enums.account;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：AccountPaymethodStatus
 * @description：账户支付方式状态
 * @author     ：wxl
 * @date       ：2024/12/05 11:30
 */
@Getter
public enum AccountPaymethodStatus implements BaseEnum {

    DISABLE(0, "禁用"),
    ENABLE(1, "启用");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    AccountPaymethodStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static AccountPaymethodStatus fromMember (Integer val){
        return Arrays.stream(AccountPaymethodStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
