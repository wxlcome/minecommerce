package com.wxl.cloud.miniecommerce.model.enums.order;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：ReplaceGoodsStatus
 * @description：自定义枚举
 * @author     ：wxl
 * @date       ：2024/12/05 12:53
 */
@Getter
public enum ReplaceGoodsStatus implements BaseEnum {

    CANCEL(0, "已取消"),
    REFUSE(1, "拒绝换货"),
    CONFIRM(2, "确认换货"),
    BUYER_NOT_SEND(3, "买家未发货"),
    BACK_SHIPPING(4, "退货物流运输中"),
    SYSTEM_CONFIRM(5, "系统确认收货"),
    SYSTEM_NOT_SEND(6, "系统未发货"),
    SEND_SHIPPING(7, "发货物流运输中"),
    BUYER_CONFIRM(8, "买家确认收货"),
    DONE(9, "换货完成");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    ReplaceGoodsStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static ReplaceGoodsStatus fromMember (Integer val){
        return Arrays.stream(ReplaceGoodsStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }
}
