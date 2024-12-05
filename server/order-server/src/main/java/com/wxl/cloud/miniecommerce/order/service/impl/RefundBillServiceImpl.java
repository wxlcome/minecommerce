package com.wxl.cloud.miniecommerce.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.order.RefundBill;
import com.wxl.cloud.miniecommerce.order.mapper.RefundBillMapper;
import com.wxl.cloud.miniecommerce.order.service.RefundBillService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：RefundBillServiceImpl
 * @description：退款单服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Service("refundBillService")
public class RefundBillServiceImpl extends ServiceImpl<RefundBillMapper, RefundBill> implements RefundBillService {

}
