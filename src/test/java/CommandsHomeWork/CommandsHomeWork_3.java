package CommandsHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CommandsHomeWork_3 {
    private WebDriver driver;
    private String url = "https://demoqa.com/";// кнопка Join редиректит на url2
    private String url2 = "https://www.toolsqa.com/selenium-training/";//проверка безопасности, тест фейлится

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url2);
        driver.manage().window().maximize();
    }

    @Test
    public void checkUp() {

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(45));

        WebElement registration;
        registration = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary-shadow btn-block']")));
        registration.click();

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to(url2);
        driver.navigate().refresh();

    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}