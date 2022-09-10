package WaitsHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsHomeWork_Task3 {
    private WebDriver driver;
    private String url = "http://webdriveruniversity.com/To-Do-List/index.html";

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        System.out.println("The setup process is completed");
    }

    @Test
    public void checkUp() {

        By elementXpathAddNewToDoHomeWork = By.xpath("//input[@placeholder='Add new todo']");
        driver.findElement(elementXpathAddNewToDoHomeWork).sendKeys("MAKE HOMEWORK\n");

        By elementXpathAddNewToDoPracticeAutomation = By.xpath("//input[@placeholder='Add new todo']");
        driver.findElement(elementXpathAddNewToDoPracticeAutomation).sendKeys("Practice Automation\n");

        By elementXpathMarkPracticeMagic = By.xpath("//li[normalize-space()='Practice magic']");
        driver.findElement(elementXpathMarkPracticeMagic).click();

        By elementXpathBuyNewRobes = By.xpath("//li[normalize-space()='Buy new robes']");
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(elementXpathBuyNewRobes);
        action.moveToElement(element);
        action.perform();

        By elementXpathMarkDeleteBuyNewRobes = By.xpath("//li[normalize-space()='Buy new robes']//i[@class='fa fa-trash']");
        driver.findElement(elementXpathMarkDeleteBuyNewRobes).click();

        System.out.println("The url test is completed");

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}