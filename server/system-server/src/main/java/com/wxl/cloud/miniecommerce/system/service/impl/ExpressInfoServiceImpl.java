package com.wxl.cloud.miniecommerce.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxl.cloud.miniecommerce.common.api.storage.WarehouseFeignApi;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.BasePage;
import com.wxl.cloud.miniecommerce.model.entity.storage.Warehouse;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressAddr;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressCompany;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressInfo;
import com.wxl.cloud.miniecommerce.system.mapper.ExpressInfoMapper;
import com.wxl.cloud.miniecommerce.system.pagefilter.ExpressInfoAdminPageFilter;
import com.wxl.cloud.miniecommerce.system.resolver.ExpressTrendsResolver;
import com.wxl.cloud.miniecommerce.system.service.ExpressAddrService;
import com.wxl.cloud.miniecommerce.system.service.ExpressCompanyService;
import com.wxl.cloud.miniecommerce.system.service.ExpressInfoService;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressInfoAdminPageVO;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressInfoAdminVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @ClassName  ：ExpressInfoServiceImpl
 * @description：快递信息服务层实现
 * @author     ：wxl
 * @date       ：2024/12/05 16:04
 */
@Service("expressInfoService")
@RequiredArgsConstructor
public class ExpressInfoServiceImpl extends ServiceImpl<ExpressInfoMapper, ExpressInfo> implements ExpressInfoService {

    private final ExpressCompanyService companyService;
    private final ExpressAddrService addrService;
    private final WarehouseFeignApi warehouseFeignApi;
    private final ExpressTrendsResolver trendsResolver;

    @Override
    public ExpressInfoAdminVO getAdminVOById(Long id) {
        ExpressInfoAdminVO vo = null;
        ExpressInfo entity = this.getById(id); // 查询快递信息
        if(entity != null){
            vo = new ExpressInfoAdminVO();
            BeanUtil.copyProperties(entity, vo);

            ExpressCompany company = companyService.getById(entity.getCompanyId());
            vo.setCompany(company); // 获取快递公司信息

            ExpressAddr addr = addrService.getById(entity.getExpressAddrId());
            vo.setExpressAddr(addr); // 获取快递地址信息

            Warehouse warehouse = new Warehouse();
            BeanUtil.copyProperties(warehouseFeignApi.getById(entity.getWarehouseId()).getData(), warehouse); // 获取快递地址信息
            vo.setWarehouse(warehouse);

            vo.setTrends(trendsResolver.startQuery(company.getCompanyCode(),entity.getExpressNo(),addr.getReceiverPhone())); // 获取快递动态
        }
        return vo;
    }

    @Override
    public BasePage<ExpressInfoAdminPageVO, ExpressInfoAdminPageFilter> getAdminPageByFilter(BasePage<ExpressInfo, ExpressInfoAdminPageFilter> page) {
        page = baseMapper.selectPageByFilter(page);
        BasePage<ExpressInfoAdminPageVO, ExpressInfoAdminPageFilter> resultPage = new BasePage<>();
        BeanUtil.copyProperties(page, resultPage, "records");
        resultPage.setRecords(BeanUtil.copyToList(page.getRecords(), ExpressInfoAdminPageVO.class));
        return resultPage;
    }
}
