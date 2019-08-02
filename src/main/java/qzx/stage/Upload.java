package qzx.stage;

import java.io.IOException;

public class Upload {
    /**
     * 非input输入框上传，需要传入上传脚本的执行文件路径、浏览器、图片地址
     * 框架中已经存有2张待用图片，传入响应参数即可
     * TEST_PICTURE_PATH_1
     * TEST_PICTURE_PATH_2
     *
     */
    public static void uploadFile(String picPath) throws InterruptedException {
        Runtime r = Runtime.getRuntime();
        String browser="chrome";
      /*  if(TEST_BROWSER.equalsIgnoreCase("chrome")){
            browser="chrome";
        }else if(TEST_BROWSER.equalsIgnoreCase("ie")){
            browser="ie";
        }*/
        try {
            r.exec("D:\\Program Files (x86)\\AutoIt3\\SciTE\\upload.exe"+" "+browser+" "+picPath);
            //log.info("upload file：" + picPath);
        } catch (IOException e) {
            e.printStackTrace();
            //log.error("Run upload.exe fail");
        }
        //等待上传完成
        ///this.sleep();
        Thread.sleep(3000);
    }
}
