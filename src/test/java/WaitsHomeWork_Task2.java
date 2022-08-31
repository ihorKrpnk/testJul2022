import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsHomeWork_Task2 {

    private WebDriver driver;
    private String url = "https://www.saucedemo.com/";

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println("The setup process is completed");
    }

    @Test
    public void checkUp() {

        By ElementXpathUserName = By.xpath("//input[@id='user-name']");
        driver.findElement(ElementXpathUserName).sendKeys("standard_user");

        By ElementXpathPassword = By.xpath("//input[@id='password']");
        driver.findElement(ElementXpathPassword).sendKeys("secret_sauce");

        By ElementXpathLogin = By.xpath("//input[@id='login-button']");
        driver.findElement(ElementXpathLogin).click();

        By ElementXpathAddToCart01 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
        driver.findElement(ElementXpathAddToCart01).click();

        By ElementXpathAddToCart02 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
        driver.findElement(ElementXpathAddToCart02).click();

        By ElementXpathAddToCart03 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
        driver.findElement(ElementXpathAddToCart03).click();

        By ElementXpathAddToCart04 = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
        driver.findElement(ElementXpathAddToCart04).click();

        By ElementXpathCart = By.xpath("//span[@class='shopping_cart_badge']");
        driver.findElement(ElementXpathCart).click();

        By ElementXpathCheckout = By.xpath("//button[@id='checkout']");
        driver.findElement(ElementXpathCheckout).click();

        By ElementXpathFirstName = By.xpath("//input[@id='first-name']");
        driver.findElement(ElementXpathFirstName).sendKeys("Harry");

        By ElementXpathLastName = By.xpath("//input[@id='last-name']");
        driver.findElement(ElementXpathLastName).sendKeys("Trumann");

        By ElementXpathZip = By.xpath("//input[@id='postal-code']");
        driver.findElement(ElementXpathZip).sendKeys("90210");

        By ElementXpathContinue = By.xpath("//input[@id='continue']");
        driver.findElement(ElementXpathContinue).click();

        By ElementXpathFinish = By.xpath("//button[@id='finish']");
        driver.findElement(ElementXpathFinish).click();

        By ElementXpathBackToProducts = By.xpath("//button[@id='back-to-products']");
        driver.findElement(ElementXpathBackToProducts).click();

        System.out.println("The url test is completed");

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}
