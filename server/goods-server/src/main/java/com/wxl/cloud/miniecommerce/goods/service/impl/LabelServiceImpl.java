package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.Label;
import com.wxl.cloud.miniecommerce.goods.mapper.LabelMapper;
import com.wxl.cloud.miniecommerce.goods.service.LabelService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：LabelServiceImpl
 * @description：标签服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("labelService")
public class LabelServiceImpl extends ServiceImpl<LabelMapper, Label> implements LabelService {

}
