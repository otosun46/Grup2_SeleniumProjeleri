/**
 * @Author:Otosun Tarih :29/09/2020
 */
package Proje6.POM_template;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class POM_Part1 extends MetodWebDriver_nonLogin {
    @Test
    @Parameters({"email","password"})
    public void ProcedToCheckout(String email,String password) throws InterruptedException {
        driver.get("http://demowebshop.tricentis.com/");
        POM_Elements pomElements=new POM_Elements(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        pomElements.login.click();
        pomElements.email.sendKeys(email);
        pomElements.password.sendKeys(password);
        pomElements.loginButton.click();
        pomElements.contact_us.click();
        pomElements.notYazma.sendKeys("Grup 2 proje calismasina devam ediyor...");
        wait.until(ExpectedConditions.elementToBeClickable(pomElements.submitTıklama)).click();
        String sonucMesaji=wait.until(ExpectedConditions.elementToBeClickable(pomElements.mesajıKontrol)).getText();
        System.out.println(sonucMesaji);
        Assert.assertTrue(sonucMesaji.contains("successfully"));

    }
}
