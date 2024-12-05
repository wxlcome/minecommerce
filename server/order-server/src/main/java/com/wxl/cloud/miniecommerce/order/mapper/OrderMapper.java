package com.wxl.cloud.miniecommerce.order.mapper;

import com.wxl.cloud.miniecommerce.model.entity.order.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName  ：OrderMapper
 * @description：订单访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}

