package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.SpecValue;
import com.wxl.cloud.miniecommerce.goods.mapper.SpecValueMapper;
import com.wxl.cloud.miniecommerce.goods.service.SpecValueService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：SpecValueServiceImpl
 * @description：规格值服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("specValueService")
public class SpecValueServiceImpl extends ServiceImpl<SpecValueMapper, SpecValue> implements SpecValueService {

}
