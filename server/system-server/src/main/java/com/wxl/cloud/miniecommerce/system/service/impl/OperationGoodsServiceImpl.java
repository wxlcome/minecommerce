package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.OperationGoods;
import com.wxl.cloud.miniecommerce.system.mapper.OperationGoodsMapper;
import com.wxl.cloud.miniecommerce.system.service.OperationGoodsService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：OperationGoodsServiceImpl
 * @description：活动商品服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("operationGoodsService")
public class OperationGoodsServiceImpl extends ServiceImpl<OperationGoodsMapper, OperationGoods> implements OperationGoodsService {

}
