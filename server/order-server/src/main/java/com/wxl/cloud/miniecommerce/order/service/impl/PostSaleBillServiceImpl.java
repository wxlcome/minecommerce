package com.wxl.cloud.miniecommerce.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.order.PostSaleBill;
import com.wxl.cloud.miniecommerce.order.mapper.PostSaleBillMapper;
import com.wxl.cloud.miniecommerce.order.service.PostSaleBillService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：PostSaleBillServiceImpl
 * @description：售后单服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 18:40
 */
@Service("postSaleBillService")
public class PostSaleBillServiceImpl extends ServiceImpl<PostSaleBillMapper, PostSaleBill> implements PostSaleBillService {

}
