package com.wxl.cloud.miniecommerce.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.order.OrderGoods;
import com.wxl.cloud.miniecommerce.order.mapper.OrderGoodsMapper;
import com.wxl.cloud.miniecommerce.order.service.OrderGoodsService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：OrderGoodsServiceImpl
 * @description：订单-商品服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Service("orderGoodsService")
public class OrderGoodsServiceImpl extends ServiceImpl<OrderGoodsMapper, OrderGoods> implements OrderGoodsService {

}
