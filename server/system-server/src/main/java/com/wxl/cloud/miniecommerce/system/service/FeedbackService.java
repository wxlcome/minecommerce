package com.wxl.cloud.miniecommerce.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.Feedback;
import com.wxl.cloud.miniecommerce.system.pagefilter.FeedbackAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.vo.admin.FeedbackAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.FeedbackAdminVO;


/**
 * @ClassName  ：FeedbackService
 * @description：反馈服务层接口
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
public interface FeedbackService extends IService<Feedback> {


    /**
     * @Description 根据id查询反馈管理VO
     * @param id
     * @return com.wxl.cloud.miniecommerce.system.vo.admin.FeedbackAdminVO
     */
    FeedbackAdminVO getAdminVOById(Long id);

    /**
     * @Description 分页查询反馈管理VO
     * @param page
     * @return com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage<com.wxl.cloud.miniecommerce.system.vo.admin.FeedbackAdminPageVO,com.wxl.cloud.miniecommerce.system.pagefilter.FeedbackAdminPageFilter>
     */
    BasePage<FeedbackAdminPageVO, FeedbackAdminPageFilter> getAdminPageByFilter(BasePage<Feedback, FeedbackAdminPageFilter> page);


}

