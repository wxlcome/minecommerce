package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsSpecGroup;
import com.wxl.cloud.miniecommerce.goods.mapper.GoodsSpecGroupMapper;
import com.wxl.cloud.miniecommerce.goods.service.GoodsSpecGroupService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：GoodsSpecGroupServiceImpl
 * @description：商品规格组服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("goodsSpecGroupService")
public class GoodsSpecGroupServiceImpl extends ServiceImpl<GoodsSpecGroupMapper, GoodsSpecGroup> implements GoodsSpecGroupService {

}
