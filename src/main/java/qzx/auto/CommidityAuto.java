package qzx.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qzx.stage.ForwardCommidityListPage;
import qzx.stage.Login;

public class CommidityAuto  {
    WebDriver driver ;
    @BeforeClass
    public void set() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
    }
    @Test
    public void test() throws InterruptedException {
        driver =  new ChromeDriver();
        Login.loginCase(driver);
        Thread.sleep(2000);
        ForwardCommidityListPage.forwardCommidity(driver);
        Thread.sleep(2000);
        ForwardCommidityListPage.addCommidity(driver);

    }

    @AfterClass
    public void exit() throws InterruptedException {
        Thread.sleep(10000);
        Login.exitCast(driver);
    }
}
