package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsSpecGroupData;
import com.wxl.cloud.miniecommerce.goods.mapper.GoodsSpecGroupDataMapper;
import com.wxl.cloud.miniecommerce.goods.service.GoodsSpecGroupDataService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：GoodsSpecGroupDataServiceImpl
 * @description：商品规格组数据服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("goodsSpecGroupDataService")
public class GoodsSpecGroupDataServiceImpl extends ServiceImpl<GoodsSpecGroupDataMapper, GoodsSpecGroupData> implements GoodsSpecGroupDataService {

}
