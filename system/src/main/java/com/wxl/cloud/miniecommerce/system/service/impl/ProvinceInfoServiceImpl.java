package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.ProvinceInfo;
import com.wxl.cloud.miniecommerce.system.mapper.ProvinceInfoMapper;
import com.wxl.cloud.miniecommerce.system.service.ProvinceInfoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ProvinceInfoServiceImpl
 * @description：$tableInfo.comment.concat("服务层实现")
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("provinceInfoService")
public class ProvinceInfoServiceImpl extends ServiceImpl<ProvinceInfoMapper, ProvinceInfo> implements ProvinceInfoService {

}
