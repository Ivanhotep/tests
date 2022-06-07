package pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazHomePageElements extends BasePage {

    public ZakazHomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getMarket() {
        return getElementByXpath("//li/a/span/img[@alt='NOVUS']");
    }

}
