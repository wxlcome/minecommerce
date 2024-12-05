package com.wxl.cloud.miniecommerce.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressCompany;
import org.apache.ibatis.annotations.Mapper;


/**
 * @ClassName  ：ExpressCompanyMapper
 * @description：快递公司访问层
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Mapper
public interface ExpressCompanyMapper extends BaseMapper<ExpressCompany> {

}

