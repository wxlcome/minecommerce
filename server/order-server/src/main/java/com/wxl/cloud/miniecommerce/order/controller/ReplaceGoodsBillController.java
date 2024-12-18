package com.wxl.cloud.miniecommerce.order.controller;

import com.wxl.cloud.miniecommerce.order.service.ReplaceGoodsBillService;
import com.wxl.cloud.miniecommerce.model.entity.order.ReplaceGoodsBill;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：ReplaceGoodsBillContoller
 * @description：换货单Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@RestController
@RequestMapping("/order/replacegoodsbill")
@Tag(name="换货单")
public class ReplaceGoodsBillController {


    @Autowired
    private ReplaceGoodsBillService replaceGoodsBillService;


    @Operation(summary = "根据id查询换货单")
    @GetMapping("/{id}")
    public Result<ReplaceGoodsBill> getById(@PathVariable Long id){
        return Result.ok(replaceGoodsBillService.getById(id));
    }
    
    
    @Operation(summary = "查询换货单列表")
    @GetMapping("list")
    public Result<List<ReplaceGoodsBill>> list(){
        return Result.ok(replaceGoodsBillService.list());
    }
    
    
    @Operation(summary = "保存或更新换货单")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody ReplaceGoodsBill dto){
        replaceGoodsBillService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除换货单")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        replaceGoodsBillService.removeById(id);
        return Result.ok();
    }

}

