import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsTestHomeWork_Task3 {

    @Test
    public void locatorsTestHomeWork() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        By ElementXpathBankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");
        driver.findElement(ElementXpathBankManagerLogin).click();

        By ElementXpathOpenAccount = By.xpath("//button[normalize-space()='Open Account']");
        driver.findElement(ElementXpathOpenAccount).click();

        By ElementXpathUserSelect = By.xpath("//select[@id='userSelect']");
        driver.findElement(ElementXpathUserSelect).sendKeys("Harry");

        By ElementXpathCurrencySelect = By.xpath("//select[@id='currency']");
        driver.findElement(ElementXpathCurrencySelect).sendKeys("Pound");

        By ElementXpathProcess = By.xpath("//button[normalize-space()='Process']");
        driver.findElement(ElementXpathProcess).click();

        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        driver.quit();
    }
}