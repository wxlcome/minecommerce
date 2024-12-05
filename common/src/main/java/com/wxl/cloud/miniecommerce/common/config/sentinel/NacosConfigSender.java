//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.wxl.cloud.miniecommerce.common.config.sentinel;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;

public class NacosConfigSender {

    private ConfigService configService;
    private final String group;

    public NacosConfigSender() {

        Properties nacosProperties = new Properties();
        nacosProperties.put(PropertyKeyConst.SERVER_ADDR, RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.server-addr"));
        nacosProperties.put(PropertyKeyConst.USERNAME, RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.username"));
        nacosProperties.put(PropertyKeyConst.PASSWORD, RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.password"));
        nacosProperties.put(PropertyKeyConst.NAMESPACE, RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.config.namespace"));
        group = RuleCenterInitFunc.getProperties().getProperty("spring.cloud.nacos.config.group") + "_SENTINEL_RULE";
        try {
            configService = NacosFactory.createConfigService(nacosProperties);
        } catch (NacosException e) {
            throw new RuntimeException(e);
        }
    }


    public void sendConfigJson(String prefix, String data) {
        try {
            String dataId = RuleCenterInitFunc.getProperties().getProperty(prefix + "DataId");
            String comment = RuleCenterInitFunc.getProperties().getProperty(prefix + "Comment");
            data = data + "\n" + comment;
            configService.publishConfig(dataId, group, data, "json");
        } catch (Exception var5) {
            throw new RuntimeException(var5);
        }
    }

}
