package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsSpecValue;
import com.wxl.cloud.miniecommerce.goods.mapper.GoodsSpecValueMapper;
import com.wxl.cloud.miniecommerce.goods.service.GoodsSpecValueService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：GoodsSpecValueServiceImpl
 * @description：商品规格值服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("goodsSpecValueService")
public class GoodsSpecValueServiceImpl extends ServiceImpl<GoodsSpecValueMapper, GoodsSpecValue> implements GoodsSpecValueService {

}
