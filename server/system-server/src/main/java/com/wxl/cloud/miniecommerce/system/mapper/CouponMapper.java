package com.wxl.cloud.miniecommerce.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.system.pagefilter.CouponPageFilter;
import org.apache.ibatis.annotations.Mapper;


/**
 * @ClassName  ：CouponMapper
 * @description：优惠券访问层
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Mapper
public interface CouponMapper extends BaseMapper<Coupon> {

    /**
     * @Description 分页查询优惠券
     * @param page
     * @return com.wxl.cloud.miniecommerce.model.page.BasePage<com.wxl.cloud.miniecommerce.model.entity.system.Coupon,com.wxl.cloud.miniecommerce.system.pagefilter.CouponPageFilter>
     */
    BasePage<Coupon, CouponPageFilter> selectPageByFilter(BasePage<Coupon, CouponPageFilter> page);
}

