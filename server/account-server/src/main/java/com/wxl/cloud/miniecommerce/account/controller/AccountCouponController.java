package com.wxl.cloud.miniecommerce.account.controller;

import com.wxl.cloud.miniecommerce.account.service.AccountCouponService;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountCoupon;
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
 * @ClassName  ：AccountCouponContoller
 * @description：账户-优惠券Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@RestController
@RequestMapping("/account/accountcoupon")
@Tag(name="账户-优惠券")
public class AccountCouponController {


    @Autowired
    private AccountCouponService accountCouponService;


    @Operation(summary = "根据id查询账户-优惠券")
    @GetMapping("/{id}")
    public Result<AccountCoupon> getById(@PathVariable Long id){
        return Result.ok(accountCouponService.getById(id));
    }
    
    
    @Operation(summary = "查询账户-优惠券列表")
    @GetMapping("list")
    public Result<List<AccountCoupon>> list(){
        return Result.ok(accountCouponService.list());
    }
    
    
    @Operation(summary = "保存或更新账户-优惠券")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody AccountCoupon dto){
        accountCouponService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除账户-优惠券")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        accountCouponService.removeById(id);
        return Result.ok();
    }

}

