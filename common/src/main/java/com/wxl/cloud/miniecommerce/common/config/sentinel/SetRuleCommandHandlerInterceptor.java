package com.wxl.cloud.miniecommerce.common.config.sentinel;

import com.alibaba.csp.sentinel.command.CommandHandlerInterceptor;
import com.alibaba.csp.sentinel.command.CommandRequest;
import com.alibaba.csp.sentinel.command.CommandRequestExecution;
import com.alibaba.csp.sentinel.command.CommandResponse;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * @ClassName  ：SetRuleCommandHandlerInterceptor
 * @description：自定义类
 * @author     ：wxl
 * @date       ：2024/11/13 12:17
 */
public class SetRuleCommandHandlerInterceptor<R> implements CommandHandlerInterceptor<R> {

    private static final Pattern COMMAND_NAME_PATTERN = Pattern.compile("(set.*Rules)|(gateway/update.*)");
    private static final String COMMON_TARGETS = "setRules";
    private static final String PARAM_FLOW_TARGETS = "setParamFlowRules";
    private static final String GATEWAY_FLOW_TARGETS = "gateway/updateRules";
    private static final String GATEWAY_API_DEFINITION_TARGETS = "gateway/updateApiDefinitions";

    private NacosConfigSender configSender;

    @Override
    public boolean shouldIntercept(String commandName) {
        return COMMAND_NAME_PATTERN.matcher(commandName).matches();
    }

    @Override
    public CommandResponse<R> intercept(CommandRequest request, CommandRequestExecution<R> execution) {

        if (configSender == null)
            configSender = new NacosConfigSender();

        String commandTarget = request.getMetadata().get("command-target");
        Map<String, String> map = request.getParameters();
        String data = map.get("data");
        String type = "";

        if (COMMON_TARGETS.equals(commandTarget))
            type = map.get("type");
        else if (PARAM_FLOW_TARGETS.equals(commandTarget))
            type = "paramFlow";
        else if (GATEWAY_FLOW_TARGETS.equals(commandTarget))
            type = "gatewayFlow";
        else if (GATEWAY_API_DEFINITION_TARGETS.equals(commandTarget))
            type = "gatewayApiDefinition";

        configSender.sendConfigJson(type, data);

        return execution.execute(request);
    }
}
