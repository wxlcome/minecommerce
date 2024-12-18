package com.wxl.cloud.miniecommerce.system.controller.operation;

import com.wxl.cloud.miniecommerce.common.util.http.Result;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.Operation;
import com.wxl.cloud.miniecommerce.system.dto.OperationAdminDTO;
import com.wxl.cloud.miniecommerce.system.pagefilter.OperationAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.service.OperationService;
import com.wxl.cloud.miniecommerce.system.vo.admin.OperationAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.OperationAdminVO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName  ：OperationAdminController
 * @description：活动Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/operation/admin")
@Tag(name="活动管理")
public class OperationAdminController {


    @Autowired
    private OperationService operationService;


    @io.swagger.v3.oas.annotations.Operation(summary = "根据id查询活动")
    @GetMapping("/{id}")
    public Result<OperationAdminVO> getAdminVOById(@PathVariable Long id){
        return Result.ok(operationService.getAdminVOById(id));
    }


    @io.swagger.v3.oas.annotations.Operation(summary = "分页查询活动")
    @PostMapping("page")
    public Result<BasePage<OperationAdminPageVO, OperationAdminPageFilter>> getAdminPageByFilter(@RequestBody BasePage<Operation,OperationAdminPageFilter> page){
        return Result.ok(operationService.getAdminPageByFilter(page));
    }
    
    
    @io.swagger.v3.oas.annotations.Operation(summary = "保存或更新活动")
    @PostMapping("saveorupdate")
    public Result saveOrUpdateByDTO(@RequestBody OperationAdminDTO dto){
        operationService.saveOrUpdateByDTO(dto);
        return Result.ok();
    }

    @io.swagger.v3.oas.annotations.Operation(summary = "根据id删除活动")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        operationService.removeById(id);
        return Result.ok();
    }

}

