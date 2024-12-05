package com.wxl.cloud.miniecommerce.system.controller;

import com.wxl.cloud.miniecommerce.common.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.OperationGoods;
import com.wxl.cloud.miniecommerce.system.service.OperationGoodsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：OperationGoodsContoller
 * @description：活动商品Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/operationgoods")
@Tag(name="活动商品")
public class OperationGoodsController {


    @Autowired
    private OperationGoodsService operationGoodsService;


    @Operation(summary = "根据id查询活动商品")
    @GetMapping("/{id}")
    public Result<OperationGoods> getById(@PathVariable Long id){
        return Result.ok(operationGoodsService.getById(id));
    }
    
    
    @Operation(summary = "查询活动商品列表")
    @GetMapping("list")
    public Result<List<OperationGoods>> list(){
        return Result.ok(operationGoodsService.list());
    }
    
    
    @Operation(summary = "保存或更新活动商品")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody OperationGoods dto){
        operationGoodsService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除活动商品")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        operationGoodsService.removeById(id);
        return Result.ok();
    }

}

