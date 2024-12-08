package com.wxl.cloud.miniecommerce.model.enums.system;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.model.enums.http.BaseEnum;
import lombok.Getter;

import java.util.Arrays;

/**
 * @EnumName   ：AdvertisementStatus
 * @description：自定义枚举
 * @author     ：wxl
 * @date       ：2024/12/07 23:55
 */
@Getter
public enum AdvertisementStatus implements BaseEnum {

    OFFLINE(0, "未上线"),
    ONLINE(1, "已上线");

    @EnumValue
    @JsonValue
    private final Integer value;
    private final String desc;

    AdvertisementStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static AdvertisementStatus fromMember (Integer val){
        return Arrays.stream(AdvertisementStatus.values())
                .filter(e-> e.getValue().equals(val))
                .findFirst()
                .get();
    }

}
