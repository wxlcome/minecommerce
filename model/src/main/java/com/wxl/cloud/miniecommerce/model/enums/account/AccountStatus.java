package com.wxl.cloud.miniecommerce.model.enums.account;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：AccountStatus
 * @description：账户状态
 * @author     ：wxl
 * @date       ：2024/12/05 11:49
 */
@Getter
public enum AccountStatus implements BaseEnum {

    DISABLE(0, "封禁"),
    ENABLE(1, "正常");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    AccountStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static AccountStatus fromMember (Integer val){
        return Arrays.stream(AccountStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
