package com.wxl.cloud.miniecommerce.gateway.config.sentinel;

import com.alibaba.csp.sentinel.adapter.gateway.common.api.ApiDefinition;
import com.alibaba.csp.sentinel.adapter.gateway.common.api.GatewayApiDefinitionManager;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayFlowRule;
import com.alibaba.csp.sentinel.adapter.gateway.common.rule.GatewayRuleManager;
import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.spi.Spi;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.wxl.cloud.miniecommerce.common.config.sentinel.RuleCenterInitFunc;


import java.util.Properties;
import java.util.Set;


/**
 * @ClassName  ：GatewayRuleCenterInitFunc
 * @description：规则中心发送配置
 * @author     ：wxl
 * @date       ：2024/11/11 4:57
 */
@Spi(order = Integer.MAX_VALUE )
public class GatewayRuleCenterInitFunc implements InitFunc {



    @Override
    public void init() throws Exception {

        Properties nacosProperties = new Properties();
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.server-addr"));
        nacosProperties.put(PropertyKeyConst.USERNAME, RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.username"));
        nacosProperties.put(PropertyKeyConst.PASSWORD, RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.password"));
        nacosProperties.put(PropertyKeyConst.NAMESPACE, RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.config.namespace"));

        String group = RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.config.group") + "_SENTINEL_RULE";
        String appName =RuleCenterInitFunc.getProperties().getProperty("spring.application.name");

        registerDatasource(nacosProperties, group, appName);
    }

    private void registerDatasource(Properties nacosProperties, String group, String appName) {

        // GatewayFlowManager
        String gatewayFlowDataId = String.join("-", appName, "gateway-flow-rules.json");
        RuleCenterInitFunc.getProperties().put("gatewayFlowDataId",gatewayFlowDataId);
        RuleCenterInitFunc.getProperties().put("gatewayFlowComment","");
        ReadableDataSource<String, Set<GatewayFlowRule>> ruleDataSource = new NacosDataSource<Set<GatewayFlowRule>>(nacosProperties, group,gatewayFlowDataId,
                source -> JSON.parseObject(source, new TypeReference<Set<GatewayFlowRule>>() {
                }));
        GatewayRuleManager.register2Property(ruleDataSource.getProperty());


        // GatewayApiDefinitionManager
        String gatewayApiDefinitionDataId = String.join("-", appName, "gateway-api-definition-rules.json");
        RuleCenterInitFunc.getProperties().put("gatewayApiDefinitionDataId",gatewayApiDefinitionDataId);
        RuleCenterInitFunc.getProperties().put("gatewayApiDefinitionComment","");
        ReadableDataSource<String, Set<ApiDefinition>> apidefinitionDataSource = new NacosDataSource<Set<ApiDefinition>>(nacosProperties, group,gatewayApiDefinitionDataId ,
                source -> JSON.parseObject(source, new TypeReference<Set<ApiDefinition>>() {
                }));
        GatewayApiDefinitionManager.register2Property(apidefinitionDataSource.getProperty());

    }



}
