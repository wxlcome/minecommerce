package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.common.pagefilter.system.AdvertisementPageFilter;
import com.wxl.cloud.miniecommerce.model.entity.KeyValue;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.enums.system.AdvertisementStatus;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.system.mapper.AdvertisementMapper;
import com.wxl.cloud.miniecommerce.system.service.AdvertisementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName  ：AdvertisementServiceImpl
 * @description：广告服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@RequiredArgsConstructor
@Service("advertisementService")
public class AdvertisementServiceImpl extends ServiceImpl<AdvertisementMapper, Advertisement> implements AdvertisementService {

    private final AdvertisementMapper mapper;


    @Override
    public BasePage<Advertisement, AdvertisementPageFilter> getPageByFilter(BasePage<Advertisement,AdvertisementPageFilter> page) {
        return mapper.seletePageByFilter(page);
    }


}
