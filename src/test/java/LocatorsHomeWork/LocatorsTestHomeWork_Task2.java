package LocatorsHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsTestHomeWork_Task2 {
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

        By elementXpathAddCustomer = By.xpath("//button[normalize-space()='Add Customer']");
        driver.findElement(elementXpathAddCustomer).click();

        By elementXpathFirstName = By.xpath("//input[@placeholder='First Name']");
        driver.findElement(elementXpathFirstName).sendKeys("Iggy");

        By elementXpathLastName = By.xpath("//input[@placeholder='Last Name']");
        driver.findElement(elementXpathLastName).sendKeys("Pop");

        By elementXpathPostCode = By.xpath("//input[@placeholder='Post Code']");
        driver.findElement(elementXpathPostCode).sendKeys("61145");

        By elementXpathSubmit = By.xpath("//button[@type='submit']");
        driver.findElement(elementXpathSubmit).click();

        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        By elementXpathOpenAccount = By.xpath("//button[normalize-space()='Open Account']");
        driver.findElement(elementXpathOpenAccount).click();

        System.out.println("The url test is completed");

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}