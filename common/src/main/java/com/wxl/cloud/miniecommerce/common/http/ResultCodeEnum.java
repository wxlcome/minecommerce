package com.wxl.cloud.miniecommerce.common.http;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * 统一返回结果状态信息类
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200, "成功"),
    FAIL(201, "失败"),

    TOKEN_EXPIRED(601, "token过期"),
    TOKEN_INVALID(602, "token非法");

    @JsonValue
    private final Integer code;

    private final String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
