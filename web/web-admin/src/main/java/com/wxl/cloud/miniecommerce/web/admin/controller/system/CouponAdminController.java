package com.wxl.cloud.miniecommerce.web.admin.controller.system;


import com.wxl.cloud.miniecommerce.common.pagefilter.system.AdvertisementPageFilter;
import com.wxl.cloud.miniecommerce.common.pagefilter.system.CouponPageFilter;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.web.admin.service.AdvertisementAdminService;
import com.wxl.cloud.miniecommerce.web.admin.service.CouponAdminService;
import com.wxl.cloud.miniecommerce.web.admin.vo.system.AdvertisementAdminVO;
import com.wxl.cloud.miniecommerce.web.admin.vo.system.CouponVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName  ：CouponAdminController
 * @description：优惠券管理
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/admin/system/coupon")
@Tag(name="优惠券管理")
public class CouponAdminController {

    @Autowired
    private CouponAdminService adminService;

    @Operation(summary = "保存或更新广告")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Coupon dto){
        adminService.saveOrUpdate(dto);
        return Result.ok();
    }

    @Operation(summary = "分页查询优惠券")
    @PostMapping("page")
    public Result<BasePage<CouponVO, CouponPageFilter>> getPageByFilter(@RequestBody BasePage<Coupon,CouponPageFilter> page){
        return Result.ok(adminService.getPageByFilter(page));
    }

    @Operation(summary = "根据id查询优惠券")
    @GetMapping("/{id}")
    public Result<CouponVO> getById(@PathVariable Long id){
        return Result.ok(adminService.getById(id));
    }

    @Operation(summary = "根据id删除优惠券")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        adminService.removeById(id);
        return Result.ok();
    }

}

