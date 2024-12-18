package com.wxl.cloud.miniecommerce.system.controller.feedback;

import com.wxl.cloud.miniecommerce.common.util.http.Result;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressInfo;
import com.wxl.cloud.miniecommerce.model.entity.system.Feedback;
import com.wxl.cloud.miniecommerce.system.pagefilter.ExpressInfoAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.pagefilter.FeedbackAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.service.FeedbackService;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressInfoAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.FeedbackAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.FeedbackAdminVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：FeedbackAdminController
 * @description：反馈Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/feedback/admin")
@Tag(name="反馈管理")
public class FeedbackAdminController {

    @Autowired
    private FeedbackService feedbackService;


    @Operation(summary = "根据id查询反馈")
    @GetMapping("/{id}")
    public Result<FeedbackAdminVO> getById(@PathVariable Long id){
        return Result.ok(feedbackService.getAdminVOById(id));
    }


    @Operation(summary = "分页查询反馈")
    @PostMapping("page")
    public Result<BasePage<FeedbackAdminPageVO, FeedbackAdminPageFilter>> getAdminPageByFilter(@RequestBody BasePage<Feedback,FeedbackAdminPageFilter> page){
        return Result.ok(feedbackService.getAdminPageByFilter(page));
    }

}

