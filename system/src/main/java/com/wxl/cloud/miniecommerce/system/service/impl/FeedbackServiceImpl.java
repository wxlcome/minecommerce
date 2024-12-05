package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.Feedback;
import com.wxl.cloud.miniecommerce.system.mapper.FeedbackMapper;
import com.wxl.cloud.miniecommerce.system.service.FeedbackService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：FeedbackServiceImpl
 * @description：反馈服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("feedbackService")
public class FeedbackServiceImpl extends ServiceImpl<FeedbackMapper, Feedback> implements FeedbackService {

}
