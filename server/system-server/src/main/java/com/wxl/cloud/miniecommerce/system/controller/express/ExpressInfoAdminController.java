package com.wxl.cloud.miniecommerce.system.controller.express;

import com.wxl.cloud.miniecommerce.common.util.http.Result;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressInfo;
import com.wxl.cloud.miniecommerce.system.pagefilter.ExpressInfoAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.service.ExpressInfoService;
import com.wxl.cloud.miniecommerce.system.service.ExpressTrendsService;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressInfoAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressInfoAdminVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressTrends;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：ExpressInfoContoller
 * @description：快递信息管理Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/expressinfo/admin")
@Tag(name="快递信息管理")
public class ExpressInfoAdminController {


    @Autowired
    private ExpressInfoService expressInfoService;


    @Operation(summary = "根据id查询快递信息")
    @GetMapping("/{id}")
    public Result<ExpressInfoAdminVO> getAdminVOById(@PathVariable Long id){
        return Result.ok(expressInfoService.getAdminVOById(id));
    }


    @Operation(summary = "分页查询快递信息")
    @PostMapping("page")
    public Result<BasePage<ExpressInfoAdminPageVO, ExpressInfoAdminPageFilter>> getAdminPageByFilter(@RequestBody BasePage<ExpressInfo,ExpressInfoAdminPageFilter> page){
        return Result.ok(expressInfoService.getAdminPageByFilter(page));
    }


}

