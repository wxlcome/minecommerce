package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.wxl.cloud.miniecommerce.common.exception.BizException;
import com.wxl.cloud.miniecommerce.system.service.MinioService;
import com.wxl.cloud.miniecommerce.system.service.OSSService;
import com.wxl.cloud.miniecommerce.system.utils.http.SystemResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName  ：OSSServiceImpl
 * @description：自定义类
 * @author     ：wxl
 * @date       ：2024/08/30 20:48
 */
@Slf4j
@Service
public class OSSServiceImpl implements OSSService {

    @Autowired
    private MinioService minioService;

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Override
    public String uploadImage(MultipartFile file) {

        if(!file.getContentType().toLowerCase().startsWith("image/")) //文件不是图片格式
            throw new BizException(SystemResultCodeEnum.FILE_NOT_IMAGE);

        if(file.getSize() > 1024 * 1024 * 10 ) //如果图片大小大于10M
            throw new BizException(SystemResultCodeEnum.FILE_IMAGE_OUT_SIZE);

        String imageFileName = getImageFileName(file.getOriginalFilename());
        String imageURL = String.join("/", "image",sdf.format(new Date()),imageFileName);

        try {
            minioService.uploadObject(file.getInputStream(),imageURL,file.getSize(),file.getContentType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String bucket = minioService.getMinioProperties().getBucket();

        return String.join("/","oss",bucket,imageURL);
    }

    @Override
    public String uploadVideo(MultipartFile file) {

        if(!file.getContentType().toLowerCase().startsWith("video/")) //文件不是视频格式
            throw new BizException(SystemResultCodeEnum.FILE_NOT_VIDEO);

        if(file.getSize() > 1024 * 1024 * 250 ) //如果视频大小大于250M
            throw new BizException(SystemResultCodeEnum.FILE_VIDEO_OUT_SIZE);

        String videoFileName = getVideoFileName(file.getOriginalFilename());
        String videoURL = String.join("/", "video",sdf.format(new Date()),videoFileName);

        try {
            minioService.uploadObject(file.getInputStream(),videoURL,file.getSize(),file.getContentType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        String bucket = minioService.getMinioProperties().getBucket();

        return String.join("/","oss",bucket,videoURL);
    }


    private String getImageFileName(String originalFilename) {
        if(ObjectUtils.isEmpty(originalFilename))
            originalFilename = "picture.png";
        return UUID.nameUUIDFromBytes((Thread.currentThread().getName() + System.currentTimeMillis()+originalFilename).getBytes()).toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
    }

    private String getVideoFileName(String originalFilename) {
        if(ObjectUtils.isEmpty(originalFilename))
            originalFilename = "video.mp4";
        return UUID.nameUUIDFromBytes((Thread.currentThread().getName() + System.currentTimeMillis()+originalFilename).getBytes()).toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
    }
}

