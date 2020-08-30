/**
 * @Author:Otosun Tarih :28/08/2020
 */
package Proje1.Part2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseStaticDriver;

public class Proje1_2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demo.applitools.com/");

        Thread.sleep(1000);

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("techno123.");

        WebElement signinbutton = driver.findElement(By.id("log-in"));
        signinbutton.click();

        Thread.sleep(1000);

        WebElement time = driver.findElement(By.id("time"));
        String timetxt = time.getText();

        String curl = driver.getCurrentUrl();

        Assert.assertEquals("Your nearest branch closes in: 30m 5s",timetxt);
        Assert.assertEquals("https://demo.applitools.com/app.html",curl);
        driver.quit();

    }
}
