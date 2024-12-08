package com.wxl.cloud.miniecommerce.order.controller;

import com.wxl.cloud.miniecommerce.order.service.RefundBillService;
import com.wxl.cloud.miniecommerce.model.entity.order.RefundBill;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：RefundBillContoller
 * @description：退款单Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@RestController
@RequestMapping("/order/refundbill")
@Tag(name="退款单")
public class RefundBillController {


    @Autowired
    private RefundBillService refundBillService;


    @Operation(summary = "根据id查询退款单")
    @GetMapping("/{id}")
    public Result<RefundBill> getById(@PathVariable Long id){
        return Result.ok(refundBillService.getById(id));
    }
    
    
    @Operation(summary = "查询退款单列表")
    @GetMapping("list")
    public Result<List<RefundBill>> list(){
        return Result.ok(refundBillService.list());
    }
    
    
    @Operation(summary = "保存或更新退款单")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody RefundBill dto){
        refundBillService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除退款单")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        refundBillService.removeById(id);
        return Result.ok();
    }

}

