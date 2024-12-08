package com.wxl.cloud.miniecommerce.system.service;


import com.wxl.cloud.miniecommerce.system.config.minio.MinioProperties;
import io.minio.MinioClient;
import io.minio.errors.*;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @InterfaceName  ：MinioService
 * @description    ：自定义接口
 * @author         ：wxl
 * @date           ：2024/08/30 19:47
 */
public interface MinioService {

    MinioProperties getMinioProperties();

    MinioClient getMinioClient();


    /**
     * @Description 上传文件
     * @param path 文件的本地路径
     * @param url  保存的服务端文件URL
     * @param contentType 文件类型
     */
    void uploadObject(String path, String url,String contentType) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException;

    /**
     * @Description 上传文件
     * @param inputStream 文件数据流
     * @param url 保存的服务端文件URL
     * @param size 文件大小
     * @param contentType 文件类型
     */
    void uploadObject(InputStream inputStream, String url, long size, String contentType) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException;

}
