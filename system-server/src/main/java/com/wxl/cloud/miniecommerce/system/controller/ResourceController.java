package com.wxl.cloud.miniecommerce.system.controller;

import com.wxl.cloud.miniecommerce.common.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.Resource;
import com.wxl.cloud.miniecommerce.system.service.ResourceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：ResourceContoller
 * @description：资源Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/resource")
@Tag(name="资源")
public class ResourceController {


    @Autowired
    private ResourceService resourceService;


    @Operation(summary = "根据id查询资源")
    @GetMapping("/{id}")
    public Result<Resource> getById(@PathVariable Long id){
        return Result.ok(resourceService.getById(id));
    }
    
    
    @Operation(summary = "查询资源列表")
    @GetMapping("list")
    public Result<List<Resource>> list(){
        return Result.ok(resourceService.list());
    }
    
    
    @Operation(summary = "保存或更新资源")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Resource dto){
        resourceService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除资源")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        resourceService.removeById(id);
        return Result.ok();
    }

}

