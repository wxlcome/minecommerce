package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.DistrictInfo;
import com.wxl.cloud.miniecommerce.system.mapper.DistrictInfoMapper;
import com.wxl.cloud.miniecommerce.system.service.DistrictInfoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：DistrictInfoServiceImpl
 * @description：$tableInfo.comment.concat("服务层实现")
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("districtInfoService")
public class DistrictInfoServiceImpl extends ServiceImpl<DistrictInfoMapper, DistrictInfo> implements DistrictInfoService {

}
