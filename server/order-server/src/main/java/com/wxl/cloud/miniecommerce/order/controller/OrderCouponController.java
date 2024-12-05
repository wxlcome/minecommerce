package com.wxl.cloud.miniecommerce.order.controller;

import com.wxl.cloud.miniecommerce.order.service.OrderCouponService;
import com.wxl.cloud.miniecommerce.model.entity.order.OrderCoupon;
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
 * @ClassName  ：OrderCouponContoller
 * @description：订单-优惠券Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@RestController
@RequestMapping("/order/ordercoupon")
@Tag(name="订单-优惠券")
public class OrderCouponController {


    @Autowired
    private OrderCouponService orderCouponService;


    @Operation(summary = "根据id查询订单-优惠券")
    @GetMapping("/{id}")
    public Result<OrderCoupon> getById(@PathVariable Long id){
        return Result.ok(orderCouponService.getById(id));
    }
    
    
    @Operation(summary = "查询订单-优惠券列表")
    @GetMapping("list")
    public Result<List<OrderCoupon>> list(){
        return Result.ok(orderCouponService.list());
    }
    
    
    @Operation(summary = "保存或更新订单-优惠券")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody OrderCoupon dto){
        orderCouponService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除订单-优惠券")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        orderCouponService.removeById(id);
        return Result.ok();
    }

}

