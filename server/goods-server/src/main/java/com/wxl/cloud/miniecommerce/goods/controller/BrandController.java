package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.BrandService;
import com.wxl.cloud.miniecommerce.model.entity.goods.Brand;
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
 * @ClassName  ：BrandContoller
 * @description：品牌Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/brand")
@Tag(name="品牌")
public class BrandController {


    @Autowired
    private BrandService brandService;


    @Operation(summary = "根据id查询品牌")
    @GetMapping("/{id}")
    public Result<Brand> getById(@PathVariable Long id){
        return Result.ok(brandService.getById(id));
    }
    
    
    @Operation(summary = "查询品牌列表")
    @GetMapping("list")
    public Result<List<Brand>> list(){
        return Result.ok(brandService.list());
    }
    
    
    @Operation(summary = "保存或更新品牌")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Brand dto){
        brandService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除品牌")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        brandService.removeById(id);
        return Result.ok();
    }

}

