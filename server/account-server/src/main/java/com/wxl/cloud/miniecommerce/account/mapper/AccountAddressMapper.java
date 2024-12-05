package com.wxl.cloud.miniecommerce.account.mapper;

import com.wxl.cloud.miniecommerce.model.entity.account.AccountAddress;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;



/**
 * @ClassName  ：AccountAddressMapper
 * @description：账户-地址访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@Mapper
public interface AccountAddressMapper extends BaseMapper<AccountAddress> {

}

