package com.wxl.cloud.miniecommerce.order.controller;

import com.wxl.cloud.miniecommerce.order.service.OrderGoodsService;
import com.wxl.cloud.miniecommerce.model.entity.order.OrderGoods;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：OrderGoodsContoller
 * @description：订单-商品Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@RestController
@RequestMapping("/order/ordergoods")
@Tag(name="订单-商品")
public class OrderGoodsController {


    @Autowired
    private OrderGoodsService orderGoodsService;


    @Operation(summary = "根据id查询订单-商品")
    @GetMapping("/{id}")
    public Result<OrderGoods> getById(@PathVariable Long id){
        return Result.ok(orderGoodsService.getById(id));
    }
    
    
    @Operation(summary = "查询订单-商品列表")
    @GetMapping("list")
    public Result<List<OrderGoods>> list(){
        return Result.ok(orderGoodsService.list());
    }
    
    
    @Operation(summary = "保存或更新订单-商品")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody OrderGoods dto){
        orderGoodsService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除订单-商品")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        orderGoodsService.removeById(id);
        return Result.ok();
    }

}

