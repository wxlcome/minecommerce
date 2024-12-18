package com.wxl.cloud.miniecommerce.account.controller;

import com.wxl.cloud.miniecommerce.account.service.AccountCartService;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountCart;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：AccountCartContoller
 * @description：账户-购物车Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@RestController
@RequestMapping("/account/accountcart")
@Tag(name="账户-购物车")
public class AccountCartController {


    @Autowired
    private AccountCartService accountCartService;


    @Operation(summary = "根据id查询账户-购物车")
    @GetMapping("/{id}")
    public Result<AccountCart> getById(@PathVariable Long id){
        return Result.ok(accountCartService.getById(id));
    }
    
    
    @Operation(summary = "查询账户-购物车列表")
    @GetMapping("list")
    public Result<List<AccountCart>> list(){
        return Result.ok(accountCartService.list());
    }
    
    
    @Operation(summary = "保存或更新账户-购物车")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody AccountCart dto){
        accountCartService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除账户-购物车")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        accountCartService.removeById(id);
        return Result.ok();
    }

}

