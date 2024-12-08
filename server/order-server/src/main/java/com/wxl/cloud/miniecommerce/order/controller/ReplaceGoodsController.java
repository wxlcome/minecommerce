package com.wxl.cloud.miniecommerce.order.controller;

import com.wxl.cloud.miniecommerce.order.service.ReplaceGoodsService;
import com.wxl.cloud.miniecommerce.model.entity.order.ReplaceGoods;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：ReplaceGoodsContoller
 * @description：换货Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@RestController
@RequestMapping("/order/replacegoods")
@Tag(name="换货")
public class ReplaceGoodsController {


    @Autowired
    private ReplaceGoodsService replaceGoodsService;


    @Operation(summary = "根据id查询换货")
    @GetMapping("/{id}")
    public Result<ReplaceGoods> getById(@PathVariable Long id){
        return Result.ok(replaceGoodsService.getById(id));
    }
    
    
    @Operation(summary = "查询换货列表")
    @GetMapping("list")
    public Result<List<ReplaceGoods>> list(){
        return Result.ok(replaceGoodsService.list());
    }
    
    
    @Operation(summary = "保存或更新换货")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody ReplaceGoods dto){
        replaceGoodsService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除换货")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        replaceGoodsService.removeById(id);
        return Result.ok();
    }

}

