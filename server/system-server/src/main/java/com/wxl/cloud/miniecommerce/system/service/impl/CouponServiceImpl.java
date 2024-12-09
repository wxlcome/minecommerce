package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.system.mapper.CouponMapper;
import com.wxl.cloud.miniecommerce.system.pagefilter.CouponPageFilter;
import com.wxl.cloud.miniecommerce.system.service.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：CouponServiceImpl
 * @description：优惠券服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements CouponService {

    @Override
    public BasePage<Coupon, CouponPageFilter> getPageByFilter(BasePage<Coupon, CouponPageFilter> page) {
        return baseMapper.selectPageByFilter(page);
    }
}
