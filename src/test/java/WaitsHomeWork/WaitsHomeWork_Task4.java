package WaitsHomeWork;

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

public class WaitsHomeWork_Task4 {

    private WebDriver driver;
    private String url = "https://www.amazon.com/";

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("The setup process is completed");
    }

    @Test
    public void checkUp() {

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(8));

        driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).click();

        WebElement zipcode;
        zipcode = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='GLUXZipUpdateInput']")));
        zipcode.sendKeys("20839");

        driver.findElement(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")).click();

        WebElement continueButton;
        continueButton = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='GLUXHiddenSuccessSubTextAisEgress']/../../..//INPUT[@id='GLUXConfirmClose'])[2]")));
        continueButton.click();

        WebElement todaysDeals;
        todaysDeals = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")));
        todaysDeals.click();

        By elementXpathProduct = By.xpath("//img[@alt='Uproot Cleaner Pro Reusable Pet Hair Remover']");
        driver.findElement(elementXpathProduct).click();

        By elementXpathAddToCart = By.xpath("//input[@id='add-to-cart-button']");
        driver.findElement(elementXpathAddToCart).click();

        By elementXpathProceedToCheckout = By.xpath("//input[@name='proceedToRetailCheckout']");
        driver.findElement(elementXpathProceedToCheckout).click();

        System.out.println("The url test is completed");

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}