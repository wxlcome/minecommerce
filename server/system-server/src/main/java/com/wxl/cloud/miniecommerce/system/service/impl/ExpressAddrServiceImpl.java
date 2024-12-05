package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressAddr;
import com.wxl.cloud.miniecommerce.system.mapper.ExpressAddrMapper;
import com.wxl.cloud.miniecommerce.system.service.ExpressAddrService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ExpressAddrServiceImpl
 * @description：快递地址信息服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("expressAddrService")
public class ExpressAddrServiceImpl extends ServiceImpl<ExpressAddrMapper, ExpressAddr> implements ExpressAddrService {

}
