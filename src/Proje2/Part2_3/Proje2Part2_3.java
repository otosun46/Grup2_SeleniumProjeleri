/**
 * @Author:Otosun Tarih :04/09/2020
 */
package Proje2.Part2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.BaseStaticDriver;

public class Proje2Part2_3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(500);
        driver.findElement(By.id("user_login")).sendKeys("username");
        Thread.sleep(500);
        driver.findElement(By.id("user_password")).sendKeys("password");
        Thread.sleep(500);
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.id("pay_bills_tab")).click();
        driver.findElement(By.xpath("//a[@href='#ui-tabs-3']")).click();
        Thread.sleep(500);
        WebElement Currency = driver.findElement(By.id("pc_currency"));
        Thread.sleep(500);
        Select Curr = new Select(Currency);
        Curr.selectByIndex(randomNum(15));//randomNum(5)
        driver.findElement(By.id("pc_amount")).sendKeys("1200");
        driver.findElement(By.id("pc_inDollars_true")).click();
        driver.findElement(By.id("purchase_cash")).click();
        Thread.sleep(500);
        String yazi= driver.findElement(By.xpath("//div[@id='alert_content']")).getText();
        System.out.println(yazi);
        Assert.assertTrue(yazi.equals("Foreign currency cash was successfully purchased."));

        Thread.sleep(3000);
        driver.close();

    }
    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
}
