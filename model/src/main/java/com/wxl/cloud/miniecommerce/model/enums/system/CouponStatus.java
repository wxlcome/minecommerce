package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：CouponStatus
 * @description：优惠券状态
 * @author     ：wxl
 * @date       ：2024/12/05 11:42
 */
@Getter
public enum CouponStatus implements BaseEnum {

    DISABLE(0, "禁用"),
    ENABLE(1, "启用");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    CouponStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static CouponStatus fromMember (Integer val){
        return Arrays.stream(CouponStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
