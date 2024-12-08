package com.wxl.cloud.miniecommerce.web.admin.service;

import com.wxl.cloud.miniecommerce.common.pagefilter.system.AdvertisementPageFilter;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import com.wxl.cloud.miniecommerce.web.admin.vo.system.AdvertisementAdminVO;

/**
 * @InterfaceName  ：AdvertisementAdminService
 * @description    ：自定义接口
 * @author         ：wxl
 * @date           ：2024/12/08 21:44
 */
public interface AdvertisementAdminService {
    

    /**
     * @Description 保存或更新广告
     * @param dto
     */
    void saveOrUpdate(Advertisement dto);

    /**
     * @Description 分页查询广告
     * @param page
     * @return
     */
    BasePage<AdvertisementAdminVO, AdvertisementPageFilter> getPageByFilter(BasePage<Advertisement, AdvertisementPageFilter> page);

    /**
     * @Description 根据id查询广告
     * @param id
     * @return
     */
    AdvertisementAdminVO getById(Long id);

    /**
     * @Description 根据id删除广告
     * @param id
     */
    void deleteById(Long id);
}
