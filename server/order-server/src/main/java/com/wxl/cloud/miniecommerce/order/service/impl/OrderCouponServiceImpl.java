package com.wxl.cloud.miniecommerce.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.order.OrderCoupon;
import com.wxl.cloud.miniecommerce.order.mapper.OrderCouponMapper;
import com.wxl.cloud.miniecommerce.order.service.OrderCouponService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：OrderCouponServiceImpl
 * @description：订单-优惠券服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Service("orderCouponService")
public class OrderCouponServiceImpl extends ServiceImpl<OrderCouponMapper, OrderCoupon> implements OrderCouponService {

}
