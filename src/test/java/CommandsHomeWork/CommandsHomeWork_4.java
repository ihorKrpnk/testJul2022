package CommandsHomeWork;

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

public class CommandsHomeWork_4 {

    private WebDriver driver;
    private String url = "https://demoqa.com/progress-bar";

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void checkUp() {

        By elementXpathStart = By.xpath("//button[@id='startStopButton']");
        driver.findElement(elementXpathStart).click();

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement resetButton;
        resetButton = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='resetButton']")));
        System.out.println(resetButton.isDisplayed());
        resetButton.click();

        WebElement startButton = driver.findElement(By.xpath("//button[@id='startStopButton']"));
        driverWait.until(ExpectedConditions.visibilityOf(startButton));
        System.out.println(startButton.isDisplayed());

    }

}