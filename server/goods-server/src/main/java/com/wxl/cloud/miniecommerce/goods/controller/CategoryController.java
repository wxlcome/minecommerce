package com.wxl.cloud.miniecommerce.goods.controller;

import com.wxl.cloud.miniecommerce.goods.service.CategoryService;
import com.wxl.cloud.miniecommerce.model.entity.goods.Category;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：CategoryContoller
 * @description：分类Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@RestController
@RequestMapping("/goods/category")
@Tag(name="分类")
public class CategoryController {


    @Autowired
    private CategoryService categoryService;


    @Operation(summary = "根据id查询分类")
    @GetMapping("/{id}")
    public Result<Category> getById(@PathVariable Long id){
        return Result.ok(categoryService.getById(id));
    }
    
    
    @Operation(summary = "查询分类列表")
    @GetMapping("list")
    public Result<List<Category>> list(){
        return Result.ok(categoryService.list());
    }
    
    
    @Operation(summary = "保存或更新分类")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Category dto){
        categoryService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除分类")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        categoryService.removeById(id);
        return Result.ok();
    }

}

