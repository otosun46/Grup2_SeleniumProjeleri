/**
 * @Author:Otosun Tarih :29/09/2020
 */
package Proje6.POM_TestNG_Proje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POM_Elements {
    public POM_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".ico-login")
    public WebElement login;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(className = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='column information']//ul//li[6]//a")
    public WebElement contact_us;

    @FindBy(xpath = "//textarea[@id='Enquiry']")
    public WebElement notYazma;

    @FindBy(xpath = "//input[@name='send-email']")
    public WebElement submitTıklama;

    @FindBy(xpath = "//div[@class='result']")
    public WebElement mesajıKontrol;

    @FindBy(xpath = "(//a[@href='/apparel-shoes'])[1]")
    public WebElement apparel_shoes;

    @FindBy(xpath = "(//a[@href='/blue-and-green-sneaker'])[2]")
    public WebElement blue_green_sneaker;

    @FindBy(id = "add-to-wishlist-button-28")
    public WebElement wishListAdd;

    @FindBy(xpath = "(//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size'])[2]")
    public WebElement rockability_polka;

    @FindBy(id = "add-to-wishlist-button-5")
    public WebElement wishListAdd2;

    @FindBy(xpath = "//a[@href='/wishlist']")
    public WebElement wishListPage;

    @FindAll({
            @FindBy(xpath = "//tr[@class='cart-item-row']//following::a[1]")
    })
    public List<WebElement> itemsList;

}
