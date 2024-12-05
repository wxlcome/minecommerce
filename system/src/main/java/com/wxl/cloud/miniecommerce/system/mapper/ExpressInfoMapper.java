package com.wxl.cloud.miniecommerce.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressInfo;
import org.apache.ibatis.annotations.Mapper;


/**
 * @ClassName  ：ExpressInfoMapper
 * @description：快递信息访问层
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Mapper
public interface ExpressInfoMapper extends BaseMapper<ExpressInfo> {

}

