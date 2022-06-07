package pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazNovusUltrapasteurizedPageElements extends BasePage {
    public ZakazNovusUltrapasteurizedPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getUltrapasteurizedTitle() {
        return getElementByXpath("//h1[contains(text(), 'Ультрапастеризоване молоко')]");
    }

    public WebElement getFilterBtn() {
        return getElementByXpath("//button[@data-marker='price_asc']");
    }

    public WebElement getFirstProduct() {
        return getElementByXpath("//a[@data-productkey='04820003486092']");
    }
}
