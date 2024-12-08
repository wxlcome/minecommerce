package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.LabelService;
import com.wxl.cloud.miniecommerce.model.entity.goods.Label;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：LabelContoller
 * @description：标签Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/label")
@Tag(name="标签")
public class LabelController {


    @Autowired
    private LabelService labelService;


    @Operation(summary = "根据id查询标签")
    @GetMapping("/{id}")
    public Result<Label> getById(@PathVariable Long id){
        return Result.ok(labelService.getById(id));
    }
    
    
    @Operation(summary = "查询标签列表")
    @GetMapping("list")
    public Result<List<Label>> list(){
        return Result.ok(labelService.list());
    }
    
    
    @Operation(summary = "保存或更新标签")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Label dto){
        labelService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除标签")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        labelService.removeById(id);
        return Result.ok();
    }

}

