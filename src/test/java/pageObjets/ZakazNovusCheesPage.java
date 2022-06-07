package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazNovusCheesPage extends BasePage {

    public ZakazNovusCheesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFirstProductCard() {
        return driver.findElement(By.xpath("//div[3]/div[3]/div/div[1]"));
    }

    public WebElement getAddToCartBtn() {
        return driver.findElement(By.xpath("//div[3]/div[2]/div[1]/div[3]/div/button"));
    }

    public WebElement getPlusBtn() {
        return driver.findElement(By.xpath("//*[@id='BigProductCardTopInfo__addButtons']/div/div/button[2]"));
    }

    public WebElement getClosePopUp() {
        return driver.findElement(By.xpath("//button[@data-testid='GeneralModal__close']"));
    }

    public WebElement getSecondProductCard() {
        return driver.findElement(By.xpath("//div[3]/div[3]/div/div[2]"));
    }

    public WebElement getThirdProductCard() {
        return driver.findElement(By.xpath("//div[3]/div[3]/div/div[3]"));
    }
}