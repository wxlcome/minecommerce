package com.wxl.cloud.miniecommerce.account.controller;

import com.wxl.cloud.miniecommerce.account.service.AccountAddressService;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountAddress;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：AccountAddressContoller
 * @description：账户-地址Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@RestController
@RequestMapping("/account/accountaddress")
@Tag(name="账户-地址")
public class AccountAddressController {


    @Autowired
    private AccountAddressService accountAddressService;


    @Operation(summary = "根据id查询账户-地址")
    @GetMapping("/{id}")
    public Result<AccountAddress> getById(@PathVariable Long id){
        return Result.ok(accountAddressService.getById(id));
    }
    
    
    @Operation(summary = "查询账户-地址列表")
    @GetMapping("list")
    public Result<List<AccountAddress>> list(){
        return Result.ok(accountAddressService.list());
    }
    
    
    @Operation(summary = "保存或更新账户-地址")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody AccountAddress dto){
        accountAddressService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除账户-地址")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        accountAddressService.removeById(id);
        return Result.ok();
    }

}

