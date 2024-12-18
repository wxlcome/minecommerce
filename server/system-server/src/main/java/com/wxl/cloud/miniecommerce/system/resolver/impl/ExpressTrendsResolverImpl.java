package com.wxl.cloud.miniecommerce.system.resolver.impl;

import com.wxl.cloud.miniecommerce.system.resolver.ExpressTrendsResolver;
import com.wxl.cloud.miniecommerce.system.service.ExpressTrendsService;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressTrends;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName  ：ExpressTrendsResolverImpl
 * @description：快递动态获取器
 * @author     ：wxl
 * @date       ：2024/12/14 17:55
 */
@Component
@RequiredArgsConstructor
public class ExpressTrendsResolverImpl implements ExpressTrendsResolver {

    private final ApplicationContext ac;

    @Override
    public List<ExpressTrends> startQuery(String companyCode, String expressNo, String phone) {
        ExpressTrendsService service = ac.getBean(companyCode + "ExpressTrendsService", ExpressTrendsService.class);
        return service.query(expressNo, phone);
    }
}
