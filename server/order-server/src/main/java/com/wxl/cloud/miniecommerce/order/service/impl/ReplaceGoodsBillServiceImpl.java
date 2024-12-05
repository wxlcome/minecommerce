package com.wxl.cloud.miniecommerce.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.order.ReplaceGoodsBill;
import com.wxl.cloud.miniecommerce.order.mapper.ReplaceGoodsBillMapper;
import com.wxl.cloud.miniecommerce.order.service.ReplaceGoodsBillService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ReplaceGoodsBillServiceImpl
 * @description：换货单服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Service("replaceGoodsBillService")
public class ReplaceGoodsBillServiceImpl extends ServiceImpl<ReplaceGoodsBillMapper, ReplaceGoodsBill> implements ReplaceGoodsBillService {

}
