package pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazNovusMilkPageElements extends BasePage{
    public ZakazNovusMilkPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getMilkTitle() {
        return getElementByXpath("//h1[contains(text(), 'Молоко')]");
    }

    public WebElement getUltrapasteurizedCategory() {
        return getElementByXpath("//a[contains(text(), 'Ультрапастеризоване молоко')]");
    }
}
