package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.Operation;
import com.wxl.cloud.miniecommerce.system.mapper.OperationMapper;
import com.wxl.cloud.miniecommerce.system.service.OperationService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：OperationServiceImpl
 * @description：活动服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("operationService")
public class OperationServiceImpl extends ServiceImpl<OperationMapper, Operation> implements OperationService {

}
