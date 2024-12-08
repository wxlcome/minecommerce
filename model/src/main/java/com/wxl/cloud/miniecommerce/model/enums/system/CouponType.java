package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：CouponType
 * @description：优惠券类型
 * @author     ：wxl
 * @date       ：2024/12/05 11:05
 */
@Getter
public enum CouponType implements BaseEnum {

    WHOLE(1, "全场券"),
    SINGLE(2, "单品券");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    CouponType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static CouponType fromMember (Integer val){
        return Arrays.stream(CouponType.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }


}
