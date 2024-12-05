package com.wxl.cloud.miniecommerce.storage.controller;

import com.wxl.cloud.miniecommerce.storage.service.InStorageLogService;
import com.wxl.cloud.miniecommerce.model.entity.storage.InStorageLog;
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
 * @ClassName  ：InStorageLogContoller
 * @description：入库日志Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@RestController
@RequestMapping("/storage/instoragelog")
@Tag(name="入库日志")
public class InStorageLogController {


    @Autowired
    private InStorageLogService inStorageLogService;


    @Operation(summary = "根据id查询入库日志")
    @GetMapping("/{id}")
    public Result<InStorageLog> getById(@PathVariable Long id){
        return Result.ok(inStorageLogService.getById(id));
    }
    
    
    @Operation(summary = "查询入库日志列表")
    @GetMapping("list")
    public Result<List<InStorageLog>> list(){
        return Result.ok(inStorageLogService.list());
    }
    
    
    @Operation(summary = "保存或更新入库日志")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody InStorageLog dto){
        inStorageLogService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除入库日志")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        inStorageLogService.removeById(id);
        return Result.ok();
    }

}

