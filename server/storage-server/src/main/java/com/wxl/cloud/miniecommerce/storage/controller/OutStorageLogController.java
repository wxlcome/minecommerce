package com.wxl.cloud.miniecommerce.storage.controller;

import com.wxl.cloud.miniecommerce.storage.service.OutStorageLogService;
import com.wxl.cloud.miniecommerce.model.entity.storage.OutStorageLog;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：OutStorageLogContoller
 * @description：出库日志Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@RestController
@RequestMapping("/storage/outstoragelog")
@Tag(name="出库日志")
public class OutStorageLogController {


    @Autowired
    private OutStorageLogService outStorageLogService;


    @Operation(summary = "根据id查询出库日志")
    @GetMapping("/{id}")
    public Result<OutStorageLog> getById(@PathVariable Long id){
        return Result.ok(outStorageLogService.getById(id));
    }
    
    
    @Operation(summary = "查询出库日志列表")
    @GetMapping("list")
    public Result<List<OutStorageLog>> list(){
        return Result.ok(outStorageLogService.list());
    }
    
    
    @Operation(summary = "保存或更新出库日志")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody OutStorageLog dto){
        outStorageLogService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除出库日志")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        outStorageLogService.removeById(id);
        return Result.ok();
    }

}

