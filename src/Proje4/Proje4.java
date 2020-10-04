/**
 * @Author:Otosun Tarih :18/09/2020
 */
package Proje4;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BaseStaticDriver;

import java.util.Set;

public class Proje4 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.e-shopland.ch/sellacious/index.php");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        String mainPage = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"sella125\"]/div[1]/i[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"finder125\"]")).sendKeys("Canon");
        driver.findElement(By.xpath("//*[@id=\"finder-search\"]/div/div[1]/button")).click();
        driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-add-cart buy'])[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"cart-items\"]/div/div[4]/div/div[2]/div/a[1]/button")).click();
        driver.findElement(By.id("login_email")).sendKeys("grup2@gmail.com");
        driver.findElement(By.id("login_email_submit")).click();
        driver.findElement(By.id("btn_guest_checkout")).click();
        driver.findElement(By.id("jform0_name")).sendKeys("Semih");
        int randulke = randomNum(250);
        String path = "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[" + randulke + "]";
        driver.findElement(By.xpath("//span[@id='select2-chosen-3']")).click();
        WebElement ulke=driver.findElement(By.xpath(path));

        ulke.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-save-address'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-small btn-default btn-bill-here']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-small btn-default btn-ship-here']")).click();
        driver.findElement(By.xpath("(//a[@class='btn btn-small btn-default btn-next pull-right'])[1]")).click();
        //js.executeScript("window.scrollBy(0,500)");
        WebElement next2 = driver.findElement(By.xpath("//*[@id=\"shippingform-editor\"]/a"));
        wait.until(ExpectedConditions.visibilityOf(next2));
        next2.click();
        driver.findElement(By.xpath("//*[@id=\"summary-items\"]/div/div[4]/div[2]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/form/table[2]/tfoot/tr/td/button")).click();
        WebElement approved = driver.findElement(By.xpath("//*[@id=\"system-message\"]/div[1]/div/p"));
        String apptxt = approved.getText();
        System.out.println(apptxt);
        Assert.assertEquals("Payment via Cheque approved.", apptxt);
        WebElement success = driver.findElement(By.xpath("//*[@id=\"system-message\"]/div[2]/h4"));
        String successtxt = success.getText();
        Assert.assertEquals(successtxt, "success");
        driver.findElement(By.xpath("//*[@id=\"orderForm\"]/div[2]/div/a[2]/button")).click();
        WebElement cam1 = driver.findElement(By.xpath("//*[@id=\"orderForm\"]/div[3]/div/div/div[1]/div/div[2]/h3/a"));
        String cam1txt = cam1.getText();
        System.out.println(cam1txt);

        Set<String> windowsID = driver.getWindowHandles();
        for (String IDs : windowsID) {
            // System.out.println(IDs);
            if (IDs.equals(mainPage)) continue;
            driver.switchTo().window(IDs);
        }
        WebElement cam2 = driver.findElement(By.xpath("/html/body/div[2]/table[2]/tbody/tr/td[1]"));
        String cam2txt = cam2.getText();
        System.out.println(cam2txt);
        Assert.assertEquals("Hatali urun ismi", cam2txt.contains(cam1txt));
        Thread.sleep(3000);
        driver.quit();
    }

    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
}
