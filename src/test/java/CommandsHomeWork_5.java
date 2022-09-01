import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CommandsHomeWork_5 {
    private WebDriver driver;
    private String url = "https://demoqa.com/dynamic-properties";

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void checkUp() {

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement visibleAfterFiveSecondsButton;
        visibleAfterFiveSecondsButton = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='visibleAfter']")));
        System.out.println(visibleAfterFiveSecondsButton.isDisplayed());

    }
}
