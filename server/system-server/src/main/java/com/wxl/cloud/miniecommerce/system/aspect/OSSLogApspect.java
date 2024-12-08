package com.wxl.cloud.miniecommerce.system.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.text.DecimalFormat;

/**
 * @ClassName  ：OSSLogApspect
 * @description：对象存储日志
 * @author     ：wxl
 * @date       ：2024/12/08 16:19
 */
@Component
@Aspect
@Slf4j
public class OSSLogApspect {

    @Around("execution(* com.wxl.cloud.miniecommerce.system.service.OSSService.upload*(..))")
    public Object uploadAround(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs();

        String url = (String)joinPoint.proceed(args);

        MultipartFile file = (MultipartFile) args[0];
        String contentType = file.getContentType().toLowerCase();
        String name = null;
        if(contentType.startsWith("video/"))
            name = "视频";
        else if(contentType.startsWith("image/"))
            name = "图片";

        log.info("""
                {
                   ossType: "minio",
                   message: "上传{}成功！",
                   file-size: {}MB,
                   file-type: {}，
                   ossUrl: {}
                }
                """,name,new DecimalFormat("0.00").format(file.getSize() /(1024.0*1024.0)),contentType,url);

        return url;
    }

}
