package com.wxl.cloud.miniecommerce.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.order.Order;
import com.wxl.cloud.miniecommerce.order.mapper.OrderMapper;
import com.wxl.cloud.miniecommerce.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：OrderServiceImpl
 * @description：订单服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
