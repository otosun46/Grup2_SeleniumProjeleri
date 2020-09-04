/**
 * @Author:Otosun Tarih :04/09/2020
 */
package Proje2.Part2_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseStaticDriver;

public class Proje2Part2_1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(500);
        driver.findElement(By.id("user_login")).sendKeys("username");
        Thread.sleep(500);
        driver.findElement(By.id("user_password")).sendKeys("password");
        Thread.sleep(500);
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.id("transfer_funds_tab")).click();

        WebElement FromAccount = driver.findElement(By.id("tf_fromAccountId"));
        Select Account = new Select(FromAccount);
        Account.selectByIndex(randomNum(5));//randomNum(5)
        WebElement ToAccount = driver.findElement(By.id("tf_toAccountId"));
        Select Account1 = new Select(ToAccount);
        Account1.selectByIndex(randomNum(5));//randomNum(5)
        driver.findElement(By.id("tf_amount")).sendKeys("2500");
        driver.findElement(By.id("tf_description")).sendKeys("Para yatirildi");
        Thread.sleep(500);
        driver.findElement(By.id("btn_submit")).click();
        Thread.sleep(500);
        driver.findElement(By.id("btn_submit")).click();

        Thread.sleep(3000);
        //driver.close();

    }
    public static int randomNum(int max) {
        int value = 0;
        value = (int) (Math.random() * max + 1);
        return value;
    }
}
