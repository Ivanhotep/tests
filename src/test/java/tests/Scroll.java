package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageObjets.TestInit;

public class Scroll extends TestInit {
    @Test
    public void TestZakazScroll() {
        goToZakaz();
        driver.manage().window().maximize();
        goToNovus();
        sleep(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");
        sleep(3);
        driver.findElement(By.xpath("//div[5]/section/div[1]/div[2]/div/div[1]/a")).click();
    }
}
