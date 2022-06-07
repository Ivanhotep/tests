package pageObjets;

import org.openqa.selenium.WebDriver;

public class ZakazHomePageHelper extends ZakazHomePageElements {

    public void navigateZakaz() {
        driver.get("https://zakaz.ua/");
    }

    public ZakazHomePageHelper(WebDriver driver) {
        super(driver);
    }


}
