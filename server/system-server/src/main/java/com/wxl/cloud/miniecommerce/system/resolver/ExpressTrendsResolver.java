package com.wxl.cloud.miniecommerce.system.resolver;

import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressTrends;

import java.util.List;

/**
 * @InterfaceName  ：ExpressTrendsResolver
 * @description    ：快递动态获取器
 * @author         ：wxl
 * @date           ：2024/12/14 17:53
 */
public interface ExpressTrendsResolver {

    List<ExpressTrends> startQuery(String companyCode,String expressNo,String phone);
}
