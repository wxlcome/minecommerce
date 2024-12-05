package com.wxl.cloud.miniecommerce.storage.mapper;

import com.wxl.cloud.miniecommerce.model.entity.storage.InStorageLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName  ：InStorageLogMapper
 * @description：入库日志访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@Mapper
public interface InStorageLogMapper extends BaseMapper<InStorageLog> {

}

