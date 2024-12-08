package com.wxl.cloud.miniecommerce.common.api.system;

import com.wxl.cloud.miniecommerce.common.pagefilter.system.AdvertisementPageFilter;
import com.wxl.cloud.miniecommerce.model.enums.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
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
@FeignClient(name = "me-system", path = "/system/advertisement")
public interface AdvertisementFeignApi {


    @Operation(summary = "保存或更新广告")
    @PostMapping("/saveorupdate")
    Result saveOrUpdate(@RequestBody Advertisement dto);

    @Operation(summary = "分页查询广告")
    @PostMapping("page")
    Result<BasePage<Advertisement, AdvertisementPageFilter>> getPageByFilter(@RequestBody BasePage<Advertisement,AdvertisementPageFilter> page);

    @Operation(summary = "根据id查询广告")
    @GetMapping("/{id}")
    Result<Advertisement> getById(@PathVariable Long id);

    @Operation(summary = "根据id删除广告")
    @DeleteMapping("/{id}")
    Result deleteById(@PathVariable Long id);

}
