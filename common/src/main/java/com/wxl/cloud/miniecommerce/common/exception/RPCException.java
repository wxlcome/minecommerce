package com.wxl.cloud.miniecommerce.common.exception;


import com.wxl.cloud.miniecommerce.common.http.ResultCodeEnum;

/**
 * @ClassName  ：RPCException
 * @description：
 * @author     ：wxl
 * @date       ：2024/12/01 21:12
 */
public class RPCException extends BizException{


    public RPCException(Integer code, String msg) {
        super(code, msg);
    }

    public RPCException(ResultCodeEnum codeEnum) {
        super(codeEnum);
    }

    public RPCException(ResultCodeEnum codeEnum, String msg) {
        super(codeEnum, msg);
    }
}
