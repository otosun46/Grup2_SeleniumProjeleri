/**
 * @Author:Otosun Tarih :29/09/2020
 */
package Proje6.POM_template;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class POM_Part2 extends MetodWebDriver_nonLogin {
    @Test
    @Parameters({"email","password"})
    public void ProcedToCheckout(String email,String password) throws InterruptedException {
        POM_Elements pomElements=new POM_Elements(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        pomElements.login.click();
        pomElements.email.sendKeys(email);
        pomElements.password.sendKeys(password);
        pomElements.loginButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(pomElements.apparel_shoes)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pomElements.blue_green_sneaker)).click();

        wait.until(ExpectedConditions.elementToBeClickable(pomElements.wishListAdd)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pomElements.apparel_shoes)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pomElements.rockability_polka)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pomElements.wishListAdd2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pomElements.wishListPage)).click();

        ArrayList<String> urunIsimleri=new ArrayList<>();
        urunIsimleri.add("50's Rockabilly Polka Dot Top JR Plus Size");
        urunIsimleri.add("Blue and green Sneaker");


        for (String urun:urunIsimleri) {
            ListContainsString(pomElements.itemsList,urun);
        }
    }

    public static void ListContainsString(List<WebElement> webElmList, String expectedString) {
        boolean bulundu=false;
        for (WebElement e : webElmList) {
            if (e.getText().contains(expectedString)){
                bulundu=true;
                break;
            }
        }
        Assert.assertTrue(bulundu,"aranan eleman bulunamadi");
    }
}
