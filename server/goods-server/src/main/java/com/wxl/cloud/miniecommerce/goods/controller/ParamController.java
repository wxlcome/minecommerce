package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.ParamService;
import com.wxl.cloud.miniecommerce.model.entity.goods.Param;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：ParamContoller
 * @description：参数Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/param")
@Tag(name="参数")
public class ParamController {


    @Autowired
    private ParamService paramService;


    @Operation(summary = "根据id查询参数")
    @GetMapping("/{id}")
    public Result<Param> getById(@PathVariable Long id){
        return Result.ok(paramService.getById(id));
    }
    
    
    @Operation(summary = "查询参数列表")
    @GetMapping("list")
    public Result<List<Param>> list(){
        return Result.ok(paramService.list());
    }
    
    
    @Operation(summary = "保存或更新参数")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Param dto){
        paramService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除参数")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        paramService.removeById(id);
        return Result.ok();
    }

}

