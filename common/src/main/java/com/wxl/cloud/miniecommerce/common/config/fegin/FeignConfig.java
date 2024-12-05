package com.wxl.cloud.miniecommerce.common.config.fegin;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName  ：FeignConfig
 * @description：OpenFeign 配置类
 * @author     ：wxl
 * @date       ：2024/09/24 23:22
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer retryer() {
        return Retryer.NEVER_RETRY;  //openfeign 重试机制 默认为从不重试
    }

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;  //openfeign 日志级别
    }


}
