package com.wxl.cloud.miniecommerce.web.admin.controller.system;


import com.wxl.cloud.miniecommerce.common.pagefilter.system.AdvertisementPageFilter;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.web.admin.service.AdvertisementAdminService;
import com.wxl.cloud.miniecommerce.web.admin.vo.system.AdvertisementAdminVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName  ：AdvertisementContoller
 * @description：广告管理
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/admin/system/advertisement")
@Tag(name="广告管理")
public class AdvertisementAdminController {

    @Autowired
    private AdvertisementAdminService adminService;

    @Operation(summary = "保存或更新广告")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Advertisement dto){
        adminService.saveOrUpdate(dto);
        return Result.ok();
    }

    @Operation(summary = "分页查询广告")
    @PostMapping("page")
    public Result<BasePage<AdvertisementAdminVO, AdvertisementPageFilter>> getPageByFilter(@RequestBody BasePage<Advertisement, AdvertisementPageFilter> page){
        return Result.ok(adminService.getPageByFilter(page));
    }

    @Operation(summary = "根据id查询广告")
    @GetMapping("/{id}")
    public Result<AdvertisementAdminVO> getById(@PathVariable Long id){
        return Result.ok(adminService.getById(id));
    }

    @Operation(summary = "根据id删除广告")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        adminService.deleteById(id);
        return Result.ok();
    }

}

