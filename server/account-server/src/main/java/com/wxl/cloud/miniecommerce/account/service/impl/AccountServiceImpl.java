package com.wxl.cloud.miniecommerce.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.account.Account;
import com.wxl.cloud.miniecommerce.account.mapper.AccountMapper;
import com.wxl.cloud.miniecommerce.account.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：AccountServiceImpl
 * @description：账户服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@Service("accountService")
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
