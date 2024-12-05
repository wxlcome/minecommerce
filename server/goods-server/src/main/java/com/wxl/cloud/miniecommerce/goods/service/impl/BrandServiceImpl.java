package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.Brand;
import com.wxl.cloud.miniecommerce.goods.mapper.BrandMapper;
import com.wxl.cloud.miniecommerce.goods.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：BrandServiceImpl
 * @description：品牌服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
