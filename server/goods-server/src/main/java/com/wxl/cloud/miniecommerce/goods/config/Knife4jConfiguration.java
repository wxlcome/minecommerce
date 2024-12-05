package com.wxl.cloud.miniecommerce.goods.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI().info(
                new Info()
                        .title("商品服务API")
                        .summary("商品服务API")
                        .contact(new Contact()
                                .name("wxlcome")
                                .url("http://wxlcome.std")
                                .email("814347212@qq.com")
                        )
                        .version("1.0")
                        .description("商品服务API"));
    }


    @Bean
    public GroupedOpenApi loginAPI() {
        return GroupedOpenApi.builder().group("商品服务").
                pathsToMatch(
                        "/goods/**"
                ).
                build();
    }

}