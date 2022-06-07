import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjets.TestInit;

public class DebugBr extends TestInit {
    @Test
    public void Debug() {
        goToZakaz();
        driver.manage().window().maximize();
        goToNovus();
        sleep(3);
        Actions actions = new Actions(driver);
        sleep(3);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/nav/div/ul/li[4]/a"))).perform();
        sleep(3);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/nav/div[2]/ul/li[1]/a")).click();
    }
}
