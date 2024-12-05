package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.Spec;
import com.wxl.cloud.miniecommerce.goods.mapper.SpecMapper;
import com.wxl.cloud.miniecommerce.goods.service.SpecService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：SpecServiceImpl
 * @description：规格服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("specService")
public class SpecServiceImpl extends ServiceImpl<SpecMapper, Spec> implements SpecService {

}
