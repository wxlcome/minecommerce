package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.GoodsSpecGroupService;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsSpecGroup;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：GoodsSpecGroupContoller
 * @description：商品规格组Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/goodsspecgroup")
@Tag(name="商品规格组")
public class GoodsSpecGroupController {


    @Autowired
    private GoodsSpecGroupService goodsSpecGroupService;


    @Operation(summary = "根据id查询商品规格组")
    @GetMapping("/{id}")
    public Result<GoodsSpecGroup> getById(@PathVariable Long id){
        return Result.ok(goodsSpecGroupService.getById(id));
    }
    
    
    @Operation(summary = "查询商品规格组列表")
    @GetMapping("list")
    public Result<List<GoodsSpecGroup>> list(){
        return Result.ok(goodsSpecGroupService.list());
    }
    
    
    @Operation(summary = "保存或更新商品规格组")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody GoodsSpecGroup dto){
        goodsSpecGroupService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除商品规格组")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        goodsSpecGroupService.removeById(id);
        return Result.ok();
    }

}

