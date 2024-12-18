package com.wxl.cloud.miniecommerce.model.enums.goods;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：GoodsStatus
 * @description：商品状态
 * @author     ：wxl
 * @date       ：2024/12/05 12:00
 */
@Getter
public enum GoodsStatus implements BaseEnum {

    OFFLINE(0, "下架"),
    ONLINE(1, "上架");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    GoodsStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static GoodsStatus fromMember (Integer val){
        return Arrays.stream(GoodsStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
