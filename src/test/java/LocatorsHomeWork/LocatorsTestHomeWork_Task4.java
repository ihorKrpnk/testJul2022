package LocatorsHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LocatorsTestHomeWork_Task4 {
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

        By elementXpathCustomers = By.xpath("//button[normalize-space()='Customers']");
        driver.findElement(elementXpathCustomers).click();

        By elementXpathDelete = By.xpath("//button[text()='Delete']");
        List<WebElement> webElementList = driver.findElements(elementXpathDelete);

        for (int i = 0; i < webElementList.size(); i++) {
            driver.findElement(elementXpathDelete).click();
        }
        System.out.println("The url test is completed");
    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}