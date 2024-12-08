package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.GoodsSpecGroupDataService;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsSpecGroupData;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：GoodsSpecGroupDataContoller
 * @description：商品规格组数据Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/goodsspecgroupdata")
@Tag(name="商品规格组数据")
public class GoodsSpecGroupDataController {


    @Autowired
    private GoodsSpecGroupDataService goodsSpecGroupDataService;


    @Operation(summary = "根据id查询商品规格组数据")
    @GetMapping("/{id}")
    public Result<GoodsSpecGroupData> getById(@PathVariable Long id){
        return Result.ok(goodsSpecGroupDataService.getById(id));
    }
    
    
    @Operation(summary = "查询商品规格组数据列表")
    @GetMapping("list")
    public Result<List<GoodsSpecGroupData>> list(){
        return Result.ok(goodsSpecGroupDataService.list());
    }
    
    
    @Operation(summary = "保存或更新商品规格组数据")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody GoodsSpecGroupData dto){
        goodsSpecGroupDataService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除商品规格组数据")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        goodsSpecGroupDataService.removeById(id);
        return Result.ok();
    }

}

