package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.GoodsParamValueService;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsParamValue;
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
 * @ClassName  ：GoodsParamValueContoller
 * @description：商品参数值Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/goodsparamvalue")
@Tag(name="商品参数值")
public class GoodsParamValueController {


    @Autowired
    private GoodsParamValueService goodsParamValueService;


    @Operation(summary = "根据id查询商品参数值")
    @GetMapping("/{id}")
    public Result<GoodsParamValue> getById(@PathVariable Long id){
        return Result.ok(goodsParamValueService.getById(id));
    }
    
    
    @Operation(summary = "查询商品参数值列表")
    @GetMapping("list")
    public Result<List<GoodsParamValue>> list(){
        return Result.ok(goodsParamValueService.list());
    }
    
    
    @Operation(summary = "保存或更新商品参数值")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody GoodsParamValue dto){
        goodsParamValueService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除商品参数值")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        goodsParamValueService.removeById(id);
        return Result.ok();
    }

}

