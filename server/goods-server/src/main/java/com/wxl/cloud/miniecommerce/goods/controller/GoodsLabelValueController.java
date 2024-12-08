package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.GoodsLabelValueService;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsLabelValue;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：GoodsLabelValueContoller
 * @description：商品标签值Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/goodslabelvalue")
@Tag(name="商品标签值")
public class GoodsLabelValueController {


    @Autowired
    private GoodsLabelValueService goodsLabelValueService;


    @Operation(summary = "根据id查询商品标签值")
    @GetMapping("/{id}")
    public Result<GoodsLabelValue> getById(@PathVariable Long id){
        return Result.ok(goodsLabelValueService.getById(id));
    }
    
    
    @Operation(summary = "查询商品标签值列表")
    @GetMapping("list")
    public Result<List<GoodsLabelValue>> list(){
        return Result.ok(goodsLabelValueService.list());
    }
    
    
    @Operation(summary = "保存或更新商品标签值")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody GoodsLabelValue dto){
        goodsLabelValueService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除商品标签值")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        goodsLabelValueService.removeById(id);
        return Result.ok();
    }

}

