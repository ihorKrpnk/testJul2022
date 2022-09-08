package WaitsHomeWork;

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
        System.out.println("The setup process is completed");
    }

    @Test
    public void checkUp() {

        By elementXpathUserName = By.xpath("//input[@id='user-name']");
        driver.findElement(elementXpathUserName).sendKeys("standard_user");

        By elementXpathPassword = By.xpath("//input[@id='password']");
        driver.findElement(elementXpathPassword).sendKeys("secret_sauce");

        By elementXpathLogin = By.xpath("//input[@id='login-button']");
        driver.findElement(elementXpathLogin).click();

        By elementXpathAddToCart01 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
        driver.findElement(elementXpathAddToCart01).click();

        By elementXpathAddToCart02 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
        driver.findElement(elementXpathAddToCart02).click();

        By elementXpathAddToCart03 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
        driver.findElement(elementXpathAddToCart03).click();

        By elementXpathAddToCart04 = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
        driver.findElement(elementXpathAddToCart04).click();

        By elementXpathCart = By.xpath("//span[@class='shopping_cart_badge']");
        driver.findElement(elementXpathCart).click();

        By elementXpathCheckout = By.xpath("//button[@id='checkout']");
        driver.findElement(elementXpathCheckout).click();

        By elementXpathFirstName = By.xpath("//input[@id='first-name']");
        driver.findElement(elementXpathFirstName).sendKeys("Harry");

        By elementXpathLastName = By.xpath("//input[@id='last-name']");
        driver.findElement(elementXpathLastName).sendKeys("Trumann");

        By elementXpathZip = By.xpath("//input[@id='postal-code']");
        driver.findElement(elementXpathZip).sendKeys("90210");

        By elementXpathContinue = By.xpath("//input[@id='continue']");
        driver.findElement(elementXpathContinue).click();

        By elementXpathFinish = By.xpath("//button[@id='finish']");
        driver.findElement(elementXpathFinish).click();

        By elementXpathBackToProducts = By.xpath("//button[@id='back-to-products']");
        driver.findElement(elementXpathBackToProducts).click();

        System.out.println("The url test is completed");

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}
