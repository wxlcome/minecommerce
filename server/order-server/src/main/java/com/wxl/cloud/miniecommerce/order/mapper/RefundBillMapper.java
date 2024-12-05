package com.wxl.cloud.miniecommerce.order.mapper;

import com.wxl.cloud.miniecommerce.model.entity.order.RefundBill;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName  ：RefundBillMapper
 * @description：退款单访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Mapper
public interface RefundBillMapper extends BaseMapper<RefundBill> {

}

