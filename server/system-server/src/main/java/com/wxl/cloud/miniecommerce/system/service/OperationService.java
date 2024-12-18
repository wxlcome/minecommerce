package com.wxl.cloud.miniecommerce.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.system.Operation;
import com.wxl.cloud.miniecommerce.system.dto.OperationAdminDTO;
import com.wxl.cloud.miniecommerce.system.pagefilter.OperationAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.vo.admin.OperationAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.OperationAdminVO;


/**
 * @ClassName  ：OperationService
 * @description：活动服务层接口
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
public interface OperationService extends IService<Operation> {

    /**
     * @Description 根据id查询活动管理VO
     * @param id
     * @return com.wxl.cloud.miniecommerce.system.vo.admin.OperationAdminVO
     */
    OperationAdminVO getAdminVOById(Long id);

    /**
     * @Description 分页查询活动管理VO
     * @param page
     * @return com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage<com.wxl.cloud.miniecommerce.system.vo.admin.OperationAdminPageVO,com.wxl.cloud.miniecommerce.system.pagefilter.OperationAdminPageFilter>
     */
    BasePage<OperationAdminPageVO, OperationAdminPageFilter> getAdminPageByFilter(BasePage<Operation, OperationAdminPageFilter> page);


    /**
     * @Description 保存或更新活动管理DTO
     * @param dto
     */
    void saveOrUpdateByDTO(OperationAdminDTO dto);
}

