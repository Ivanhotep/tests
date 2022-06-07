package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjets.*;

public class TestZakaz extends TestInit {

    @Test
    public void runZakaz() {
            ZakazHomePageHelper zakazHomePageHelper = new ZakazHomePageHelper(driver);
            ZakazNovusPageHelper zakazNovusPageHelper = new ZakazNovusPageHelper(driver);
            zakazHomePageHelper.navigateZakaz();
            maximize();
            zakazHomePageHelper.getMarket().click();
            zakazNovusPageHelper.getSerchField().sendKeys("Вино Casot de Maspa\n");
            zakazNovusPageHelper.getAgeBtn().click();
            zakazNovusPageHelper.getProductCard().click();
            zakazNovusPageHelper.getAddToCartBtn().click();
            zakazNovusPageHelper.getDeliveryNovaPoshta().click();
        }

    @Test
    public void novusLngRus() {
            ZakazHomePageHelper zakazHomePageHelper = new ZakazHomePageHelper(driver);
            zakazHomePageHelper.navigateZakaz();
            maximize();
            zakazHomePageHelper.getMarket().click();
            ZakazNovusPageHelper zakazNovusPageHelper = new ZakazNovusPageHelper(driver);
            zakazNovusPageHelper.getLngSwitchRus().click();
            Assert.assertTrue(zakazNovusPageHelper.getCategoryRus().isDisplayed());
    }

    @Test
    public void novusLngEng() {
            ZakazHomePageHelper zakazHomePageHelper = new ZakazHomePageHelper(driver);
            zakazHomePageHelper.navigateZakaz();
            maximize();
            zakazHomePageHelper.getMarket().click();
            ZakazNovusPageHelper zakazNovusPageHelper = new ZakazNovusPageHelper(driver);
            zakazNovusPageHelper.getLngSwitchEng().click();
            Assert.assertTrue(zakazNovusPageHelper.getCategoryEng().isDisplayed());

    }

    @Test
    public void novusLogInError() {
            ZakazHomePageHelper zakazHomePageHelper = new ZakazHomePageHelper(driver);
            ZakazNovusPageHelper zakazNovusPageHelper = new ZakazNovusPageHelper(driver);
            zakazHomePageHelper.navigateZakaz();
            maximize();
            zakazHomePageHelper.getMarket().click();
            zakazNovusPageHelper.LogIn("vanya@gmail.com", "asdfe20123");
            Assert.assertTrue(zakazNovusPageHelper.getError().isDisplayed());

    }

    @Test
    public void novusBakery() {
        ZakazHomePageHelper zakazHomePageHelper = new ZakazHomePageHelper(driver);
        zakazHomePageHelper.navigateZakaz();
        maximize();
        zakazHomePageHelper.getMarket().click();
        ZakazNovusPageHelper zakazNovusPageHelper = new ZakazNovusPageHelper(driver);
        zakazNovusPageHelper.getBakeryCategory().click();
        Assert.assertTrue(zakazNovusPageHelper.getBakeryTitle().isDisplayed());
    }

    @Test
    public void novusFruitsAndVegetables() {
        ZakazHomePageHelper zakazHomePageHelper = new ZakazHomePageHelper(driver);
        zakazHomePageHelper.navigateZakaz();
        maximize();
        zakazHomePageHelper.getMarket().click();
        ZakazNovusPageHelper zakazNovusPageHelper = new ZakazNovusPageHelper(driver);
        zakazNovusPageHelper.getFruitAndVegetablesCategory().click();
        Assert.assertTrue(zakazNovusPageHelper.getFruitAndVegetablesTitle().isDisplayed());
    }

    @Test
    public void novusMilkAndEggs() {
        ZakazHomePageHelper zakazHomePageHelper = new ZakazHomePageHelper(driver);
        ZakazNovusPageHelper zakazNovusPageHelper = new ZakazNovusPageHelper(driver);
        ZakazNovusMilkAndEggsPageHelper zakazNovusMilkAndEggsPageHelper = new ZakazNovusMilkAndEggsPageHelper(driver);
        ZakazNovusMilkPageHelper zakazNovusMilkPageHelper = new ZakazNovusMilkPageHelper(driver);
        ZakazNovusUltrapasteurizedPageHelper zakazNovusUltrapasteurizedPageHelper = new ZakazNovusUltrapasteurizedPageHelper(driver);
        zakazHomePageHelper.navigateZakaz();
        maximize();
        zakazHomePageHelper.getMarket().click();
        zakazNovusPageHelper.getAddres().click();
        zakazNovusPageHelper.getDelivetyType().click();
        zakazNovusPageHelper.getRegionSelectField().sendKeys("Київ\n");
        zakazNovusPageHelper.getCityStore().click();
        zakazNovusPageHelper.getShoppBtn().click();
        zakazNovusPageHelper.getStayOnSiteBtn().click();
        zakazNovusPageHelper.getMilkAndEggsCategory().click();
        Assert.assertTrue(zakazNovusMilkAndEggsPageHelper.getMilkAndEggsTitle().isDisplayed());
        Assert.assertEquals(zakazNovusMilkAndEggsPageHelper.getElementsOfProduct().size(), 11);
        zakazNovusMilkAndEggsPageHelper.getMilkCategory().click();
        Assert.assertTrue(zakazNovusMilkPageHelper.getMilkTitle().isDisplayed());
        zakazNovusMilkPageHelper.getUltrapasteurizedCategory().click();
        Assert.assertTrue(zakazNovusUltrapasteurizedPageHelper.getUltrapasteurizedTitle().isDisplayed());
        zakazNovusUltrapasteurizedPageHelper.getFilterBtn().click();
        zakazNovusUltrapasteurizedPageHelper.getFirstProduct().click();
        zakazNovusPageHelper.getAddToCartBtn().click();
        zakazNovusPageHelper.getClosePopUp().click();
    }

}


