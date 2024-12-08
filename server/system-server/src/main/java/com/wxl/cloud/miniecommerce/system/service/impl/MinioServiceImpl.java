package com.wxl.cloud.miniecommerce.system.service.impl;

import com.wxl.cloud.miniecommerce.system.config.minio.MinioProperties;
import com.wxl.cloud.miniecommerce.system.service.MinioService;
import io.minio.*;
import io.minio.errors.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @ClassName  ：MinioService
 * @description：Minio服务
 * @author     ：wxl
 * @date       ：2024/08/30 19:32
 */

@Service
@Getter
@EnableConfigurationProperties(MinioProperties.class)
@RequiredArgsConstructor
public class MinioServiceImpl implements MinioService {

    private final MinioProperties minioProperties;
    private final MinioClient minioClient;

    @Override
    public void uploadObject(String path, String url,String contentType) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

        checknCreateBucket();

        minioClient.uploadObject(
                UploadObjectArgs.builder()
                        .bucket(minioProperties.getBucket())
                        .object(path)
                        .filename(url)
                        .contentType(contentType)
                        .build());
    }

    @Override
    public void uploadObject(InputStream inputStream,String url,long size, String contentType) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

        checknCreateBucket();

        minioClient.putObject(
                PutObjectArgs.builder()
                        .bucket(minioProperties.getBucket())
                        .object(url)
                        .stream(inputStream,size,-1)
                        .contentType(contentType)
                        .build());
    }

    private void checknCreateBucket() throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

        boolean found =
                minioClient.bucketExists(BucketExistsArgs.builder().bucket(minioProperties.getBucket()).build()); //查看桶是否存在
        if (!found) {
            minioClient.makeBucket(MakeBucketArgs.builder().bucket(minioProperties.getBucket()).build()); //创建桶
            minioClient.setBucketPolicy(SetBucketPolicyArgs.builder().bucket(minioProperties.getBucket()).config(getPolicyConfig()).build()); //配置桶权限
        }
    }

    private String getPolicyConfig() {
        return String.format("{\n" +
                "                          \"Statement\" : [ {\n" +
                "                            \"Action\" : \"s3:GetObject\",\n" +
                "                            \"Effect\" : \"Allow\",\n" +
                "                            \"Principal\" : \"*\",\n" +
                "                            \"Resource\" : \"arn:aws:s3:::%s/*\"\n" +
                "                          } ],\n" +
                "                          \"Version\" : \"2012-10-17\"\n" +
                "                        }", minioProperties.getBucket());
    }

}
