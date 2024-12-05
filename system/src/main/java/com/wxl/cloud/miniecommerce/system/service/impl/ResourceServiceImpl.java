package com.wxl.cloud.miniecommerce.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.model.entity.system.Resource;
import com.wxl.cloud.miniecommerce.system.mapper.ResourceMapper;
import com.wxl.cloud.miniecommerce.system.service.ResourceService;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ResourceServiceImpl
 * @description：资源服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("resourceService")
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

}
