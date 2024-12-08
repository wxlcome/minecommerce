package com.wxl.cloud.miniecommerce.system.controller;

import com.wxl.cloud.miniecommerce.common.http.Result;
import com.wxl.cloud.miniecommerce.system.service.OSSService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName  ：OSSContoller
 * @description：对象存储
 * @author     ：wxl
 * @date       ：2024/08/28 19:13
 */
@RestController
@RequestMapping("/system/oss")
@Tag(name="对象存储")
public class OSSContoller {

    @Autowired
    private OSSService ossService;


    @Operation(summary = "上传图片")
    @PostMapping("/uploadimage")
    public Result<String> uploadImage(MultipartFile file){
        return Result.ok(ossService.uploadImage(file));
    }


    @Operation(summary = "上传视频")
    @PostMapping("/uploadvideo")
    public Result<String> uploadVideo(MultipartFile file){
        return Result.ok(ossService.uploadVideo(file));
    }


}

