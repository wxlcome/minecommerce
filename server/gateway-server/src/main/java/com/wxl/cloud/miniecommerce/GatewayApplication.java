package com.wxl.cloud.miniecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @ClassName  ：GatewayApplication
 * @description：网关服务启动类
 * @author     ：wxl
 * @date       ：2024/11/05 12:13
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }


}
