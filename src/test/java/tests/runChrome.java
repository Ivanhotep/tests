package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjets.BasePage;
import pageObjets.RozetkaHomePage;
import pageObjets.RozetkaHouseholdPage;
import pageObjets.TestInit;

public class runChrome extends TestInit {

    @Test
    public void runRozetka() {
        goToRozetka();
        maximize();
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.getCategory().click();
        RozetkaHouseholdPage rozetkaHouseholdPage = new RozetkaHouseholdPage(driver);
        rozetkaHouseholdPage.getHouseholdSection().click();
        Assert.assertTrue(rozetkaHouseholdPage.getHouseholdTitle().isDisplayed());
    }
}
