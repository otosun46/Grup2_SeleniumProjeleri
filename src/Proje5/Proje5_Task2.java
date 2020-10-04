/**
 * @Author:Otosun Tarih :25/09/2020
 */
package Proje5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BaseStaticDriver;


public class Proje5_Task2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demowebshop.tricentis.com/");
        WebDriverWait wait = new WebDriverWait(driver, 5);
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
        WebElement computers=driver.findElement(By.xpath("(//a[@href='/computers'])[3]"));
        computers.click();
        WebElement desktops=driver.findElement(By.xpath("(//a[@href='/desktops'])[3]"));
        desktops.click();
        Thread.sleep(1000);
        WebElement adToCart=driver.findElement(By.xpath("(//div[@class='add-info']/div[2])[3]"));//(//div[@class='buttons'])[5]
        wait.until(ExpectedConditions.visibilityOf(adToCart));
        adToCart.click();
        WebElement prossesor=driver.findElement(By.id("product_attribute_74_5_26_82"));
        prossesor.click();
        WebElement ram8Gb=driver.findElement(By.id("product_attribute_74_6_27_85"));
        ram8Gb.click();
        WebElement hdd400Gb=driver.findElement(By.id("product_attribute_74_3_28_87"));
        hdd400Gb.click();
        WebElement otherOfficeSuit=driver.findElement(By.id("product_attribute_74_8_29_90"));
        otherOfficeSuit.click();
        WebElement addToCartButton=driver.findElement(By.id("add-to-cart-button-74"));
        addToCartButton.click();
        WebElement topcartlinc=driver.findElement(By.id("topcartlink"));
        topcartlinc.click();
        WebElement Iagree=driver.findElement(By.id("termsofservice"));
        Iagree.click();
        WebElement checkoutButton=driver.findElement(By.id("checkout"));
        checkoutButton.click();

//        WebElement countrySelect = driver.findElement(By.id("BillingNewAddress_CountryId"));
//        Select Countr = new Select(countrySelect);
//        Countr.selectByIndex(1);
//        WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
//        city.sendKeys("Halmstad");
//        WebElement addres1=driver.findElement(By.id("BillingNewAddress_Address1"));
//        addres1.sendKeys("Oskarstrom");
//        WebElement zipCode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
//        zipCode.sendKeys("91 303");
//        WebElement phoneNumber=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
//        phoneNumber.sendKeys("0764446589");


        WebElement continiu=driver.findElement(By.cssSelector("#billing-buttons-container>.button-1"));
        continiu.click();

        WebElement continueShipping=driver.findElement(By.cssSelector("#shipping-buttons-container>.button-1"));
        continueShipping.click();

        WebElement continueShippingMethod=driver.findElement(By.cssSelector(".shipping-method-next-step-button"));
        continueShippingMethod.click();

        WebElement cash=driver.findElement(By.id("paymentmethod_0"));
        cash.click();

        WebElement continuePaymentMethod=driver.findElement(By.cssSelector(".payment-method-next-step-button"));
        continuePaymentMethod.click();

        WebElement continuePaymentInform=driver.findElement(By.cssSelector(".payment-info-next-step-button"));
        continuePaymentInform.click();

        WebElement confirmOrder=driver.findElement(By.cssSelector(".confirm-order-next-step-button"));
        confirmOrder.click();

        WebElement orderSucces=driver.findElement(By.cssSelector(".order-completed>div>strong"));
        System.out.println(orderSucces.getText());

        Assert.assertTrue(orderSucces.getText().contains("successfully"));
        WebElement son=driver.findElement(By.cssSelector(".order-completed-continue-button"));
        son.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
