import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsTestHomeWork_Task2 {

    @Test
    public void locatorsTestHomeWork() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        By ElementXpathBankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");
        driver.findElement(ElementXpathBankManagerLogin).click();

        By ElementXpathAddCustomer = By.xpath("//button[normalize-space()='Add Customer']");
        driver.findElement(ElementXpathAddCustomer).click();

        By ElementXpathFirstName = By.xpath("//input[@placeholder='First Name']");
        driver.findElement(ElementXpathFirstName).sendKeys("Iggy");

        By ElementXpathLastName = By.xpath("//input[@placeholder='Last Name']");
        driver.findElement(ElementXpathLastName).sendKeys("Pop");

        By ElementXpathPostCode = By.xpath("//input[@placeholder='Post Code']");
        driver.findElement(ElementXpathPostCode).sendKeys("61145");

        By ElementXpathSubmit = By.xpath("//button[@type='submit']");
        driver.findElement(ElementXpathSubmit).click();

        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        By ElementXpathOpenAccount = By.xpath("//button[normalize-space()='Open Account']");
        driver.findElement(ElementXpathOpenAccount).click();
    }
}