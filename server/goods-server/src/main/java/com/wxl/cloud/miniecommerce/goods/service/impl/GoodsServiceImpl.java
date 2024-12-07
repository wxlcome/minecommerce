package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.goods.mapper.GoodsMapper;
import com.wxl.cloud.miniecommerce.goods.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：GoodsServiceImpl
 * @description：商品服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("goodsService")
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

}
