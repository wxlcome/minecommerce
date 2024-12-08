package com.wxl.cloud.miniecommerce.system.controller;

import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.Paymethod;
import com.wxl.cloud.miniecommerce.system.service.PaymethodService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：PaymethodContoller
 * @description：支付方式Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/paymethod")
@Tag(name="支付方式")
public class PaymethodController {


    @Autowired
    private PaymethodService paymethodService;


    @Operation(summary = "根据id查询支付方式")
    @GetMapping("/{id}")
    public Result<Paymethod> getById(@PathVariable Long id){
        return Result.ok(paymethodService.getById(id));
    }
    
    
    @Operation(summary = "查询支付方式列表")
    @GetMapping("list")
    public Result<List<Paymethod>> list(){
        return Result.ok(paymethodService.list());
    }
    
    
    @Operation(summary = "保存或更新支付方式")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Paymethod dto){
        paymethodService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除支付方式")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        paymethodService.removeById(id);
        return Result.ok();
    }

}

