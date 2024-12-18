package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.ParamValueService;
import com.wxl.cloud.miniecommerce.model.entity.goods.ParamValue;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：ParamValueContoller
 * @description：参数值Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:34
 */
@RestController
@RequestMapping("/goods/paramvalue")
@Tag(name="参数值")
public class ParamValueController {


    @Autowired
    private ParamValueService paramValueService;


    @Operation(summary = "根据id查询参数值")
    @GetMapping("/{id}")
    public Result<ParamValue> getById(@PathVariable Long id){
        return Result.ok(paramValueService.getById(id));
    }
    
    
    @Operation(summary = "查询参数值列表")
    @GetMapping("list")
    public Result<List<ParamValue>> list(){
        return Result.ok(paramValueService.list());
    }
    
    
    @Operation(summary = "保存或更新参数值")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody ParamValue dto){
        paramValueService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除参数值")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        paramValueService.removeById(id);
        return Result.ok();
    }

}

