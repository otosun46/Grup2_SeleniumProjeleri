/**
 * @Author:Otosun Tarih :28/08/2020
 */
package Proje1.Part1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseStaticDriver;

public class Proje1_1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        // onceki projeden devam ediyorsaniz ust kisma gerek yok

        driver.get("http://demoqa.com/text-box");

        Thread.sleep(1000);

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Automation");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("name@example.com");

        WebElement cAddress = driver.findElement(By.id("currentAddress"));
        cAddress.sendKeys("Testing Current Address");

        WebElement pAddress = driver.findElement(By.id("permanentAddress"));
        pAddress.sendKeys("Testing Permanent Address");

        Thread.sleep(1000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(1000);

        WebElement name2 = driver.findElement(By.id("name"));
        String name2txt = name2.getText();

        WebElement email2 = driver.findElement(By.id("email"));
        String email2txt = email2.getText();


        Assert.assertEquals("Name:Automation", name2txt);
        Assert.assertEquals("Email:name@example.com", email2txt);
        driver.quit();

// sajhsdjkdhkldf
        // deneme yapiyorum
    }
}