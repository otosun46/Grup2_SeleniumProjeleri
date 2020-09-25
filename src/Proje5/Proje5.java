/**
 * @Author:Otosun Tarih :25/09/2020
 */
package Proje5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseStaticDriver;

import java.util.Set;

public class Proje5 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demowebshop.tricentis.com/");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        String facebookLink="facebook";
        String mainPage = driver.getWindowHandle();
        WebElement login=driver.findElement(By.cssSelector(".ico-login"));
        login.click();
        WebElement mail=driver.findElement(By.id("Email"));
        mail.clear();
        mail.sendKeys("asds123@gmail.com");
        WebElement password=driver.findElement(By.id("Password"));
        password.clear();
        password.sendKeys("HasSah123");
        WebElement loginButton=driver.findElement(By.className("login-button"));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(1000);
        WebElement facebookText=driver.findElement(By.xpath("//li[@class='facebook']"));
        wait.until(ExpectedConditions.visibilityOf(facebookText));
        Thread.sleep(1000);
        facebookText.click();

        Set<String> windowsID = driver.getWindowHandles();
        for (String IDs : windowsID) {
            // System.out.println(IDs);
            if (IDs.equals(mainPage)) continue;
            driver.switchTo().window(IDs);
        }
        String urlFacebook=driver.getCurrentUrl();
        Assert.assertTrue(urlFacebook.contains(facebookLink));
        Thread.sleep(3000);
        driver.close();
    }
}
