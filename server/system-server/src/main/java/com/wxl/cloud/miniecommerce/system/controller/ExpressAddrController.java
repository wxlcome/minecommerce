package com.wxl.cloud.miniecommerce.system.controller;

import com.wxl.cloud.miniecommerce.common.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressAddr;
import com.wxl.cloud.miniecommerce.system.service.ExpressAddrService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：ExpressAddrContoller
 * @description：快递地址信息Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/expressaddr")
@Tag(name="快递地址信息")
public class ExpressAddrController {


    @Autowired
    private ExpressAddrService expressAddrService;


    @Operation(summary = "根据id查询快递地址信息")
    @GetMapping("/{id}")
    public Result<ExpressAddr> getById(@PathVariable Long id){
        return Result.ok(expressAddrService.getById(id));
    }
    
    
    @Operation(summary = "查询快递地址信息列表")
    @GetMapping("list")
    public Result<List<ExpressAddr>> list(){
        return Result.ok(expressAddrService.list());
    }
    
    
    @Operation(summary = "保存或更新快递地址信息")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody ExpressAddr dto){
        expressAddrService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除快递地址信息")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        expressAddrService.removeById(id);
        return Result.ok();
    }

}

