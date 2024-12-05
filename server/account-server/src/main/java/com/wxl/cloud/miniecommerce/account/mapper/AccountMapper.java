package com.wxl.cloud.miniecommerce.account.mapper;

import com.wxl.cloud.miniecommerce.model.entity.account.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;



/**
 * @ClassName  ：AccountMapper
 * @description：账户访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:14
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}

