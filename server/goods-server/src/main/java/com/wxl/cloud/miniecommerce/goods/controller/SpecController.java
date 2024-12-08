package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.SpecService;
import com.wxl.cloud.miniecommerce.model.entity.goods.Spec;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：SpecContoller
 * @description：规格Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/spec")
@Tag(name="规格")
public class SpecController {


    @Autowired
    private SpecService specService;


    @Operation(summary = "根据id查询规格")
    @GetMapping("/{id}")
    public Result<Spec> getById(@PathVariable Long id){
        return Result.ok(specService.getById(id));
    }
    
    
    @Operation(summary = "查询规格列表")
    @GetMapping("list")
    public Result<List<Spec>> list(){
        return Result.ok(specService.list());
    }
    
    
    @Operation(summary = "保存或更新规格")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Spec dto){
        specService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除规格")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        specService.removeById(id);
        return Result.ok();
    }

}

