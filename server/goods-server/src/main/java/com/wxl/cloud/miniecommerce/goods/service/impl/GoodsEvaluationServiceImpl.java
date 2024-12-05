package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.GoodsEvaluation;
import com.wxl.cloud.miniecommerce.goods.mapper.GoodsEvaluationMapper;
import com.wxl.cloud.miniecommerce.goods.service.GoodsEvaluationService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：GoodsEvaluationServiceImpl
 * @description：商品-评价服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("goodsEvaluationService")
public class GoodsEvaluationServiceImpl extends ServiceImpl<GoodsEvaluationMapper, GoodsEvaluation> implements GoodsEvaluationService {

}
