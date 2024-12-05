package com.wxl.cloud.miniecommerce.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressAddr;
import org.apache.ibatis.annotations.Mapper;


/**
 * @ClassName  ：ExpressAddrMapper
 * @description：快递地址信息访问层
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Mapper
public interface ExpressAddrMapper extends BaseMapper<ExpressAddr> {

}

