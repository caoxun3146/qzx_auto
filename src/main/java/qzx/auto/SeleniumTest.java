package qzx.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
    WebDriver driver;
    @BeforeClass
    public void set() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        // chrome正受到自动测试软件的控制 ；如何去除？

        driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize(); // 浏览器最大化操作
    }

    @Test
    public void test() throws InterruptedException {

        driver.findElement(By.name("wd")).sendKeys("chrome正受到自动测试软件的控制");
        driver.findElement(By.name("su")).click();
    }

    @AfterClass
    public void exit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
