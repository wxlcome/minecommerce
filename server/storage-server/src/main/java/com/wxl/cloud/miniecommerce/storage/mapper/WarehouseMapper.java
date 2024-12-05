package com.wxl.cloud.miniecommerce.storage.mapper;

import com.wxl.cloud.miniecommerce.model.entity.storage.Warehouse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName  ：WarehouseMapper
 * @description：仓库访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@Mapper
public interface WarehouseMapper extends BaseMapper<Warehouse> {

}

