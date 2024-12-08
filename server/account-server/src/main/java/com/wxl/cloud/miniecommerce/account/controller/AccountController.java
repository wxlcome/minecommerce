package com.wxl.cloud.miniecommerce.account.controller;

import com.wxl.cloud.miniecommerce.account.service.AccountService;
import com.wxl.cloud.miniecommerce.model.entity.account.Account;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：AccountContoller
 * @description：账户Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@RestController
@RequestMapping("/account/account")
@Tag(name="账户")
public class AccountController {


    @Autowired
    private AccountService accountService;


    @Operation(summary = "根据id查询账户")
    @GetMapping("/{id}")
    public Result<Account> getById(@PathVariable Long id){
        return Result.ok(accountService.getById(id));
    }
    
    
    @Operation(summary = "查询账户列表")
    @GetMapping("list")
    public Result<List<Account>> list(){
        return Result.ok(accountService.list());
    }
    
    
    @Operation(summary = "保存或更新账户")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Account dto){
        accountService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除账户")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        accountService.removeById(id);
        return Result.ok();
    }

}

