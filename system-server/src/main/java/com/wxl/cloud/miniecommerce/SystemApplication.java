package com.wxl.cloud.miniecommerce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName  ：SystemApplication
 * @description：系统服务启动类
 * @author     ：wxl
 * @date       ：2024/12/05 15:55
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@EnableFeignClients
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}