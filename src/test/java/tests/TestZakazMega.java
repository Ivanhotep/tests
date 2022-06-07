package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestZakazMega {
    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void runZakaz() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://zakaz.ua/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li/a/span/img[@alt='MegaMarket']")).click();
        sleep(3);
        driver.findElement(By.xpath("//div[@data-marker='Address']")).click();
        sleep(3);
        driver.findElement(By.xpath("//li[@data-testid='deliveryType_pickup']")).click();
        driver.findElement(By.xpath("//input[@id='regionSelect']")).sendKeys("Київ\n");
        driver.findElement(By.xpath("//input[@value='48267601']")).click();
        sleep(3);
        driver.findElement(By.xpath("//button[@data-testid='To shopping']")).click();
        sleep(3);
        driver.findElement(By.xpath("//button[@data-marker='Stay on site']")).click();
        sleep(3);
        driver.findElement(By.xpath("//input[@data-testid='searchBoxInput']")).sendKeys("Сир\n");
        sleep(3);
        driver.findElement(By.xpath("//div[3]/div[3]/div/div[1]")).click();
        sleep(3);
        driver.findElement(By.xpath("//div[3]/div[2]/div[1]/div[3]/div/button")).click();
        sleep(3);
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//*[@id='BigProductCardTopInfo__addButtons']/div/div/button[2]")).click();
        }
        sleep(3);
        driver.findElement(By.xpath("//button[@data-testid='GeneralModal__close']")).click();
        sleep(3);
        driver.findElement(By.xpath("//div[3]/div[3]/div/div[2]")).click();
        sleep(3);
        driver.findElement(By.xpath("//div[3]/div[2]/div[1]/div[3]/div/button")).click();
        sleep(3);
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//*[@id='BigProductCardTopInfo__addButtons']/div/div/button[2]")).click();
        }
        sleep(3);
        driver.findElement(By.xpath("//button[@data-testid='GeneralModal__close']")).click();
        driver.findElement(By.xpath("//div[3]/div[3]/div/div[3]")).click();
        sleep(3);
        driver.findElement(By.xpath("//div[3]/div[2]/div[1]/div[3]/div/button")).click();
        sleep(3);
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//*[@id='BigProductCardTopInfo__addButtons']/div/div/button[2]")).click();
        }
        driver.findElement(By.xpath("//button[@data-testid='GeneralModal__close']")).click();
    }
}
