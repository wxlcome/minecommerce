package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.Category;
import com.wxl.cloud.miniecommerce.goods.mapper.CategoryMapper;
import com.wxl.cloud.miniecommerce.goods.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：CategoryServiceImpl
 * @description：分类服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
