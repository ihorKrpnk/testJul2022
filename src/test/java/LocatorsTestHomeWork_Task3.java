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

        System.out.println("The url test is completed");
    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}