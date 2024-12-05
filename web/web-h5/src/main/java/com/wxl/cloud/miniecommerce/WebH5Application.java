package com.wxl.cloud.miniecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName  ：WebH5Application
 * @description：移动端h5启动类
 * @author     ：wxl
 * @date       ：2024/12/05 20:41
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@EnableFeignClients
public class WebH5Application {
    
    public static void main(String[] args) {
        SpringApplication.run(WebH5Application.class, args);
    }
}
