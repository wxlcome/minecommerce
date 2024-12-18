package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.LabelValueService;
import com.wxl.cloud.miniecommerce.model.entity.goods.LabelValue;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：LabelValueContoller
 * @description：标签值Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/labelvalue")
@Tag(name="标签值")
public class LabelValueController {


    @Autowired
    private LabelValueService labelValueService;


    @Operation(summary = "根据id查询标签值")
    @GetMapping("/{id}")
    public Result<LabelValue> getById(@PathVariable Long id){
        return Result.ok(labelValueService.getById(id));
    }
    
    
    @Operation(summary = "查询标签值列表")
    @GetMapping("list")
    public Result<List<LabelValue>> list(){
        return Result.ok(labelValueService.list());
    }
    
    
    @Operation(summary = "保存或更新标签值")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody LabelValue dto){
        labelValueService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除标签值")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        labelValueService.removeById(id);
        return Result.ok();
    }

}

