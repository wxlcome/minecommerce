package com.wxl.cloud.miniecommerce.account.controller;

import com.wxl.cloud.miniecommerce.account.service.AccountPaymethodService;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountPaymethod;
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
 * @ClassName  ：AccountPaymethodContoller
 * @description：账户-支付方式Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@RestController
@RequestMapping("/account/accountpaymethod")
@Tag(name="账户-支付方式")
public class AccountPaymethodController {


    @Autowired
    private AccountPaymethodService accountPaymethodService;


    @Operation(summary = "根据id查询账户-支付方式")
    @GetMapping("/{id}")
    public Result<AccountPaymethod> getById(@PathVariable Long id){
        return Result.ok(accountPaymethodService.getById(id));
    }
    
    
    @Operation(summary = "查询账户-支付方式列表")
    @GetMapping("list")
    public Result<List<AccountPaymethod>> list(){
        return Result.ok(accountPaymethodService.list());
    }
    
    
    @Operation(summary = "保存或更新账户-支付方式")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody AccountPaymethod dto){
        accountPaymethodService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除账户-支付方式")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        accountPaymethodService.removeById(id);
        return Result.ok();
    }

}

