package com.wxl.cloud.miniecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName  ：WebAdminApplication
 * @description：后台管理启动类
 * @author     ：wxl
 * @date       ：2024/12/05 20:41
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@EnableFeignClients
public class WebAdminApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(WebAdminApplication.class, args);
    }
}
