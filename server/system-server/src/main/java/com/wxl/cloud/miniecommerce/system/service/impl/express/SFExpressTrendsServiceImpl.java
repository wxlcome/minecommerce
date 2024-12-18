package com.wxl.cloud.miniecommerce.system.service.impl.express;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.wxl.cloud.miniecommerce.system.service.ExpressTrendsService;
import com.wxl.cloud.miniecommerce.system.vo.admin.ExpressTrends;
import lombok.Data;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName  ：SFExpressTrendsServiceImpl
 * @description：顺丰快递动态查询
 * @author     ：wxl
 * @date       ：2024/12/14 16:19
 */
@Service("SFExpressTrendsService")
public class SFExpressTrendsServiceImpl implements ExpressTrendsService {
    private final static String API = "https://sfapi.sf-express.com"; // 生产环境
    private final static NameValuePair PARTNER_ID = new BasicNameValuePair("partnerID", "Y4VACJBS"); // 顾客编码
    private final static NameValuePair SECRET = new BasicNameValuePair("secret", "UyYTiOMHZeV2J1Y25iyhuoS62FYZwyhr"); // 校验码
    private static final CloseableHttpClient client = HttpClients.createDefault();

    @Override
    public List<ExpressTrends> query(String expressNo, String phone) {

        ArrayList<ExpressTrends> trends = new ArrayList<>();

        HttpPost request = new HttpPost(API + "/std/service");
        request.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");

        BasicNameValuePair requestID = new BasicNameValuePair("requestID", UUID.randomUUID().toString()); // 请求唯一号UUID
        BasicNameValuePair serviceCode = new BasicNameValuePair("serviceCode", "EXP_RECE_SEARCH_ROUTES"); // 接口服务代码
        BasicNameValuePair timestamp = new BasicNameValuePair("timestamp", System.currentTimeMillis() + ""); // 调用接口时间戳
        BasicNameValuePair accessToken = new BasicNameValuePair("accessToken", getAccessToken()); // 访问令牌，使用OAuth2方式认证时必填
        MsgData data = new MsgData(List.of("SF0264209366935"), "0214");
        BasicNameValuePair msgData = new BasicNameValuePair("msgData", JSONObject.toJSONString(data)); // 业务数据报文

        request.setEntity(new UrlEncodedFormEntity(List.of(PARTNER_ID,requestID, serviceCode, timestamp, accessToken, msgData), StandardCharsets.UTF_8));

        try (CloseableHttpResponse response = client.execute(request)) {
            String json = EntityUtils.toString(response.getEntity()); // 获取返回的字符串
            JSONObject jsonObject = JSONObject.parseObject(json);// 转换为json对象
            String apiResultDataStr = jsonObject.getString("apiResultData");// 获取result
            JSONObject apiResultData = JSONObject.parseObject(apiResultDataStr);
            if(apiResultData.containsKey("msgData")){
                JSONObject msgDataJson = apiResultData.getJSONObject("msgData");
                if(msgDataJson.containsKey("routeResps")){
                    JSONArray routeResps = msgDataJson.getJSONArray("routeResps");
                    JSONObject element = routeResps.getJSONObject(0);
                    JSONArray routes = element.getJSONArray("routes");

                    routes.forEach(route -> {
                        JSONObject obj = (JSONObject)route;
                        String status = "[%s] %s".formatted(obj.getString("firstStatusName"),obj.getString("remark"));
                        ExpressTrends expressTrends = new ExpressTrends(status, obj.getString("acceptTime"));
                        trends.add(expressTrends);
                    });
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        trends.sort((t1,t2)-> t2.getTime().compareTo(t1.getTime()));

        return trends;
    }


    private String getAccessToken() {

        HttpPost request = new HttpPost(API + "/oauth2/accessToken");
        request.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        BasicNameValuePair grantType = new BasicNameValuePair("grantType", "password");
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(List.of(PARTNER_ID, SECRET, grantType));

        request.setEntity(entity);

        try (CloseableHttpResponse response = client.execute(request)) {
            String json = EntityUtils.toString(response.getEntity()); // 获取返回的字符串
            JSONObject jsonObject = JSONObject.parseObject(json);// 转换为json对象
            if (jsonObject.containsKey("accessToken")) {
                return jsonObject.getString("accessToken");
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Data
    private static class MsgData{
        public MsgData(List<String> trackingNumber, String checkPhoneNo) {
            this.trackingNumber = trackingNumber;
            this.checkPhoneNo = checkPhoneNo;
        }

        String language = "zh-CN"; // 响应报文的语言， 缺省值为zh-CN，目前支持以下值zh-CN 表示中文简体， zh-TW或zh-HK或 zh-MO表示中文繁体， en表示英文
        Integer trackingType = 1; // 查询号类别: 1:根据顺丰运单号查询,trackingNumber将被当作顺丰运单号处理 2:根据客户订单号查询,trackingNumber将被当作客户订单号处理
        List<String> trackingNumber; // 查询号: trackingType=1,则此值为顺丰运单号 如果trackingType=2,则此值为客户订单号
        Integer methodType = 1; // 路由查询类别: 1:标准路由查询 2:定制路由查询
        String checkPhoneNo; // 电话号码验证 后4位
    }
}
