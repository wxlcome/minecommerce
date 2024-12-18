package com.wxl.cloud.miniecommerce.system.controller.coupon;


import com.wxl.cloud.miniecommerce.common.util.http.Result;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.system.pagefilter.CouponAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.service.CouponService;
import com.wxl.cloud.miniecommerce.system.vo.admin.CouponAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.CouponAdminVO;
import io.seata.spring.annotation.GlobalTransactional;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName  ：CouponContoller
 * @description：优惠券管理
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/coupon/admin")
@Tag(name="优惠券管理")
public class CouponAdminController {


    @Autowired
    private CouponService couponService;


    @Operation(summary = "根据id查询优惠券")
    @GetMapping("/{id}")
    public Result<CouponAdminVO> getById(@PathVariable Long id){
        return Result.ok(couponService.getAdminVOById(id));
    }

    @Operation(summary = "分页查询优惠券")
    @PostMapping("page")
    public Result<BasePage<CouponAdminPageVO, CouponAdminPageFilter>> getAdminPageByFilter(@RequestBody BasePage<Coupon, CouponAdminPageFilter> page){
        return Result.ok(couponService.getAdminPageByFilter(page));
    }

    @Operation(summary = "保存或更新优惠券")
    @GlobalTransactional
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody Coupon dto){
        couponService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除优惠券")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        couponService.removeById(id);
        return Result.ok();
    }

}

