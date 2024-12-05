package com.wxl.cloud.miniecommerce.goods.mapper;

import com.wxl.cloud.miniecommerce.model.entity.goods.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;



/**
 * @ClassName  ：CategoryMapper
 * @description：分类访问层
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}

