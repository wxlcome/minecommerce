package com.wxl.cloud.miniecommerce.account.controller;

import com.wxl.cloud.miniecommerce.account.service.AccountFavorService;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountFavor;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：AccountFavorContoller
 * @description：账户-收藏Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@RestController
@RequestMapping("/account/accountfavor")
@Tag(name="账户-收藏")
public class AccountFavorController {


    @Autowired
    private AccountFavorService accountFavorService;


    @Operation(summary = "根据id查询账户-收藏")
    @GetMapping("/{id}")
    public Result<AccountFavor> getById(@PathVariable Long id){
        return Result.ok(accountFavorService.getById(id));
    }
    
    
    @Operation(summary = "查询账户-收藏列表")
    @GetMapping("list")
    public Result<List<AccountFavor>> list(){
        return Result.ok(accountFavorService.list());
    }
    
    
    @Operation(summary = "保存或更新账户-收藏")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody AccountFavor dto){
        accountFavorService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除账户-收藏")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        accountFavorService.removeById(id);
        return Result.ok();
    }

}

