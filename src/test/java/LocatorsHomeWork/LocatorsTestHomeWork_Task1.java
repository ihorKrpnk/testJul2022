package LocatorsHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsTestHomeWork_Task1 {
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

        By elementXpathCustomer = By.xpath("//button[normalize-space()='Customer Login']");
        driver.findElement(elementXpathCustomer).click();

        By elementXpathUserSelect = By.xpath("//select[@id='userSelect']");
        driver.findElement(elementXpathUserSelect).click();
        driver.findElement(elementXpathUserSelect).sendKeys("Harry");
        driver.findElement(elementXpathUserSelect).click();

        By elementXpathSubmit = By.xpath("//button[normalize-space()='Login']");
        driver.findElement(elementXpathSubmit).click();

        By elementXpathDeposit = By.xpath("//button[normalize-space()='Deposit']");
        driver.findElement(elementXpathDeposit).click();

        By elementXpathAmount = By.xpath("//input[@placeholder='amount']");
        driver.findElement(elementXpathAmount).sendKeys("1000");

        By elementXpathSubmitDeposit = By.xpath("//button[@type='submit']");
        driver.findElement(elementXpathSubmitDeposit).click();

        By elementXpathWithdrawal = By.xpath("//button[normalize-space()='Withdrawl']");
        driver.findElement(elementXpathWithdrawal).click();

        By elementXpathWithdrawnAmount = By.xpath("//input[@placeholder='amount']");
        driver.findElement(elementXpathWithdrawnAmount).sendKeys("900");

        By elementXpathSubmitWithdraw = By.xpath("//button[normalize-space()='Withdraw']");
        driver.findElement(elementXpathSubmitWithdraw).click();

        By elementXpathTransactions = By.xpath("//button[normalize-space()='Transactions']");
        driver.findElement(elementXpathTransactions).click();

        By elementXpathReset = By.xpath("//button[normalize-space()='Reset']");
        driver.findElement(elementXpathReset).click();

        System.out.println("The url test is completed");
    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}