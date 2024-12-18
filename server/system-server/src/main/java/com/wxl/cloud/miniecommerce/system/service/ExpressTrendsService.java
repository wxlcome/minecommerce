package com.wxl.cloud.miniecommerce.system.service;

import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressTrends;

import java.util.List;

/**
 * @InterfaceName  ：ExpressTrendsService
 * @description    ：快递动态查询
 * @author         ：wxl
 * @date           ：2024/12/14 14:01
 */
public interface ExpressTrendsService {

    /**
     * @Description 根据快递单号查询快递动态
     * @param expressNo
     * @param phone 收件或寄件人的手机号
     * @return java.util.List<com.wxl.cloud.miniecommerce.system.vo.admin.ExpressTrends>
     */
    List<ExpressTrends> query(String expressNo, String phone);
}
