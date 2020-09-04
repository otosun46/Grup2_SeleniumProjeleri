/**
 * @Author:Otosun Tarih :04/09/2020
 */
package Proje2.Part2_1;

import org.openqa.selenium.By;
import utilities.BaseStaticDriver;

public class Proje2Part2_1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demo.applitools.com/");
        Thread.sleep(500);
        driver.findElement(By.id("username")).sendKeys("ttechno@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("techno123.");
        Thread.sleep(500);
        driver.findElement(By.id("log-in")).click();


        Thread.sleep(3000);
       // driver.close();

    }
}
