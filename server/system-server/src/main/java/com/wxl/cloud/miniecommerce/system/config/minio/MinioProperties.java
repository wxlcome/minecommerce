package com.wxl.cloud.miniecommerce.system.config.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName  ：MinioProperties
 * @description：minio资源配置项
 * @author     ：wxl
 * @date       ：2024/08/30 19:26
 */
@Data
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {

    private String endpoint; //minio服务地址，包括协议、域名、端口
    private String accessKey; //accessKey
    private String secretKey; //secretKey
    private String bucket; //桶名称

}
