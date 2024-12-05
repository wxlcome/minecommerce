package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.SpecValueService;
import com.wxl.cloud.miniecommerce.model.entity.goods.SpecValue;
import com.wxl.cloud.miniecommerce.common.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：SpecValueContoller
 * @description：规格值Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/specvalue")
@Tag(name="规格值")
public class SpecValueController {


    @Autowired
    private SpecValueService specValueService;


    @Operation(summary = "根据id查询规格值")
    @GetMapping("/{id}")
    public Result<SpecValue> getById(@PathVariable Long id){
        return Result.ok(specValueService.getById(id));
    }
    
    
    @Operation(summary = "查询规格值列表")
    @GetMapping("list")
    public Result<List<SpecValue>> list(){
        return Result.ok(specValueService.list());
    }
    
    
    @Operation(summary = "保存或更新规格值")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody SpecValue dto){
        specValueService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除规格值")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        specValueService.removeById(id);
        return Result.ok();
    }

}

