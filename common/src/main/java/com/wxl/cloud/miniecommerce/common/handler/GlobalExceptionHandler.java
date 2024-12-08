package com.wxl.cloud.miniecommerce.common.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.wxl.cloud.miniecommerce.common.exception.BizException;
import com.wxl.cloud.miniecommerce.common.exception.RPCException;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName  ：GlobalExceptionHandler
 * @description：全局异常处理器
 * @author     ：wxl
 * @date       ：2024/08/30 23:03
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 系统异常
    @ExceptionHandler(RuntimeException.class)
    public Result<String> handleException(Exception e) {

        if (BlockException.isBlockException(e)) // 当前异常是否是sentinel的BlockException
            return handleBlockException(e); // 根据不同BlockException异常类型进行不同的处理

        log.error("", new Exception("系统异常", e));
        return Result.fail("系统异常");
    }

    // 业务异常
    @ExceptionHandler(BizException.class)
    public Result<String> handleBizException(BizException e) {
        log.error("", new Exception("业务异常 (" + e.getMessage() + ")", e));
        return Result.fail(e.getCode(), e.getMessage());
    }

    // 远程调用异常
    @ExceptionHandler(RPCException.class)
    public Result<String> handleBizException(RPCException e) {
        log.error("", new Exception("远程调用异常 (" + e.getMessage() + ")", e));
        return Result.fail(e.getCode(), e.getMessage());
    }


    // 控制层参数校验异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handle(MethodArgumentNotValidException e) {
        // 获取FieldError
        FieldError fieldError = e.getBindingResult().getFieldError();
        log.error("", new Exception("参数校验异常", e));
        // 返回错误信息
        return Result.fail(fieldError.getDefaultMessage());
    }


    private Result<String> handleBlockException(Exception e) {

        Throwable cause = e.getCause();
        while (cause != null) {

            if (cause instanceof FlowException) {
                return handleFlowException(e);  // 流量控制异常
            } else if (cause instanceof DegradeException) {
                return handleDegradeException(e); // 熔断降级异常
            } else if (cause instanceof ParamFlowException) {
                return handleParamFlowException(e); // 热点异常
            } else if (cause instanceof AuthorityException) {
                return handleAuthorityException(e); // 授权异常
            }
            cause = cause.getCause();
        }

        return null;
    }


    // sentinel 流量规则异常
    private Result<String> handleFlowException(Exception e) {
        log.error("", new Exception("限流触发", e));
        return Result.fail("请求发送过快，请重试");
    }

    // sentinel 熔断降级规则异常
    private Result<String> handleDegradeException(Exception e) {
        log.error("", new Exception("熔断降级触发", e));
        e.printStackTrace();
        return Result.fail("系统服务繁忙，请稍后");
    }

    // sentinel 热点规则异常
    private Result<String> handleParamFlowException(Exception e) {
        log.error("", new Exception("热点规则触发", e));
        e.printStackTrace();
        return Result.fail("资源请求次数过多，请稍后");
    }

    // sentinel 授权规则异常
    private Result<String> handleAuthorityException(Exception e) {
        log.error("", new Exception("授权规则触发", e));
        e.printStackTrace();
        return Result.fail("对不起，您无权访问");
    }


}
