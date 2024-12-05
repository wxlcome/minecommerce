package com.wxl.cloud.miniecommerce.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.order.RefundGoods;
import com.wxl.cloud.miniecommerce.order.mapper.RefundGoodsMapper;
import com.wxl.cloud.miniecommerce.order.service.RefundGoodsService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：RefundGoodsServiceImpl
 * @description：退款货物服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Service("refundGoodsService")
public class RefundGoodsServiceImpl extends ServiceImpl<RefundGoodsMapper, RefundGoods> implements RefundGoodsService {

}
