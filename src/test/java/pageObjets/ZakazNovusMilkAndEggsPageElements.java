package pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ZakazNovusMilkAndEggsPageElements extends BasePage {

    public ZakazNovusMilkAndEggsPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getMilkAndEggsTitle() {
        return getElementByXpath("//h1[contains(text(), 'Молочне і яйця')]");
    }

    public List<WebElement> getElementsOfProduct() {
        return getElementsByXpath("//div[@class='jsx-3762238971 CategoriesBox__listItem']");
    }

    public WebElement getMilkCategory() {
        return getElementByXpath("//a[contains(text(), 'Молоко')]");
    }
}
