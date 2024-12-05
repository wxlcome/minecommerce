package com.wxl.cloud.miniecommerce.common.config.sentinel;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityRule;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityRuleManager;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowRuleManager;
import com.alibaba.csp.sentinel.slots.system.SystemRule;
import com.alibaba.csp.sentinel.slots.system.SystemRuleManager;
import com.alibaba.csp.sentinel.spi.Spi;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.alibaba.nacos.api.PropertyKeyConst;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;

import java.util.List;
import java.util.Properties;


/**
 * @ClassName  ：RuleCenterConfig
 * @description：规则中心发送配置
 * @author     ：wxl
 * @date       ：2024/11/11 4:57
 */
@Spi(order = Integer.MAX_VALUE - 1)
public class RuleCenterInitFunc implements InitFunc {


    private static Properties properties;

    static {
        YamlPropertiesFactoryBean yamlFactory = new YamlPropertiesFactoryBean();
        yamlFactory.setResources(new ClassPathResource("bootstrap.yml"));
        properties = yamlFactory.getObject();
    }


    @Override
    public void init() throws Exception {

        if (properties == null || properties.isEmpty())
            return;

        Properties nacosProperties = new Properties();
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, properties.getProperty("spring.cloud.nacos.server-addr"));
        nacosProperties.put(PropertyKeyConst.USERNAME, properties.getProperty("spring.cloud.nacos.username"));
        nacosProperties.put(PropertyKeyConst.PASSWORD, properties.getProperty("spring.cloud.nacos.password"));
        nacosProperties.put(PropertyKeyConst.NAMESPACE, properties.getProperty("spring.cloud.nacos.config.namespace"));

        String group = properties.getProperty("spring.cloud.nacos.config.group") + "_SENTINEL_RULE";
        String appName = properties.getProperty("spring.application.name");

        registerDatasource(nacosProperties, group, appName);
    }

    private void registerDatasource(Properties nacosProperties, String group, String appName) {
        // FlowManager
        String flowDataId = String.join("-", appName, "flow-rules.json");
        properties.put("flowDataId", flowDataId);
        properties.put("flowComment","//----------------------------------------------------------------------------------------------\n//   字段名                      含义                                         取值\n//----------------------------------------------------------------------------------------------\n// resource\t        资源名，资源名是限流规则的作用对象\t          自定义\n//----------------------------------------------------------------------------------------------\n// count\t        限流阈值\t                                 自定义\n//----------------------------------------------------------------------------------------------\n// grade\t        限流阈值类型                                 QPS 模式（1）或并发线程数模式（0）\n//----------------------------------------------------------------------------------------------\n// limitApp\t        流控针对的调用来源\t                         default\n//----------------------------------------------------------------------------------------------\n// strategy\t        调用关系限流策略                              直接(0)、链路(1)、关联(2)\n//----------------------------------------------------------------------------------------------\n// controlBehavior\t流控效果                                    （直接拒绝(0)/WarmUp(1)/匀速+排队等待(2)）\n//----------------------------------------------------------------------------------------------\n// clusterMode\t    是否集群限流\t                                否（false）是（true）\n//----------------------------------------------------------------------------------------------\n");
        ReadableDataSource<String, List<FlowRule>> flowDataSource = new NacosDataSource<List<FlowRule>>(nacosProperties, group, flowDataId ,
                source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
                }));
        FlowRuleManager.register2Property(flowDataSource.getProperty());



        // DegradeManager
        String degradeDataId = String.join("-", appName, "degrade-rules.json");
        properties.put("degradeDataId", degradeDataId);
        properties.put("degradeComment","//------------------------------------------------------------------------------------------------------------------------------\n//   字段名                          含义                                                           取值\n//------------------------------------------------------------------------------------------------------------------------------\n// resource\t                资源名，即规则的作用对象\t                       自定义\n//------------------------------------------------------------------------------------------------------------------------------\n// grade\t                熔断策略                                         支持慢调用比例（0）/异常比例（1）/异常数策略（2）\n//------------------------------------------------------------------------------------------------------------------------------\n// count\t                阈值计数。确切的含义取决于 grade 的字段。          > 在平均 RT 模式下，它表示最大响应时间 （RT） 以毫秒为单位。\n//                                                                          > 在异常比率模式下，表示介于 0.0 和 1.0 之间的异常比率。\n//                                                                          > 在异常计数模式下，表示异常计数\n//------------------------------------------------------------------------------------------------------------------------------                                                                                           \n// timeWindow\t            熔断时长，单位为 s\t                              自定义\n//------------------------------------------------------------------------------------------------------------------------------\n// minRequestAmount\t        熔断触发的最小请求数(样本数)                       自定义\n//------------------------------------------------------------------------------------------------------------------------------\n// statIntervalMs\t        统计时长（单位为 ms）\t                         自定义\n//------------------------------------------------------------------------------------------------------------------------------\n// slowRatioThreshold\t    慢调用比例阈值，仅慢调用比例模式有效）\t             自定义\n//------------------------------------------------------------------------------------------------------------------------------\n");
        ReadableDataSource<String, List<DegradeRule>> degradeDataSource = new NacosDataSource<List<DegradeRule>>(nacosProperties, group,degradeDataId ,
                source -> JSON.parseObject(source, new TypeReference<List<DegradeRule>>() {
                }));
        DegradeRuleManager.register2Property(degradeDataSource.getProperty());


        // ParamFlowManager
        String paramFlowDataId = String.join("-", appName, "param-flow-rules.json");
        properties.put("paramFlowDataId", paramFlowDataId);
        properties.put("paramFlowComment","//--------------------------------------------------------------------------------------------------------------------------------\n//      字段名                     含义                                      取值\n//--------------------------------------------------------------------------------------------------------------------------------\n// resource\t            资源名                                      自定义\t\n//--------------------------------------------------------------------------------------------------------------------------------\n// count\t            限流阈值\t                                自定义\n//--------------------------------------------------------------------------------------------------------------------------------\n// grade\t            限流模式\t                                QPS模式（1）\n//--------------------------------------------------------------------------------------------------------------------------------\n// durationInSec\t    统计窗口时间长度（单位为秒）                  自定义\n//--------------------------------------------------------------------------------------------------------------------------------\n// controlBehavior\t    流控效果\t                                快速失败（0）\n//--------------------------------------------------------------------------------------------------------------------------------\n// maxQueueingTimeMs\t最大排队等待时长（仅在匀速排队模式生效）       自定义\n//--------------------------------------------------------------------------------------------------------------------------------\n// paramIdx\t            热点参数的索引位置\t                        自定义\n//--------------------------------------------------------------------------------------------------------------------------------\n// paramFlowItemList\t参数例外项                                  可以针对指定的参数值单独设置限流阈值，不受前面 count 阈值的限制。\n//                                                                 仅支持基本类型和字符串类型。\t\n//--------------------------------------------------------------------------------------------------------------------------------\n// clusterMode      \t是否是集群参数流控规则\t                      false\n//--------------------------------------------------------------------------------------------------------------------------------\n// clusterConfig\t    集群流控相关配置\t\n//--------------------------------------------------------------------------------------------------------------------------------\n");
        ReadableDataSource<String, List<ParamFlowRule>> paramFlowDataSource = new NacosDataSource<List<ParamFlowRule>>(nacosProperties, group,paramFlowDataId ,
                source -> JSON.parseObject(source, new TypeReference<List<ParamFlowRule>>() {
                }));
        ParamFlowRuleManager.register2Property(paramFlowDataSource.getProperty());


        // SystemManager
        String systemDataId = String.join("-", appName, "system-rules.json");
        properties.put("systemDataId", systemDataId);
        properties.put("systemComment","");
        ReadableDataSource<String, List<SystemRule>> systemDataSource = new NacosDataSource<List<SystemRule>>(nacosProperties, group,systemDataId ,
                source -> JSON.parseObject(source, new TypeReference<List<SystemRule>>() {
                }));
        SystemRuleManager.register2Property(systemDataSource.getProperty());


        // AuthorityManager
        String authorityDataId = String.join("-", appName, "auth-rules.json");
        properties.put("authorityDataId", authorityDataId);
        properties.put("authorityComment","// resource：资源名，即限流规则的作用对象。\n// limitApp：对应的黑名单/白名单，不同 origin 用 , 分隔，如 appA,appB。\n// strategy：限制模式，AUTHORITY_WHITE 为白名单模式(0)，AUTHORITY_BLACK 为黑名单模式(1)，默认为白名单模式。");
        ReadableDataSource<String, List<AuthorityRule>> authDataSource = new NacosDataSource<List<AuthorityRule>>(nacosProperties, group, authorityDataId,
                source -> JSON.parseObject(source, new TypeReference<List<AuthorityRule>>() {
                }));
        AuthorityRuleManager.register2Property(authDataSource.getProperty());

    }

    public static Properties getProperties() {
        return properties;
    }
}
