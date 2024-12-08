package com.wxl.cloud.miniecommerce.web.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.wxl.cloud.miniecommerce.common.api.system.AdvertisementFeignApi;
import com.wxl.cloud.miniecommerce.common.pagefilter.system.AdvertisementPageFilter;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.web.admin.service.AdvertisementAdminService;
import com.wxl.cloud.miniecommerce.web.admin.vo.system.AdvertisementAdminVO;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @ClassName  ：AdvertisementAdminServiceImpl
 * @description：自定义类
 * @author     ：wxl
 * @date       ：2024/12/08 21:45
 */
@Component
@RequiredArgsConstructor
public class AdvertisementAdminServiceImpl implements AdvertisementAdminService {

    private final AdvertisementFeignApi advertisementFeignApi;

    @Override
    @GlobalTransactional
    public void saveOrUpdate(Advertisement dto) {
        advertisementFeignApi.saveOrUpdate(dto);
    }

    @Override
    public BasePage<AdvertisementAdminVO, AdvertisementPageFilter> getPageByFilter(BasePage<Advertisement, AdvertisementPageFilter> page) {
        BasePage<Advertisement, AdvertisementPageFilter> data = advertisementFeignApi.getPageByFilter(page).getData();
        BasePage<AdvertisementAdminVO, AdvertisementPageFilter> resultPage = new BasePage<>();
        BeanUtil.copyProperties(data, resultPage, "records");
        resultPage.setRecords(BeanUtil.copyToList(data.getRecords(), AdvertisementAdminVO.class));
        return resultPage ;
    }

    @Override
    public AdvertisementAdminVO getById(Long id) {
        Advertisement data = advertisementFeignApi.getById(id).getData();
        AdvertisementAdminVO vo = null;
        if(data != null){
            vo = new AdvertisementAdminVO();
            BeanUtil.copyProperties(data,vo);
        }
        return vo;
    }

    @Override
    @GlobalTransactional
    public void deleteById(Long id) {
        advertisementFeignApi.deleteById(id);
    }
}
