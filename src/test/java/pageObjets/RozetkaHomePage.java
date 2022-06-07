package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePage extends BasePage {

    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCategory() {

        return getElementByXpath("//div[1]/ul/li/a[contains(text(), 'Побутова техніка')]");
    }
}
