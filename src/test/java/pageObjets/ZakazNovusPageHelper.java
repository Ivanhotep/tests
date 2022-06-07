package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazNovusPageHelper extends ZakazNovusPageElements {

    public ZakazNovusPageHelper(WebDriver driver) {
        super(driver);
    }

    public ZakazNovusPageHelper LogIn(String UserName, String Password) {
        getLogInBtn().click();
        getUserNameField().sendKeys(UserName);
        getUserPasswordField().sendKeys(Password);
        getSignInBtn().click();
        return new ZakazNovusPageHelper(driver);
    }
}
