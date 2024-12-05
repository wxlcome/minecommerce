package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsParamValue;
import com.wxl.cloud.miniecommerce.goods.mapper.GoodsParamValueMapper;
import com.wxl.cloud.miniecommerce.goods.service.GoodsParamValueService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：GoodsParamValueServiceImpl
 * @description：商品参数值服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("goodsParamValueService")
public class GoodsParamValueServiceImpl extends ServiceImpl<GoodsParamValueMapper, GoodsParamValue> implements GoodsParamValueService {

}