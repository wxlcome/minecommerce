package com.wxl.cloud.miniecommerce.order.mapper;

import com.wxl.cloud.miniecommerce.model.entity.order.OrderGoods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName  ：OrderGoodsMapper
 * @description：订单-商品访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Mapper
public interface OrderGoodsMapper extends BaseMapper<OrderGoods> {

}

