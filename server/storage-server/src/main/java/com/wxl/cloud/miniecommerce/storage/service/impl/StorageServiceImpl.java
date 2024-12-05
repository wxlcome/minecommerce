package com.wxl.cloud.miniecommerce.storage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.storage.Storage;
import com.wxl.cloud.miniecommerce.storage.mapper.StorageMapper;
import com.wxl.cloud.miniecommerce.storage.service.StorageService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：StorageServiceImpl
 * @description：库存服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@Service("storageService")
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

}
