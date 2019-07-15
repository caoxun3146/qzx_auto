package qzx.auto;

import com.alibaba.fastjson.JSON;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qzx.jsonParam.JsonParameter;
import qzx.jsonParam.PheadParam;
import qzx.model.commodityDetails.JsonCommodityDetailsBean;
import qzx.model.signIn.JsonSignInBean;
import qzx.utils.HttpClientUtil;
import qzx.utils.SignInUtil;

import java.io.IOException;

public class CommodityDetails {

    public String token ;
    @BeforeClass
    public void signIn() throws IOException {
        token = SignInUtil.getToken();
    }

    /**
     * 商品详情 30300 接口
     * http://test.vipgift.gmilesquan.com/quMall/common?funid=30300&shandle=0&handle=0
     */
    @Test
    public void  queryDetails() throws IOException {
        String domainDev = "http://test.vipgift.gmilesquan.com";
        String URL = "/quMall/common?funid=30300&shandle=0&handle=0";
        //String param = JsonParameter.getCommodity(token);
        String variable = "\"sourceId\":\"541009939400\",\"bussType\":0";
        String param = PheadParam.getPhead(variable);

        String result = HttpClientUtil.SendHttpRequest("POST", domainDev + URL, param);

        //System.out.println(result);

        JsonCommodityDetailsBean jsonCommodityDetailsBean = JSON.parseObject(result, JsonCommodityDetailsBean.class);//json字符串转对象

        if(jsonCommodityDetailsBean.getResult().getStatus() == 1){ // 返回的状态为 1 表示登录成功
            System.out.println("校验通过, [获取商品信息] " + jsonCommodityDetailsBean.getProductInfo().getTitle());
        }else {
            System.out.println("校验失败,  获取商品信息");
        }
    }
}
