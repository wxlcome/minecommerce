package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressInfo;
import com.wxl.cloud.miniecommerce.system.mapper.ExpressInfoMapper;
import com.wxl.cloud.miniecommerce.system.service.ExpressInfoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ExpressInfoServiceImpl
 * @description：快递信息服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("expressInfoService")
public class ExpressInfoServiceImpl extends ServiceImpl<ExpressInfoMapper, ExpressInfo> implements ExpressInfoService {

}
