package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjets.BasePage;

public class ZakazNovusPageElements extends BasePage {

    public ZakazNovusPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSerchField() {
        return getElementByXpath("//input[@data-testid='searchBoxInput']");
    }

    public WebElement getAgeBtn() {
        return getElementByXpath("//button[@data-marker='Yes']");
    }

    public WebElement getProductCard() {
        return getElementByXpath("//a[@data-productkey='03770015260023']");
    }

    public WebElement getAddToCartBtn() {
        return getElementByXpath("//div[3]/div[2]/div[1]/div[3]/div/button");
    }

    public WebElement getDeliveryNovaPoshta() {
        return getElementByXpath("//li[@data-marker='Nova Poshta']");
    }

    public WebElement getAddres() {
        return getElementByXpath("//div[@data-marker='Address']");
    }

    public WebElement getDelivetyType() {
        return getElementByXpath("//li[@data-testid='deliveryType_pickup']");
    }

    public WebElement getRegionSelectField() {
        return getElementByXpath("//input[@id='regionSelect']");
    }

    public WebElement getCityStore() {
        return getElementByXpath("//input[@value='482010105']");
    }

    public WebElement getShoppBtn() {
        return getElementByXpath("//button[@data-testid='To shopping']");
    }

    public WebElement getStayOnSiteBtn() {
        return getElementByXpath("//button[@data-marker='Stay on site']");
    }

    public WebElement getClosePopUp() {
        return getElementByXpath("//button[@data-testid='GeneralModal__close']");
    }

    public WebElement getLngSwitchRus() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Рус')]"));
    }

    public WebElement getCategoryRus() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Спецпредложение')]"));
    }



    public WebElement getLngSwitchEng() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Eng')]"));
    }

    public WebElement getCategoryEng() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Special offer')]"));
    }



    public WebElement getLogInBtn() {
        return getElementByXpath("//span[contains(text(), 'Увійти')]");
    }

    public WebElement getUserNameField() {
        return getElementByXpath("//input[@data-marker='Mobile Phone or Email']");
    }

    public WebElement getUserPasswordField() {
        return getElementByXpath("//input[@data-marker='Password']");
    }

    public WebElement getSignInBtn() {
        return getElementByXpath("//*[@id='sign_in']/div[3]/button[1]");
    }

    public WebElement getError() {
        return getElementByXpath("//div[contains(text(), 'Логін або пароль невірні.')]");
    }

    public WebElement getBakeryCategory() {
        return getElementByXpath("//span[contains(text(), 'Пекарня')]");
    }

    public WebElement getBakeryTitle() {
        return getElementByXpath("//h1[contains(text(), 'Пекарня')]");
    }

    public WebElement getFruitAndVegetablesCategory() {
        return getElementByXpath("//span[contains(text(), 'Фрукти та овочі')]");
    }

    public WebElement getFruitAndVegetablesTitle() {
        return getElementByXpath("//h1[contains(text(), 'Фрукти та овочі')]");
    }

    public WebElement getMilkAndEggsCategory() {
        return getElementByXpath("//span[contains(text(), 'Молочне і яйця')]");
    }


}
