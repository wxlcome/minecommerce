package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.CityInfo;
import com.wxl.cloud.miniecommerce.system.mapper.CityInfoMapper;
import com.wxl.cloud.miniecommerce.system.service.CityInfoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：CityInfoServiceImpl
 * @description：$tableInfo.comment.concat("服务层实现")
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("cityInfoService")
public class CityInfoServiceImpl extends ServiceImpl<CityInfoMapper, CityInfo> implements CityInfoService {

}
