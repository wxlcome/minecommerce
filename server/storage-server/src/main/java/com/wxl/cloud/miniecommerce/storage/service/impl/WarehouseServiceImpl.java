package com.wxl.cloud.miniecommerce.storage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.storage.Warehouse;
import com.wxl.cloud.miniecommerce.storage.mapper.WarehouseMapper;
import com.wxl.cloud.miniecommerce.storage.service.WarehouseService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：WarehouseServiceImpl
 * @description：仓库服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:52
 */
@Service("warehouseService")
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, Warehouse> implements WarehouseService {

}
