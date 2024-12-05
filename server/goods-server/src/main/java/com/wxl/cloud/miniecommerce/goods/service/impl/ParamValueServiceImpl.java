package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.ParamValue;
import com.wxl.cloud.miniecommerce.goods.mapper.ParamValueMapper;
import com.wxl.cloud.miniecommerce.goods.service.ParamValueService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ParamValueServiceImpl
 * @description：参数值服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:34
 */
@Service("paramValueService")
public class ParamValueServiceImpl extends ServiceImpl<ParamValueMapper, ParamValue> implements ParamValueService {

}
