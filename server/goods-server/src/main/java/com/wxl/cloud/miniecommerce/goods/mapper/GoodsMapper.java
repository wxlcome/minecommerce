package com.wxl.cloud.miniecommerce.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxl.cloud.miniecommerce.model.entity.goods.Goods;
import org.apache.ibatis.annotations.Mapper;



/**
 * @ClassName  ：GoodsMapper
 * @description：商品访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

}

