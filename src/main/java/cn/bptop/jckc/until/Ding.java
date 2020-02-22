package cn.bptop.jckc.until;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.request.OapiUserGetRequest;
import com.dingtalk.api.request.OapiUserGetuserinfoRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.dingtalk.api.response.OapiUserGetResponse;
import com.dingtalk.api.response.OapiUserGetuserinfoResponse;
import com.taobao.api.ApiException;

public class Ding
{
    /**
     * 钉钉内部免登
     *
     * @param
     * @return:
     * @time: 2020/2/22 11:45
     */
    public static String getDdUserId(String authCode) throws ApiException
    {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/user/getuserinfo");
        OapiUserGetuserinfoRequest request = new OapiUserGetuserinfoRequest();
        request.setCode(authCode);
        request.setHttpMethod("GET");
        OapiUserGetuserinfoResponse response = client.execute(request, getAccessToken());
        //
        return response.getUserid();
    }

    /**
     * 获取钉钉用户详情
     *
     * @param
     * @return:
     * @time: 2020/2/22 11:44
     */
    public static OapiUserGetResponse getDdUser(String userId) throws ApiException
    {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/user/get");
        OapiUserGetRequest request = new OapiUserGetRequest();
        request.setUserid(userId);
        request.setHttpMethod("GET");
        OapiUserGetResponse response = client.execute(request, getAccessToken());
        return response;
    }

    /**
     * 获取钉钉access_token
     *
     * @param
     * @return: access_token
     * @time: 2020/2/22 11:41
     */
    public static String getAccessToken() throws ApiException
    {
        DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
        OapiGettokenRequest request = new OapiGettokenRequest();
        request.setAppkey("dingwvghfgnxe1ltzj48");
        request.setAppsecret("F-hmLv6rFqKX9spKYkz0KS9Qx2SNQiUCxUEBe63GibkfYN8vT4SCMABGZRKSMB5Z");
        request.setHttpMethod("GET");
        OapiGettokenResponse response = client.execute(request);
        return response.getAccessToken();
    }
}
