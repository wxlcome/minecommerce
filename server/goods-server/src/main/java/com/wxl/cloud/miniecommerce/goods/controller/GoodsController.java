package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.GoodsService;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.goods.Goods;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：GoodsContoller
 * @description：商品Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/goods")
@Tag(name="商品")
public class GoodsController {


    @Autowired
    private GoodsService goodsService;


    @Operation(summary = "根据id查询商品")
    @GetMapping("/{id}")
    public Result<Goods> getById(@PathVariable Long id){
        return Result.ok(goodsService.getById(id));
    }
    
    
    @Operation(summary = "查询商品列表")
    @GetMapping("list")
    public Result<List<Goods>> list(){
        return Result.ok(goodsService.list());
    }
    
    
    @Operation(summary = "保存或更新商品")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Goods dto){
        goodsService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除商品")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        goodsService.removeById(id);
        return Result.ok();
    }

}

