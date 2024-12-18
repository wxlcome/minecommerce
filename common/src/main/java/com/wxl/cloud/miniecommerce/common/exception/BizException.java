package com.wxl.cloud.miniecommerce.common.exception;

import com.wxl.cloud.miniecommerce.common.util.http.BaseCodeEnum;
import lombok.Data;

/**
 * @ClassName  ：BizException
 * @description：业务异常类
 * @author     ：wxl
 * @date       ：2024/08/30 23:06
 */
@Data
public class BizException extends RuntimeException {

    private Integer code;

    public BizException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public BizException(BaseCodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.code = codeEnum.getCode();
    }

    public BizException(BaseCodeEnum codeEnum, String msg) {
        super(msg);
        this.code = codeEnum.getCode();
    }
}
