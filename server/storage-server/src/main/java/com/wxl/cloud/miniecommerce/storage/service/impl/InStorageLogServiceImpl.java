package com.wxl.cloud.miniecommerce.storage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.storage.InStorageLog;
import com.wxl.cloud.miniecommerce.storage.mapper.InStorageLogMapper;
import com.wxl.cloud.miniecommerce.storage.service.InStorageLogService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：InStorageLogServiceImpl
 * @description：入库日志服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@Service("inStorageLogService")
public class InStorageLogServiceImpl extends ServiceImpl<InStorageLogMapper, InStorageLog> implements InStorageLogService {

}
