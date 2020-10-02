/**
 * @Author:Otosun Tarih :17/09/2020
 */
package Proje6.POM_template;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class MetodWebDriver_nonLogin {
    public static WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        Point pozisyon=new Point(480,0);
        //  driver.manage().window().setPosition(pozisyon);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

    }
    @AfterClass
    public void  afterClass() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

}
