package com.wxl.cloud.miniecommerce.system.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @InterfaceName  ：OSSService
 * @description    ：对象存储服务
 * @author         ：wxl
 * @date           ：2024/08/30 20:46
 */
public interface OSSService {

    /**
     * @Description 上传图片
     * @param file  图片文件
     * @return java.lang.String 图片URL
     */
    String uploadImage(MultipartFile file) ;

    /**
     * @Description 上传视频
     * @param file  视频文件
     * @return java.lang.String 视频URL
     */
    String uploadVideo(MultipartFile file);
}
