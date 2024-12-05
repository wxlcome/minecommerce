package com.wxl.cloud.miniecommerce.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.account.AccountCoupon;
import com.wxl.cloud.miniecommerce.account.mapper.AccountCouponMapper;
import com.wxl.cloud.miniecommerce.account.service.AccountCouponService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：AccountCouponServiceImpl
 * @description：账户-优惠券服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@Service("accountCouponService")
public class AccountCouponServiceImpl extends ServiceImpl<AccountCouponMapper, AccountCoupon> implements AccountCouponService {

}
