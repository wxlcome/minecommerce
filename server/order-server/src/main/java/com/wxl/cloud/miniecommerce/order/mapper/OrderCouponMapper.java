package com.wxl.cloud.miniecommerce.order.mapper;

import com.wxl.cloud.miniecommerce.model.entity.order.OrderCoupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName  ：OrderCouponMapper
 * @description：订单-优惠券访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Mapper
public interface OrderCouponMapper extends BaseMapper<OrderCoupon> {

}

