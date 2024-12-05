package com.wxl.cloud.miniecommerce.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountPaymethod;
import com.wxl.cloud.miniecommerce.account.mapper.AccountPaymethodMapper;
import com.wxl.cloud.miniecommerce.account.service.AccountPaymethodService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：AccountPaymethodServiceImpl
 * @description：账户-支付方式服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@Service("accountPaymethodService")
public class AccountPaymethodServiceImpl extends ServiceImpl<AccountPaymethodMapper, AccountPaymethod> implements AccountPaymethodService {

}
