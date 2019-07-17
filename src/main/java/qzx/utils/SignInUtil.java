package qzx.utils;

import com.alibaba.fastjson.JSON;
import qzx.jsonParam.JsonParameter;
import qzx.model.signIn.JsonSignInBean;
import java.io.IOException;

public class SignInUtil {

    public static JsonSignInBean getToken() throws IOException {
        String domainDev = "http://test.vipgift.gmilesquan.com";
        String URL = "/quAccount/common?funid=10001&shandle=0&handle=0";
        String param = JsonParameter.getSignInJson();

        String result = HttpClientUtil.SendHttpRequest("POST", domainDev + URL, param);

        JsonSignInBean jsonSignInBean = JSON.parseObject(result, JsonSignInBean.class);//json字符串转对象

        if(jsonSignInBean.getResult().getStatus() == 1){ // 返回的状态为 1 表示登录成功
            //System.out.println("登录成功, token : " + jsonSignInBean.getAccount().getAccessToken());
            //return jsonSignInBean.getAccount().getAccessToken();
            return jsonSignInBean;
        }else {
            System.out.println("登录失败");
            return null;
        }

    }
}
