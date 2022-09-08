package LocatorsHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsTestHomeWork_Task3 {
    private WebDriver driver;
    private String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        System.out.println("The setup process is completed");

    }

    @Test
    public void checkUp() {

        By elementXpathBankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");
        driver.findElement(elementXpathBankManagerLogin).click();

        By elementXpathOpenAccount = By.xpath("//button[normalize-space()='Open Account']");
        driver.findElement(elementXpathOpenAccount).click();

        By elementXpathUserSelect = By.xpath("//select[@id='userSelect']");
        driver.findElement(elementXpathUserSelect).sendKeys("Harry");

        By elementXpathCurrencySelect = By.xpath("//select[@id='currency']");
        driver.findElement(elementXpathCurrencySelect).sendKeys("Pound");

        By elementXpathProcess = By.xpath("//button[normalize-space()='Process']");
        driver.findElement(elementXpathProcess).click();

        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        System.out.println("The url test is completed");
    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}