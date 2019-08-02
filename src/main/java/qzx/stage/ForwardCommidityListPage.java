package qzx.stage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForwardCommidityListPage {

    /**
     * 跳转至商品列表 --> 查询商品 -->  点击发布商品
     * @param driver
     * @throws InterruptedException
     */
    public static void forwardCommidity(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/ul/div[8]/div/li/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/ul/div[8]/div/li/ul/a/li/span")).click();
        Thread.sleep(4000);
        // 点击查询
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div/div[1]/div[2]/div[2]/div/button[1]/span")).click();
        Thread.sleep(3000);
        // 发布商品按钮
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div/div[2]/div/div[1]/div[1]/div[1]/button/span")).click();
    }

    /**
     * 添加商品
     * @param driver
     */
    public static void addCommidity(WebDriver driver) throws InterruptedException {
        // 商品标题
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[1]/form/div[1]/div/div/textarea")).sendKeys("格力空调");
        Thread.sleep(3000);
        // 添加主图
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[1]/form/div[3]/div/div/div/div[1]/div[1]")).click();
        Thread.sleep(5000);
        String imgPath = "E:\\截图\\有赞后台图片\\主题-6.jpg";
        Upload.uploadFile(imgPath);   // 上传图片

        // 编码明细
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[2]/form/div[1]/div/div/div[1]/div/div/input")).sendKeys("541883126599");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[2]/form/div[1]/div/div/div[2]/div/div/input")).sendKeys("5");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[2]/form/div[1]/div/div/div[3]/div/div/input")).sendKeys("5");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[2]/form/div[1]/div/div/div[4]/div/div[1]/input")).sendKeys("5");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[2]/form/div[1]/div/div/div[5]/div/div/input")).sendKeys("5");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[1]/form/div[3]/div/div/div/div[1]/div[1]")).sendKeys("E:/截图/有赞后台图片/主题-6.jpg");

        Thread.sleep(2000);
        // 上传商详图
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[3]/div[2]/div/div[1]/div/div[1]/span[14]/button[1]")).click();
        // +
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div/div[1]/div[1]/i")).click();
        Upload.uploadFile(imgPath);   // 上传图片
        // 确定上传
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/button[2]/span")).click();

        // 提交表单
        //driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div/section/div/div[2]/div[5]/button[1]/span")).click();

    }
}
