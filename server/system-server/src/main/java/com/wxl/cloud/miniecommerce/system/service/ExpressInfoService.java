package com.wxl.cloud.miniecommerce.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressInfo;
import com.wxl.cloud.miniecommerce.system.pagefilter.ExpressInfoAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressInfoAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressInfoAdminVO;


/**
 * @ClassName  ：ExpressInfoService
 * @description：快递信息服务层接口
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
public interface ExpressInfoService extends IService<ExpressInfo> {

    /**
     * @Description 根据id获取快递信息管理VO
     * @param id
     * @return com.wxl.cloud.miniecommerce.system.vo.admin.ExpressInfoAdminVO
     */
    ExpressInfoAdminVO getAdminVOById(Long id);

    /**
     * @Description 快递信息管理分页查询
     * @param page
     * @return com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage<com.wxl.cloud.miniecommerce.system.vo.admin.ExpressInfoAdminPageVO,com.wxl.cloud.miniecommerce.system.pagefilter.CouponAdminPageFilter>
     */
    BasePage<ExpressInfoAdminPageVO, ExpressInfoAdminPageFilter> getAdminPageByFilter(BasePage<ExpressInfo, ExpressInfoAdminPageFilter> page);


}

