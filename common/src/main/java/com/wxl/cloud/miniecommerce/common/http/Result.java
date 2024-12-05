package com.wxl.cloud.miniecommerce.common.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 全局统一返回结果类
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {

    //返回码
    private Integer code;

    //返回消息
    private String message;

    //返回数据
    private T data;

    //时间戳
    private long timestamp = System.currentTimeMillis();

    public Result() {
    }

    private static <T> Result<T> build(T data) {
        Result<T> result = new Result<>();
        if (data != null)
            result.setData(data);
        return result;
    }

    public static <T> Result<T> build(T body, ResultCodeEnum resultCodeEnum) {
        Result<T> result = build(body);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }


    public static <T> Result<T> ok(T data) {
        return build(data, ResultCodeEnum.SUCCESS);
    }

    public static <T> Result<T> ok() {
        return Result.ok(null);
    }

    public static <T> Result<T> fail() {
        return build(null, ResultCodeEnum.FAIL);
    }

    public static <T> Result<T> fail(Integer code,String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static <T> Result<T> fail(String msg) {
        Result<T> result = new Result<>();
        result.setCode(ResultCodeEnum.FAIL.getCode());
        result.setMessage(msg);
        return result;
    }
}
