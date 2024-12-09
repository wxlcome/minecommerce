package com.wxl.cloud.miniecommerce.web.admin.service;

import com.wxl.cloud.miniecommerce.common.pagefilter.system.CouponPageFilter;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.web.admin.vo.system.CouponVO;

/**
 * @InterfaceName  ：CouponAdminService
 * @description    ：自定义接口
 * @author         ：wxl
 * @date           ：2024/12/09 17:05
 */
public interface CouponAdminService {

    /**
     * @Description 分页查询优惠券
     * @param dto
     */
    void saveOrUpdate(Coupon dto);

    /**
     * @Description 分页查询优惠券
     * @param page
     * @return com.wxl.cloud.miniecommerce.model.page.BasePage<com.wxl.cloud.miniecommerce.web.admin.vo.system.CouponVO,com.wxl.cloud.miniecommerce.common.pagefilter.system.CouponPageFilter>
     */
    BasePage<CouponVO, CouponPageFilter> getPageByFilter(BasePage<Coupon, CouponPageFilter> page);

    /**
     * @Description 根据id获取优惠券
     * @param id
     * @return com.wxl.cloud.miniecommerce.web.admin.vo.system.CouponVO
     */
    CouponVO getById(Long id);

    /**
     * @Description 根据id删除优惠券
     * @param id
     */
    void removeById(Long id);
}
