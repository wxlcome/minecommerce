package com.wxl.cloud.miniecommerce.common.api.system;

import com.wxl.cloud.miniecommerce.common.pagefilter.system.AdvertisementPageFilter;
import com.wxl.cloud.miniecommerce.common.pagefilter.system.CouponPageFilter;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @InterfaceName  ：AdvertisementFeignApi
 * @description    ：自定义接口
 * @author         ：wxl
 * @date           ：2024/12/08 21:47
 */
@FeignClient(name = "me-system", path = "/system/coupon",contextId = "coupon")
public interface CouponFeignApi {


    @Operation(summary = "保存或更新优惠券")
    @PostMapping("saveorupdate")
    Result saveOrUpdate(@RequestBody Coupon dto);

    @Operation(summary = "分页查询优惠券")
    @PostMapping("page")
    Result<BasePage<Coupon, CouponPageFilter>> getPageByFilter(@RequestBody BasePage<Coupon,CouponPageFilter> page);

    @Operation(summary = "根据id查询优惠券")
    @GetMapping("/{id}")
    Result<Coupon> getById(@PathVariable Long id);

    @Operation(summary = "根据id删除优惠券")
    @DeleteMapping("/{id}")
    Result deleteById(@PathVariable Long id);
}
