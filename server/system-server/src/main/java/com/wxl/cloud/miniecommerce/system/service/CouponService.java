package com.wxl.cloud.miniecommerce.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.system.pagefilter.CouponAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.vo.admin.CouponAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.CouponAdminVO;


/**
 * @ClassName  ：CouponService
 * @description：优惠券服务层接口
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
public interface CouponService extends IService<Coupon> {

    /**
     * @Description 获取广告管理VO
     * @param id
     * @return com.wxl.cloud.miniecommerce.system.vo.admin.CouponAdminVO
     */
    CouponAdminVO getAdminVOById(Long id);

    /**
     * @Description 分页查询优惠券
     * @param page
     * @return com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage<com.wxl.cloud.miniecommerce.model.entity.system.Coupon,com.wxl.cloud.miniecommerce.system.pagefilter.CouponAdminPageFilter>
     */
    BasePage<Coupon, CouponAdminPageFilter> getPageByFilter(BasePage<Coupon, CouponAdminPageFilter> page);


    /**
     * @Description 获取广告管理分页器
     * @param page
     * @return com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage<com.wxl.cloud.miniecommerce.system.vo.admin.CouponAdminVO,com.wxl.cloud.miniecommerce.system.pagefilter.CouponAdminPageFilter>
     */
    BasePage<CouponAdminPageVO, CouponAdminPageFilter> getAdminPageByFilter(BasePage<Coupon, CouponAdminPageFilter> page);
}

