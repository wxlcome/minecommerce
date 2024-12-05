package com.wxl.cloud.miniecommerce.system.controller;

import com.wxl.cloud.miniecommerce.system.service.OperationService;
import com.wxl.cloud.miniecommerce.model.entity.system.Operation;
import com.wxl.cloud.miniecommerce.common.http.Result;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：OperationContoller
 * @description：活动Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/operation")
@Tag(name="活动")
public class OperationController {


    @Autowired
    private OperationService operationService;


    @io.swagger.v3.oas.annotations.Operation(summary = "根据id查询活动")
    @GetMapping("/{id}")
    public Result<Operation> getById(@PathVariable Long id){
        return Result.ok(operationService.getById(id));
    }
    
    
    @io.swagger.v3.oas.annotations.Operation(summary = "查询活动列表")
    @GetMapping("list")
    public Result<List<Operation>> list(){
        return Result.ok(operationService.list());
    }
    
    
    @io.swagger.v3.oas.annotations.Operation(summary = "保存或更新活动")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Operation dto){
        operationService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @io.swagger.v3.oas.annotations.Operation(summary = "根据id删除活动")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        operationService.removeById(id);
        return Result.ok();
    }

}

