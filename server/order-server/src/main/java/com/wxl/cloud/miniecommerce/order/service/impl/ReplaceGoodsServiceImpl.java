package com.wxl.cloud.miniecommerce.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.order.ReplaceGoods;
import com.wxl.cloud.miniecommerce.order.mapper.ReplaceGoodsMapper;
import com.wxl.cloud.miniecommerce.order.service.ReplaceGoodsService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ReplaceGoodsServiceImpl
 * @description：换货服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Service("replaceGoodsService")
public class ReplaceGoodsServiceImpl extends ServiceImpl<ReplaceGoodsMapper, ReplaceGoods> implements ReplaceGoodsService {

}
