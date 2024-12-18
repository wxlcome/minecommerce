package com.wxl.cloud.miniecommerce.common.api.system;


import org.springframework.cloud.openfeign.FeignClient;


/**
 * @InterfaceName  ：AdvertisementFeignApi
 * @description    ：自定义接口
 * @author         ：wxl
 * @date           ：2024/12/08 21:47
 */
@FeignClient(name = "me-system", path = "/system/coupon",contextId = "coupon")
public interface CouponFeignApi {


}



