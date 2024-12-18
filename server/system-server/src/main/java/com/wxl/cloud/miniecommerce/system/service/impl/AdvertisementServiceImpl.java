package com.wxl.cloud.miniecommerce.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.system.mapper.AdvertisementMapper;
import com.wxl.cloud.miniecommerce.system.pagefilter.AdvertisementAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.service.AdvertisementService;
import com.wxl.cloud.miniecommerce.system.vo.admin.AdvertisementAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.AdvertisementAdminVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
    public AdvertisementAdminVO getAdminVOById(Long id) {
        Advertisement entity = this.getById(id);
        AdvertisementAdminVO vo = null;
        if(entity != null){
            vo= new AdvertisementAdminVO();
            BeanUtil.copyProperties(entity, vo);
        }
        return vo;
    }


    @Override
    public BasePage<Advertisement, AdvertisementAdminPageFilter> getPageByFilter(BasePage<Advertisement, AdvertisementAdminPageFilter> page) {
        return mapper.seletePageByFilter(page);
    }


    @Override
    public BasePage<AdvertisementAdminPageVO, AdvertisementAdminPageFilter> getAdminPageByFilter(BasePage<Advertisement, AdvertisementAdminPageFilter> page) {

        page = mapper.seletePageByFilter(page);
        BasePage<AdvertisementAdminPageVO, AdvertisementAdminPageFilter> resultPage = new BasePage<>();
        BeanUtil.copyProperties(page, resultPage, "records");
        resultPage.setRecords(BeanUtil.copyToList(page.getRecords(), AdvertisementAdminPageVO.class));

        return resultPage;
    }



}
