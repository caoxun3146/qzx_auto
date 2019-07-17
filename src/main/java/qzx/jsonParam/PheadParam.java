package qzx.jsonParam;

public class PheadParam {
    public static String getPhead(String token, String variable) {

        if(variable.equals("")){
            String phead = "{\n" +
                    "\t\"handle\": 0,\n" +
                    "\t\"shandle\": 0,\n" +
                    "\t\"data\": {\n" +
                    "\t\t\"phead\": {\n" +
                    "\t\t\t\"pversion\": 92,\n" +
                    "\t\t\t\"phoneid\": \"0776f3c9876341ad\",\n" +
                    "\t\t\t\"phone\": \"vivo Y85A\",\n" +
                    "\t\t\t\"imei\": \"869701031290789\",\n" +
                    "\t\t\t\"cversion\": 144,\n" +
                    "\t\t\t\"cversionname\": \"2.22.0\",\n" +
                    "\t\t\t\"channel\": \"91000\",\n" +
                    "\t\t\t\"lang\": \"zh_cn\",\n" +
                    "\t\t\t\"sdk\": 27,\n" +
                    "\t\t\t\"imsi\": \"46002\",\n" +
                    "\t\t\t\"sys\": \"8.1.0\",\n" +
                    "\t\t\t\"lng\": -1,\n" +
                    "\t\t\t\"lat\": -1,\n" +
                    "\t\t\t\"cityid\": -1,\n" +
                    "\t\t\t\"gcityid\": -1,\n" +
                    "\t\t\t\"platform\": \"android\",\n" +
                    "\t\t\t\"prdid\": \"14000\",\n" +
                    "\t\t\t\"time_zone\": \"GMT+08:00\",\n" +
                    "\t\t\t\"timezoneid\": \"Asia\\/Shanghai\",\n" +
                    "\t\t\t\"dpi\": \"1080*2280\",\n" +
                    "\t\t\t\"user_create_time\": \"2019-07-16 17:54:41\",\n" +
                    "\t\t\t\"access_token\": \""+token+"\",\n" +
                    "\t\t\t\"net\": \"WIFI\",\n" +
                    "\t\t\t\"mac\": \"4C:C0:0A:C5:E3:41\",\n" +
                    "\t\t\t\"shumei_deviceid\": \"20190621155528a69a3302e1001f77ddf943d45e11a59401df01ad1dde90df\",\n" +
                    "\t\t\t\"vendor\": \"vivo\",\n" +
                    "\t\t\t\"ua\": \"Mozilla\\/5.0 (Linux; Android 8.1.0; vivo Y85A Build\\/OPM1.171019.011; wv) AppleWebKit\\/537.36 (KHTML, like Gecko) Version\\/4.0 Chrome\\/62.0.3202.84 Mobile Safari\\/537.36\"\n" +
                    "\t\t}\n" +
                    "\t}\n" +
                    "}";

            return phead;
        }else {
            String phead = "{\n" +
                    "\t\"handle\": 0,\n" +
                    "\t\"shandle\": 0,\n" +
                    "\t\"data\": {\n" +
                    "\t\t\"phead\": {\n" +
                    "\t\t\t\"pversion\": 92,\n" +
                    "\t\t\t\"phoneid\": \"0776f3c9876341ad\",\n" +
                    "\t\t\t\"phone\": \"vivo Y85A\",\n" +
                    "\t\t\t\"imei\": \"869701031290789\",\n" +
                    "\t\t\t\"cversion\": 144,\n" +
                    "\t\t\t\"cversionname\": \"2.22.0\",\n" +
                    "\t\t\t\"channel\": \"91000\",\n" +
                    "\t\t\t\"lang\": \"zh_cn\",\n" +
                    "\t\t\t\"sdk\": 27,\n" +
                    "\t\t\t\"imsi\": \"46002\",\n" +
                    "\t\t\t\"sys\": \"8.1.0\",\n" +
                    "\t\t\t\"lng\": -1,\n" +
                    "\t\t\t\"lat\": -1,\n" +
                    "\t\t\t\"cityid\": -1,\n" +
                    "\t\t\t\"gcityid\": -1,\n" +
                    "\t\t\t\"platform\": \"android\",\n" +
                    "\t\t\t\"prdid\": \"14000\",\n" +
                    "\t\t\t\"time_zone\": \"GMT+08:00\",\n" +
                    "\t\t\t\"timezoneid\": \"Asia\\/Shanghai\",\n" +
                    "\t\t\t\"dpi\": \"1080*2280\",\n" +
                    "\t\t\t\"user_create_time\": \"2019-07-12 18:04:37\",\n" +
                    "\t\t\t\"access_token\": \""+token+"\",\n" +
                    "\t\t\t\"net\": \"WIFI\",\n" +
                    "\t\t\t\"mac\": \"4C:C0:0A:C5:E3:41\",\n" +
                    "\t\t\t\"shumei_deviceid\": \"20190621155528a69a3302e1001f77ddf943d45e11a59401df01ad1dde90df\",\n" +
                    "\t\t\t\"vendor\": \"vivo\",\n" +
                    "\t\t\t\"ua\": \"Mozilla\\/5.0 (Linux; Android 8.1.0; vivo Y85A Build\\/OPM1.171019.011; wv) AppleWebKit\\/537.36 (KHTML, like Gecko) Version\\/4.0 Chrome\\/62.0.3202.84 Mobile Safari\\/537.36\"\n" +
                    "\t\t},\n" +
                    ""+variable+"" +
                    "\t}\n" +
                    "}";

            return phead;
        }


    }
}
