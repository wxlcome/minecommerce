package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.GoodsSpecValueService;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsSpecValue;
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
 * @ClassName  ：GoodsSpecValueContoller
 * @description：商品规格值Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/goodsspecvalue")
@Tag(name="商品规格值")
public class GoodsSpecValueController {


    @Autowired
    private GoodsSpecValueService goodsSpecValueService;


    @Operation(summary = "根据id查询商品规格值")
    @GetMapping("/{id}")
    public Result<GoodsSpecValue> getById(@PathVariable Long id){
        return Result.ok(goodsSpecValueService.getById(id));
    }
    
    
    @Operation(summary = "查询商品规格值列表")
    @GetMapping("list")
    public Result<List<GoodsSpecValue>> list(){
        return Result.ok(goodsSpecValueService.list());
    }
    
    
    @Operation(summary = "保存或更新商品规格值")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody GoodsSpecValue dto){
        goodsSpecValueService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除商品规格值")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        goodsSpecValueService.removeById(id);
        return Result.ok();
    }

}

