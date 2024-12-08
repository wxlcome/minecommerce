package com.wxl.cloud.miniecommerce.system.controller;

import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressCompany;
import com.wxl.cloud.miniecommerce.system.service.ExpressCompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：ExpressCompanyContoller
 * @description：快递公司Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/expresscompany")
@Tag(name="快递公司")
public class ExpressCompanyController {


    @Autowired
    private ExpressCompanyService expressCompanyService;


    @Operation(summary = "根据id查询快递公司")
    @GetMapping("/{id}")
    public Result<ExpressCompany> getById(@PathVariable Long id){
        return Result.ok(expressCompanyService.getById(id));
    }
    
    
    @Operation(summary = "查询快递公司列表")
    @GetMapping("list")
    public Result<List<ExpressCompany>> list(){
        return Result.ok(expressCompanyService.list());
    }
    
    
    @Operation(summary = "保存或更新快递公司")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody ExpressCompany dto){
        expressCompanyService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除快递公司")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        expressCompanyService.removeById(id);
        return Result.ok();
    }

}

