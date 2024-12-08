package com.wxl.cloud.miniecommerce.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.cloud.miniecommerce.common.pagefilter.system.AdvertisementPageFilter;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.page.BasePage;
import org.apache.ibatis.annotations.Mapper;


/**
 * @ClassName  ：AdvertisementMapper
 * @description：广告访问层
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Mapper
public interface AdvertisementMapper extends BaseMapper<Advertisement> {

    /**
     * @Description 分页查询广告
     * @param page
     * @return com.wxl.cloud.miniecommerce.system.dto.AdvertisementPage
     */
    BasePage<Advertisement, AdvertisementPageFilter> seletePageByFilter(BasePage<Advertisement, AdvertisementPageFilter> page);
}

