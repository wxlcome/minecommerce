package com.wxl.cloud.miniecommerce.order.controller;

import com.wxl.cloud.miniecommerce.order.service.PostSaleBillService;
import com.wxl.cloud.miniecommerce.model.entity.order.PostSaleBill;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @ClassName  ：PostSaleBillContoller
 * @description：售后单Controller
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@RestController
@RequestMapping("/order/postsalebill")
@Tag(name="售后单")
public class PostSaleBillController {


    @Autowired
    private PostSaleBillService postSaleBillService;


    @Operation(summary = "根据id查询售后单")
    @GetMapping("/{id}")
    public Result<PostSaleBill> getById(@PathVariable Long id){
        return Result.ok(postSaleBillService.getById(id));
    }
    
    
    @Operation(summary = "查询售后单列表")
    @GetMapping("list")
    public Result<List<PostSaleBill>> list(){
        return Result.ok(postSaleBillService.list());
    }
    
    
    @Operation(summary = "保存或更新售后单")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody PostSaleBill dto){
        postSaleBillService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除售后单")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        postSaleBillService.removeById(id);
        return Result.ok();
    }

}

