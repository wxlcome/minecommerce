package com.wxl.cloud.miniecommerce.storage.controller;

import com.wxl.cloud.miniecommerce.storage.service.StorageService;
import com.wxl.cloud.miniecommerce.model.entity.storage.Storage;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：StorageContoller
 * @description：库存Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@RestController
@RequestMapping("/storage/storage")
@Tag(name="库存")
public class StorageController {


    @Autowired
    private StorageService storageService;


    @Operation(summary = "根据id查询库存")
    @GetMapping("/{id}")
    public Result<Storage> getById(@PathVariable Long id){
        return Result.ok(storageService.getById(id));
    }
    
    
    @Operation(summary = "查询库存列表")
    @GetMapping("list")
    public Result<List<Storage>> list(){
        return Result.ok(storageService.list());
    }
    
    
    @Operation(summary = "保存或更新库存")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Storage dto){
        storageService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除库存")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        storageService.removeById(id);
        return Result.ok();
    }

}

