package com.wxl.cloud.miniecommerce.order.controller;

import com.wxl.cloud.miniecommerce.order.service.RefundGoodsService;
import com.wxl.cloud.miniecommerce.model.entity.order.RefundGoods;
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
 * @ClassName  ：RefundGoodsContoller
 * @description：退款货物Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@RestController
@RequestMapping("/order/refundgoods")
@Tag(name="退款货物")
public class RefundGoodsController {


    @Autowired
    private RefundGoodsService refundGoodsService;


    @Operation(summary = "根据id查询退款货物")
    @GetMapping("/{id}")
    public Result<RefundGoods> getById(@PathVariable Long id){
        return Result.ok(refundGoodsService.getById(id));
    }
    
    
    @Operation(summary = "查询退款货物列表")
    @GetMapping("list")
    public Result<List<RefundGoods>> list(){
        return Result.ok(refundGoodsService.list());
    }
    
    
    @Operation(summary = "保存或更新退款货物")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody RefundGoods dto){
        refundGoodsService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除退款货物")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        refundGoodsService.removeById(id);
        return Result.ok();
    }

}

