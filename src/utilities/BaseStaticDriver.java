/**
 * @Author:Otosun Tarih :30/08/2020
 */
package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BaseStaticDriver {
    public static WebDriver driver;
    static {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

}
