package qzx.auto;

import com.alibaba.fastjson.JSON;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qzx.jsonParam.PheadParam;
import qzx.model.homePage.JsonHomePageBean;
import qzx.utils.HttpClientUtil;
import qzx.utils.SignInUtil;

import java.io.IOException;

public class HomePage {

    /**
     * 登录接口 10001
     * http://test.vipgift.gmilesquan.com/quAccount/common?funid=10001&shandle=0&handle=0
     */
    public String token;
    public String phoneId;

    @BeforeClass
    public void signIn() throws IOException {
        //token = SignInUtil.getToken();
        token = SignInUtil.getToken().getAccount().getAccessToken();
        phoneId = SignInUtil.getToken().getAccount().getPhoneId();
    }

    /**
     * 首页 30001接口
     * http://test.vipgift.gmilesquan.com/quMall/common?funid=30001&shandle=0&handle=0
     */
    @Test // (dependsOnMethods = {"getZeroStatus"})  依赖测试
    public void homePage() throws IOException {
        String domainDev = "http://test.vipgift.gmilesquan.com";
        String URL = "/quMall/common?funid=30001&shandle=0&handle=0";


        String variable = "\"tabId\":\"1000\",\"personal\":1";

        String param = PheadParam.getPhead(token,phoneId,variable);
        String result = HttpClientUtil.SendHttpRequest("POST", domainDev + URL, param);
        // System.out.println("---------   " + result);

        JsonHomePageBean jsonHomePageBean = JSON.parseObject(result, JsonHomePageBean.class);//json字符串转对象

        if (jsonHomePageBean.getModuleDtoList().get(4).getTitle().equals("趣玩福利社")) { // 返回的状态为 1 表示登录成功
            System.out.println("校验通过, [趣玩福利社] 入口");
        } else {
            System.out.println("校验失败 , " + jsonHomePageBean.getModuleDtoList().get(4).getTitle());
        }
    }
}
