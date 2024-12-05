package com.wxl.cloud.miniecommerce.account.mapper;

import com.wxl.cloud.miniecommerce.model.entity.account.AccountCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;



/**
 * @ClassName  ：AccountCartMapper
 * @description：账户-购物车访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@Mapper
public interface AccountCartMapper extends BaseMapper<AccountCart> {

}

