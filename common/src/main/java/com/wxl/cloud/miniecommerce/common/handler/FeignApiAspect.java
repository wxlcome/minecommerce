package com.wxl.cloud.miniecommerce.common.handler;

import com.wxl.cloud.miniecommerce.common.exception.RPCException;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import com.wxl.cloud.miniecommerce.model.enums.http.ResultCodeEnum;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @ClassName  ：FeignApiAspect
 * @description： feign api 切面
 * @author     ：wxl
 * @date       ：2024/12/01 20:54
 */
@Component
@Aspect
public class FeignApiAspect {

    @Around("execution(* com.wxl.cloud.miniecommerce.common.api.*.*.*(..))")
    public Object feignApiAround(ProceedingJoinPoint joinPoint) throws Throwable {

        Result result = (Result)joinPoint.proceed(joinPoint.getArgs());

        Integer code = result.getCode();
        if(! ResultCodeEnum.SUCCESS.getCode().equals(code))
            throw new RPCException(result.getCode(),result.getMessage());

        return result;
    }


}
