package com.wxl.cloud.miniecommerce.system.controller.feedback;

import com.wxl.cloud.miniecommerce.common.util.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.Feedback;
import com.wxl.cloud.miniecommerce.system.service.FeedbackService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：FeedbackContoller
 * @description：反馈Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/feedback")
@Tag(name="反馈")
public class FeedbackController {


    @Autowired
    private FeedbackService feedbackService;


    @Operation(summary = "根据id查询反馈")
    @GetMapping("/{id}")
    public Result<Feedback> getById(@PathVariable Long id){
        return Result.ok(feedbackService.getById(id));
    }
    
    
    @Operation(summary = "查询反馈列表")
    @GetMapping("list")
    public Result<List<Feedback>> list(){
        return Result.ok(feedbackService.list());
    }
    
    
    @Operation(summary = "保存或更新反馈")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Feedback dto){
        feedbackService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除反馈")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        feedbackService.removeById(id);
        return Result.ok();
    }

}

