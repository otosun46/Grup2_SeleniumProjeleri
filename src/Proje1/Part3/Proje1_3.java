/**
 * @Author:Otosun Tarih :28/08/2020
 */
package Proje1.Part3;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseStaticDriver;

public class Proje1_3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {


        driver.get("https://www.snapdeal.com/");

        WebElement searchbar = driver.findElement(By.id("inputValEnter"));
        searchbar.sendKeys("teddy bear");

        WebElement searchbutton = driver.findElement(By.className("searchformButton"));
        searchbutton.click();

        Thread.sleep(1000);

        WebElement result = driver.findElement(By.className("nnn"));
        String resulttxt = result.getText();
        WebElement logo = driver.findElement(By.cssSelector(".notIeLogoHeader.aspectRatioEqual.sdLogo.cur-pointer"));
        logo.click();
        String curl = driver.getCurrentUrl();
        Assert.assertEquals("We've got 1499 results for 'teddy bear'",resulttxt);
        Assert.assertEquals(curl,"https://www.snapdeal.com/");

        driver.quit();
    }
}
