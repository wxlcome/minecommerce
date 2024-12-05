package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.system.mapper.AdvertisementMapper;
import com.wxl.cloud.miniecommerce.system.service.AdvertisementService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：AdvertisementServiceImpl
 * @description：广告服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("advertisementService")
public class AdvertisementServiceImpl extends ServiceImpl<AdvertisementMapper, Advertisement> implements AdvertisementService {

}
