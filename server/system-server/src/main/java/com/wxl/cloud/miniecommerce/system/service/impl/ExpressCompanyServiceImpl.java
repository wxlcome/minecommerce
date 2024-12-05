package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressCompany;
import com.wxl.cloud.miniecommerce.system.mapper.ExpressCompanyMapper;
import com.wxl.cloud.miniecommerce.system.service.ExpressCompanyService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ExpressCompanyServiceImpl
 * @description：快递公司服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("expressCompanyService")
public class ExpressCompanyServiceImpl extends ServiceImpl<ExpressCompanyMapper, ExpressCompany> implements ExpressCompanyService {


}
