package com.wxl.cloud.miniecommerce.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountAddress;
import com.wxl.cloud.miniecommerce.account.mapper.AccountAddressMapper;
import com.wxl.cloud.miniecommerce.account.service.AccountAddressService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：AccountAddressServiceImpl
 * @description：账户-地址服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@Service("accountAddressService")
public class AccountAddressServiceImpl extends ServiceImpl<AccountAddressMapper, AccountAddress> implements AccountAddressService {

}
