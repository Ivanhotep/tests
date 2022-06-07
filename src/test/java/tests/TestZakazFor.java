package tests;

import org.testng.annotations.Test;
import pageObjets.TestInit;
import pageObjets.ZakazHomePageHelper;
import pageObjets.ZakazNovusCheesPage;
import pageObjets.ZakazNovusPageHelper;

public class TestZakazFor extends TestInit {

    @Test
    public void runZakaz() {
        goToZakaz();
        maximize();
        ZakazHomePageHelper zakazHomePageHelper = new ZakazHomePageHelper(driver);
        zakazHomePageHelper.getMarket().click();
        sleep(3);
        ZakazNovusPageHelper zakazNovusPageHelper = new ZakazNovusPageHelper(driver);
        zakazNovusPageHelper.getAddres().click();
        sleep(3);
        zakazNovusPageHelper.getDelivetyType().click();
        zakazNovusPageHelper.getRegionSelectField().sendKeys("Київ\n");
        zakazNovusPageHelper.getCityStore().click();
        sleep(3);
        zakazNovusPageHelper.getShoppBtn().click();
        sleep(3);
        zakazNovusPageHelper.getStayOnSiteBtn().click();
        sleep(3);
        zakazNovusPageHelper.getSerchField().sendKeys("Сир\n");
        ZakazNovusCheesPage zakazNovusCheesPage = new ZakazNovusCheesPage(driver);
        sleep(3);
        zakazNovusCheesPage.getFirstProductCard().click();
        sleep(3);
        zakazNovusCheesPage.getAddToCartBtn().click();
        sleep(3);
        for (int i = 0; i < 4; i++) {
            zakazNovusCheesPage.getPlusBtn().click();
        }
        sleep(3);
        zakazNovusCheesPage.getClosePopUp().click();
        sleep(3);
        zakazNovusCheesPage.getSecondProductCard().click();
        sleep(3);
        zakazNovusCheesPage.getAddToCartBtn().click();
        sleep(3);
        for (int i = 0; i < 4; i++) {
            zakazNovusCheesPage.getPlusBtn().click();
        }
        sleep(3);
        zakazNovusCheesPage.getClosePopUp().click();
        zakazNovusCheesPage.getThirdProductCard().click();
        sleep(3);
        zakazNovusCheesPage.getAddToCartBtn().click();
        sleep(3);
        for (int i = 0; i < 4; i++) {
            zakazNovusCheesPage.getPlusBtn().click();
        }
        zakazNovusCheesPage.getClosePopUp().click();
    }
}

