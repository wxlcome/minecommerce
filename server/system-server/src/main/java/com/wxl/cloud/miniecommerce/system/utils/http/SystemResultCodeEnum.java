package com.wxl.cloud.miniecommerce.system.utils.http;

import com.fasterxml.jackson.annotation.JsonValue;
import com.wxl.cloud.miniecommerce.common.http.BaseCodeEnum;
import lombok.Getter;

/**
 * @ClassName  ：SystemResultCodeEnum
 * @description：自定义类
 * @author     ：wxl
 * @date       ：2024/12/08 13:44
 */
@Getter
public enum SystemResultCodeEnum implements BaseCodeEnum {

    FILE_NOT_IMAGE(91011,"文件不是图片格式" ),
    FILE_NOT_VIDEO(91021,"文件不是视频格式" ),
    FILE_IMAGE_OUT_SIZE(91012, "图片文件过大，限制10MB"),
    FILE_VIDEO_OUT_SIZE(91022, "视频文件过大，限制250MB");

    @JsonValue
    private final Integer code;

    private final String message;

    SystemResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
