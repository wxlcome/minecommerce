package com.wxl.cloud.miniecommerce.web.admin.service.impl;


import cn.hutool.core.bean.BeanUtil;
import com.wxl.cloud.miniecommerce.common.api.system.CouponFeignApi;
import com.wxl.cloud.miniecommerce.common.pagefilter.system.CouponPageFilter;
import com.wxl.cloud.miniecommerce.model.entity.system.Coupon;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.web.admin.service.CouponAdminService;
import com.wxl.cloud.miniecommerce.web.admin.vo.system.CouponVO;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：CouponAdminServiceImpl
 * @description：自定义类
 * @author     ：wxl
 * @date       ：2024/12/09 17:06
 */
@RequiredArgsConstructor
@Service
public class CouponAdminServiceImpl implements CouponAdminService {

    private final CouponFeignApi couponFeignApi;

    @Override
    @GlobalTransactional
    public void saveOrUpdate(Coupon dto) {
        couponFeignApi.saveOrUpdate(dto);
    }

    @Override
    public BasePage<CouponVO, CouponPageFilter> getPageByFilter(BasePage<Coupon, CouponPageFilter> page) {
        page = couponFeignApi.getPageByFilter(page).getData();
        BasePage<CouponVO, CouponPageFilter> resultPage = new BasePage<>();
        BeanUtil.copyProperties(page, resultPage,"records");
        resultPage.setRecords(BeanUtil.copyToList(page.getRecords(), CouponVO.class));
        return resultPage;
    }

    @Override
    public CouponVO getById(Long id) {
        Coupon data = couponFeignApi.getById(id).getData();
        CouponVO vo = null;

        if(data != null){
            vo = new CouponVO();
            BeanUtil.copyProperties(data, vo);
        }
        return vo;
    }

    @Override
    @GlobalTransactional
    public void removeById(Long id) {
        couponFeignApi.deleteById(id);
    }
}
