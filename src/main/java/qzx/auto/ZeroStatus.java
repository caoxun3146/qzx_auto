package qzx.auto;

import com.alibaba.fastjson.JSON;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qzx.jsonParam.PheadParam;
import qzx.model.homePage.JsonHomePageBean;
import qzx.model.zeroStatus.JsonZeroStatusBean;
import qzx.utils.HttpClientUtil;
import qzx.utils.SignInUtil;

import java.io.IOException;

public class ZeroStatus {
    /**
     * 登录接口 10001
     * http://test.vipgift.gmilesquan.com/quAccount/common?funid=10001&shandle=0&handle=0
     */
    public String token;
    public String phoneId;

    @BeforeClass
    public void signIn() throws IOException {
        token = SignInUtil.getToken().getAccount().getAccessToken();
        phoneId = SignInUtil.getToken().getAccount().getPhoneId();
    }

    /**
     * 获取用户新人资格
     * http://test.vipgift.gmilesquan.com/quMall/common?funid=30521&shandle=0&handle=0
     */
    @Test
    void getZeroStatus() throws IOException {
        String domainDev = "http://test.vipgift.gmilesquan.com";
        String URL = "/quMall/common?funid=30521&shandle=0&handle=0";

        String variable = "";

        String param = PheadParam.getPhead(token,"");
        String result = HttpClientUtil.SendHttpRequest("POST", domainDev + URL, param);
        System.out.println("---------   " + result);

        JsonZeroStatusBean jsonZeroStatusBean = JSON.parseObject(result, JsonZeroStatusBean.class);//json字符串转对象

        if (jsonZeroStatusBean.getOpStatus() == 1) { // 返回的状态为 1 表示登录成功
            System.out.println("新客, " + jsonZeroStatusBean.getOpMessage());
        } else {
            System.out.println("老用户 , " + jsonZeroStatusBean.getOpMessage());
        }
    }
}
