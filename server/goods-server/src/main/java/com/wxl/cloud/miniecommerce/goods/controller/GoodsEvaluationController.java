package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.GoodsEvaluationService;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsEvaluation;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：GoodsEvaluationContoller
 * @description：商品-评价Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/goodsevaluation")
@Tag(name="商品-评价")
public class GoodsEvaluationController {


    @Autowired
    private GoodsEvaluationService goodsEvaluationService;


    @Operation(summary = "根据id查询商品-评价")
    @GetMapping("/{id}")
    public Result<GoodsEvaluation> getById(@PathVariable Long id){
        return Result.ok(goodsEvaluationService.getById(id));
    }
    
    
    @Operation(summary = "查询商品-评价列表")
    @GetMapping("list")
    public Result<List<GoodsEvaluation>> list(){
        return Result.ok(goodsEvaluationService.list());
    }
    
    
    @Operation(summary = "保存或更新商品-评价")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody GoodsEvaluation dto){
        goodsEvaluationService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除商品-评价")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        goodsEvaluationService.removeById(id);
        return Result.ok();
    }

}

