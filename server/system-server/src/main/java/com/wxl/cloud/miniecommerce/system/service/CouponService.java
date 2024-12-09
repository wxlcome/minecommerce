package com.wxl.cloud.miniecommerce.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.system.pagefilter.CouponPageFilter;


/**
 * @ClassName  ：CouponService
 * @description：优惠券服务层接口
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
public interface CouponService extends IService<Coupon> {

    /**
     * @Description 分页查询优惠券
     * @param page
     * @return com.wxl.cloud.miniecommerce.model.page.BasePage<com.wxl.cloud.miniecommerce.model.entity.system.Coupon,com.wxl.cloud.miniecommerce.system.pagefilter.CouponPageFilter>
     */
    BasePage<Coupon, CouponPageFilter> getPageByFilter(BasePage<Coupon, CouponPageFilter> page);
}

