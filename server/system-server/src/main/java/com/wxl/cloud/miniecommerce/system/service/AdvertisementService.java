package com.wxl.cloud.miniecommerce.system.service;

import cn.hutool.db.Entity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wxl.cloud.miniecommerce.common.pagefilter.system.AdvertisementPageFilter;
import com.wxl.cloud.miniecommerce.model.entity.KeyValue;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.page.BasePage;

import java.util.List;
import java.util.Map;


/**
 * @ClassName  ：AdvertisementService
 * @description：广告服务层接口
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
public interface AdvertisementService extends IService<Advertisement> {

    /**
     * @Description 分页查询广告
     * @param page
     * @return com.wxl.cloud.miniecommerce.system.dto.AdvertisementPage
     */
    BasePage<Advertisement,AdvertisementPageFilter> getPageByFilter(BasePage<Advertisement, AdvertisementPageFilter> page);

}

