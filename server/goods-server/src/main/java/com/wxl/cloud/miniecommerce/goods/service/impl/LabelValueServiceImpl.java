package com.wxl.cloud.miniecommerce.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.goods.LabelValue;
import com.wxl.cloud.miniecommerce.goods.mapper.LabelValueMapper;
import com.wxl.cloud.miniecommerce.goods.service.LabelValueService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：LabelValueServiceImpl
 * @description：标签值服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:26
 */
@Service("labelValueService")
public class LabelValueServiceImpl extends ServiceImpl<LabelValueMapper, LabelValue> implements LabelValueService {

}
