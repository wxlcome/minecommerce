package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsLabelValue;
import com.wxl.cloud.miniecommerce.goods.mapper.GoodsLabelValueMapper;
import com.wxl.cloud.miniecommerce.goods.service.GoodsLabelValueService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：GoodsLabelValueServiceImpl
 * @description：商品标签值服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("goodsLabelValueService")
public class GoodsLabelValueServiceImpl extends ServiceImpl<GoodsLabelValueMapper, GoodsLabelValue> implements GoodsLabelValueService {

}
