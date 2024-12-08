package com.wxl.cloud.miniecommerce.model.enums.order;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：PostSaleStatus
 * @description：售后状态
 * @author     ：wxl
 * @date       ：2024/12/05 12:41
 */
@Getter
public enum PostSaleStatus implements BaseEnum {

    CANCEL(0, "已取消"),
    DONE(1, "已完成");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    PostSaleStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static PostSaleStatus fromMember (Integer val){
        return Arrays.stream(PostSaleStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
