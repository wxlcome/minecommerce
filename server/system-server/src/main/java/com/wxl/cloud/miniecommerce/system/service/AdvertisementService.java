package com.wxl.cloud.miniecommerce.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.system.pagefilter.AdvertisementAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.vo.admin.AdvertisementAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.AdvertisementAdminVO;


/**
 * @ClassName  ：AdvertisementService
 * @description：广告服务层接口
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
public interface AdvertisementService extends IService<Advertisement> {

    /**
     * @Description 获取广告管理VO
     * @param id
     * @return com.wxl.cloud.miniecommerce.system.vo.admin.AdvertisementAdminVO
     */
    AdvertisementAdminVO getAdminVOById(Long id);

    /**
     * @Description 获取广告管理分页器
     * @param page
     * @return com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage<com.wxl.cloud.miniecommerce.system.vo.admin.AdvertisementAdminVO,com.wxl.cloud.miniecommerce.system.pagefilter.AdvertisementAdminPageFilter>
     */
    BasePage<AdvertisementAdminPageVO, AdvertisementAdminPageFilter> getAdminPageByFilter(BasePage<Advertisement, AdvertisementAdminPageFilter> page);


    /**
     * @Description 分页查询广告
     * @param page
     * @return com.wxl.cloud.miniecommerce.system.dto.AdvertisementPage
     */
    BasePage<Advertisement, AdvertisementAdminPageFilter> getPageByFilter(BasePage<Advertisement, AdvertisementAdminPageFilter> page);



}

