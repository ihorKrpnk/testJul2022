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

        System.out.println("The url test is completed");

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}