import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseStaticDriver;

/**
 * @Author:Otosun Tarih :30/08/2020
 */

public class BaseMain extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        // onceki projeden devam ediyorsaniz ust kisma gerek yok

        driver.get("http://demoqa.com/text-box");

        Thread.sleep(3000);


        driver.quit();

    }
}
