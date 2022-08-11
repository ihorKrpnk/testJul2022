import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsTestHomeWork_Task1 {

    @Test
    public void locatorsTestHomeWork() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        By ElementXpathCustomer = By.xpath("//button[normalize-space()='Customer Login']");
        driver.findElement(ElementXpathCustomer).click();

        By ElementXpathUserSelect = By.xpath("//select[@id='userSelect']");
        driver.findElement(ElementXpathUserSelect).click();
        driver.findElement(ElementXpathUserSelect).sendKeys("Harry");
        driver.findElement(ElementXpathUserSelect).click();

        By ElementXpathSubmit = By.xpath("//button[normalize-space()='Login']");
        driver.findElement(ElementXpathSubmit).click();

        By ElementXpathDeposit = By.xpath("//button[normalize-space()='Deposit']");
        driver.findElement(ElementXpathDeposit).click();

        By ElementXpathAmount = By.xpath("//input[@placeholder='amount']");
        driver.findElement(ElementXpathAmount).sendKeys("1000");

        By ElementXpathSubmitDeposit = By.xpath("//button[@type='submit']");
        driver.findElement(ElementXpathSubmitDeposit).click();

        By ElementXpathWithdrawal = By.xpath("//button[normalize-space()='Withdrawl']");
        driver.findElement(ElementXpathWithdrawal).click();

        By ElementXpathWithdrawnAmount = By.xpath("//input[@placeholder='amount']");
        driver.findElement(ElementXpathWithdrawnAmount).sendKeys("900");

        By ElementXpathSubmitWithdraw = By.xpath("//button[normalize-space()='Withdraw']");
        driver.findElement(ElementXpathSubmitWithdraw).click();

        By ElementXpathTransactions = By.xpath("//button[normalize-space()='Transactions']");
        driver.findElement(ElementXpathTransactions).click();

        By ElementXpathReset = By.xpath("//button[normalize-space()='Reset']");
        driver.findElement(ElementXpathReset).click();
    }
}