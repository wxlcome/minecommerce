package com.wxl.cloud.miniecommerce.storage.controller;

import com.wxl.cloud.miniecommerce.storage.service.WarehouseService;
import com.wxl.cloud.miniecommerce.model.entity.storage.Warehouse;
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
 * @ClassName  ：WarehouseContoller
 * @description：仓库Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@RestController
@RequestMapping("/storage/warehouse")
@Tag(name="仓库")
public class WarehouseController {


    @Autowired
    private WarehouseService warehouseService;


    @Operation(summary = "根据id查询仓库")
    @GetMapping("/{id}")
    public Result<Warehouse> getById(@PathVariable Long id){
        return Result.ok(warehouseService.getById(id));
    }
    
    
    @Operation(summary = "查询仓库列表")
    @GetMapping("list")
    public Result<List<Warehouse>> list(){
        return Result.ok(warehouseService.list());
    }
    
    
    @Operation(summary = "保存或更新仓库")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Warehouse dto){
        warehouseService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除仓库")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        warehouseService.removeById(id);
        return Result.ok();
    }

}

