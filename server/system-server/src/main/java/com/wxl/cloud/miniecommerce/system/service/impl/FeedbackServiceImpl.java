package com.wxl.cloud.miniecommerce.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.Feedback;
import com.wxl.cloud.miniecommerce.model.entity.system.Resource;
import com.wxl.cloud.miniecommerce.model.enums.system.ObjectType;
import com.wxl.cloud.miniecommerce.system.mapper.FeedbackMapper;
import com.wxl.cloud.miniecommerce.system.pagefilter.FeedbackAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.service.FeedbackService;
import com.wxl.cloud.miniecommerce.system.service.ResourceService;
import com.wxl.cloud.miniecommerce.system.vo.admin.FeedbackAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.FeedbackAdminVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：FeedbackServiceImpl
 * @description：反馈服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("feedbackService")
@RequiredArgsConstructor
public class FeedbackServiceImpl extends ServiceImpl<FeedbackMapper, Feedback> implements FeedbackService {

    private final ResourceService resourceService;

    @Override
    public FeedbackAdminVO getAdminVOById(Long id) {
        FeedbackAdminVO vo = null;
        Feedback entity = this.getById(id);// 获取实体信息
        if(entity != null){
            vo = new FeedbackAdminVO();
            BeanUtil.copyProperties(entity, vo);

            vo.setSpecific(resourceService.list(new LambdaQueryWrapper<Resource>()
                    .eq(Resource::getObjectType, ObjectType.FEEDBACK.getValue())
                    .eq(Resource::getObjectId, id)
            )); // 获取关联图片/视频资源
        }

        return vo;
    }

    @Override
    public BasePage<FeedbackAdminPageVO, FeedbackAdminPageFilter> getAdminPageByFilter(BasePage<Feedback, FeedbackAdminPageFilter> page) {
        page = baseMapper.selectPageByFilter(page);
        BasePage<FeedbackAdminPageVO, FeedbackAdminPageFilter> resultPage = new BasePage<>();
        BeanUtil.copyProperties(page, resultPage, "records");
        resultPage.setRecords(BeanUtil.copyToList(page.getRecords(), FeedbackAdminPageVO.class));
        return resultPage;
    }
}
