package com.wxl.cloud.miniecommerce.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountFavor;
import com.wxl.cloud.miniecommerce.account.mapper.AccountFavorMapper;
import com.wxl.cloud.miniecommerce.account.service.AccountFavorService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：AccountFavorServiceImpl
 * @description：账户-收藏服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@Service("accountFavorService")
public class AccountFavorServiceImpl extends ServiceImpl<AccountFavorMapper, AccountFavor> implements AccountFavorService {

}
