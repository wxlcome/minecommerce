package com.wxl.cloud.miniecommerce.order.controller;

import com.wxl.cloud.miniecommerce.order.service.OrderService;
import com.wxl.cloud.miniecommerce.model.entity.order.Order;
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
 * @ClassName  ：OrderContoller
 * @description：订单Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@RestController
@RequestMapping("/order/order")
@Tag(name="订单")
public class OrderController {


    @Autowired
    private OrderService orderService;


    @Operation(summary = "根据id查询订单")
    @GetMapping("/{id}")
    public Result<Order> getById(@PathVariable Long id){
        return Result.ok(orderService.getById(id));
    }
    
    
    @Operation(summary = "查询订单列表")
    @GetMapping("list")
    public Result<List<Order>> list(){
        return Result.ok(orderService.list());
    }
    
    
    @Operation(summary = "保存或更新订单")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Order dto){
        orderService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除订单")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        orderService.removeById(id);
        return Result.ok();
    }

}

