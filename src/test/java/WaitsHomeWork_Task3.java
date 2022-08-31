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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
        System.out.println("The setup process is completed");
    }

    @Test
    public void checkUp() {

        By ElementXpathAddNewToDoHomeWork = By.xpath("//input[@placeholder='Add new todo']");
        driver.findElement(ElementXpathAddNewToDoHomeWork).sendKeys("MAKE HOMEWORK\n");

        By ElementXpathAddNewToDoPracticeAutomation = By.xpath("//input[@placeholder='Add new todo']");
        driver.findElement(ElementXpathAddNewToDoPracticeAutomation).sendKeys("Practice Automation\n");

        By ElementXpathMarkPracticeMagic = By.xpath("//li[normalize-space()='Practice magic']");
        driver.findElement(ElementXpathMarkPracticeMagic).click();

        By ElementXpathBuyNewRobes = By.xpath("//li[normalize-space()='Buy new robes']");
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(ElementXpathBuyNewRobes);
        action.moveToElement(element);
        action.perform();
        this.sleep(2);

        By ElementXpathMarkDeleteBuyNewRobes = By.xpath("//li[normalize-space()='Buy new robes']//i[@class='fa fa-trash']");
        driver.findElement(ElementXpathMarkDeleteBuyNewRobes).click();

        System.out.println("The url test is completed");

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {

        }
    }

}