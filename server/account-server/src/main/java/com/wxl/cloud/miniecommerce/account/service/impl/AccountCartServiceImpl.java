package com.wxl.cloud.miniecommerce.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountCart;
import com.wxl.cloud.miniecommerce.account.mapper.AccountCartMapper;
import com.wxl.cloud.miniecommerce.account.service.AccountCartService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：AccountCartServiceImpl
 * @description：账户-购物车服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@Service("accountCartService")
public class AccountCartServiceImpl extends ServiceImpl<AccountCartMapper, AccountCart> implements AccountCartService {

}
