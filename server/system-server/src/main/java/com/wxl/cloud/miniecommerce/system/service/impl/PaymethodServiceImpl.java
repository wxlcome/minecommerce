package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.Paymethod;
import com.wxl.cloud.miniecommerce.system.mapper.PaymethodMapper;
import com.wxl.cloud.miniecommerce.system.service.PaymethodService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：PaymethodServiceImpl
 * @description：支付方式服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("paymethodService")
public class PaymethodServiceImpl extends ServiceImpl<PaymethodMapper, Paymethod> implements PaymethodService {

}
