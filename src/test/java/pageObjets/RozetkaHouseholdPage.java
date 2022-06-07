package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHouseholdPage extends BasePage {

    public RozetkaHouseholdPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHouseholdSection() {
        return getElementByXpath("//a[contains(text(), 'Велика побутова техніка')]");
    }

    public WebElement getHouseholdTitle() {
        return getElementByXpath("//h1[contains(text(), ' Велика побутова техніка ')]");
    }
}
