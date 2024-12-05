package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.Param;
import com.wxl.cloud.miniecommerce.goods.mapper.ParamMapper;
import com.wxl.cloud.miniecommerce.goods.service.ParamService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ParamServiceImpl
 * @description：参数服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("paramService")
public class ParamServiceImpl extends ServiceImpl<ParamMapper, Param> implements ParamService {

}
