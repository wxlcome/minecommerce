package com.wxl.cloud.miniecommerce.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.Operation;
import com.wxl.cloud.miniecommerce.system.pagefilter.OperationAdminPageFilter;
import org.apache.ibatis.annotations.Mapper;


/**
 * @ClassName  ：OperationMapper
 * @description：活动访问层
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Mapper
public interface OperationMapper extends BaseMapper<Operation> {

    /**
     * @Description 分页查询活动
     * @param page
     * @return com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage<com.wxl.cloud.miniecommerce.model.entity.system.Operation,com.wxl.cloud.miniecommerce.system.pagefilter.OperationAdminPageFilter>
     */
    BasePage<Operation, OperationAdminPageFilter> selectPageByFilter(BasePage<Operation, OperationAdminPageFilter> page);
}

