package pageObjets;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToZakaz() {

        driver.get("https://zakaz.ua/");
    }
    public void goToRozetka() {
        driver.get("https://rozetka.com.ua/ua/");
    }

    public void goToNovus() {
        driver.findElement(By.xpath("//li/a/span/img[@alt='NOVUS']")).click();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }
}
