package com.wxl.cloud.miniecommerce.storage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.storage.OutStorageLog;
import com.wxl.cloud.miniecommerce.storage.mapper.OutStorageLogMapper;
import com.wxl.cloud.miniecommerce.storage.service.OutStorageLogService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：OutStorageLogServiceImpl
 * @description：出库日志服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@Service("outStorageLogService")
public class OutStorageLogServiceImpl extends ServiceImpl<OutStorageLogMapper, OutStorageLog> implements OutStorageLogService {

}
