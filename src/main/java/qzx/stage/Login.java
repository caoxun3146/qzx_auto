package qzx.stage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login  {


    public static void loginCase(WebDriver driver) throws InterruptedException {

        driver.get("http://test.yingzhongshare.com/el-manager/index.html?_date=1564542117463#/login?redirect=%2Fhome");
        driver.manage().window().maximize(); // 浏览器最大化操作

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[1]/div/form/div[4]/button/span")).click();
    }

    public static void exitCast(WebDriver driver){
        driver.quit();;
    }

}
