/**
 * @Author:Otosun Tarih :29/09/2020
 */
package utilities.POM_template;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class POM extends MetodWebDriver_nonLogin {
    @Test
    public void ProcedToCheckout() {
        POM_Elements pomElements=new POM_Elements(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        pomElements.abc.sendKeys("ipod");
        wait.until(ExpectedConditions.elementToBeClickable(pomElements.def)).click();

    }
}
