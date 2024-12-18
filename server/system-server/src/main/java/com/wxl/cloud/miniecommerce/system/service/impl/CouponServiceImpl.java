package com.wxl.cloud.miniecommerce.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.system.mapper.CouponMapper;
import com.wxl.cloud.miniecommerce.system.pagefilter.CouponAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.service.CouponService;
import com.wxl.cloud.miniecommerce.system.vo.admin.CouponAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.CouponAdminVO;
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
    public CouponAdminVO getAdminVOById(Long id) {
        Coupon entity = this.getById(id);
        CouponAdminVO vo = null;
        if (entity != null) {
            vo = new CouponAdminVO();
            BeanUtil.copyProperties(entity, vo);
        }
        return vo;
    }

    @Override
    public BasePage<Coupon, CouponAdminPageFilter> getPageByFilter(BasePage<Coupon, CouponAdminPageFilter> page) {
        return baseMapper.selectPageByFilter(page);
    }

    @Override
    public BasePage<CouponAdminPageVO, CouponAdminPageFilter> getAdminPageByFilter(BasePage<Coupon, CouponAdminPageFilter> page) {
        page = baseMapper.selectPageByFilter(page);
        BasePage<CouponAdminPageVO, CouponAdminPageFilter> resultPage = new BasePage<>();
        BeanUtil.copyProperties(page, resultPage, "records");
        resultPage.setRecords(BeanUtil.copyToList(page.getRecords(), CouponAdminPageVO.class));
        return resultPage;
    }
}
