package com.wxl.cloud.miniecommerce.system.controller.advertisement;


import com.wxl.cloud.miniecommerce.common.util.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.system.pagefilter.AdvertisementAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.service.AdvertisementService;
import io.seata.spring.annotation.GlobalTransactional;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：AdvertisementContoller
 * @description：广告Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/advertisement")
@Tag(name="广告")
public class AdvertisementController {


    @Autowired
    private AdvertisementService advertisementService;


    @Operation(summary = "根据id查询广告")
    @GetMapping("/{id}")
    public Result<Advertisement> getById(@PathVariable Long id){
        return Result.ok(advertisementService.getById(id));
    }
    
    
    @Operation(summary = "查询广告列表")
    @GetMapping("list")
    public Result<List<Advertisement>> list(){
        return Result.ok(advertisementService.list());
    }

    @Operation(summary = "分页查询广告")
    @PostMapping("page")
    public Result<BasePage<Advertisement, AdvertisementAdminPageFilter>> getPageByFilter(@RequestBody BasePage<Advertisement, AdvertisementAdminPageFilter> page){
        return Result.ok(advertisementService.getPageByFilter(page));
    }
    
    
    @Operation(summary = "保存或更新广告")
    @GlobalTransactional
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Advertisement dto){
        advertisementService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除广告")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        advertisementService.removeById(id);
        return Result.ok();
    }


}

