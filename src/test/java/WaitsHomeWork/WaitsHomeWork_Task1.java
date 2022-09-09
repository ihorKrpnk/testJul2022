package WaitsHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class WaitsHomeWork_Task1 {

    private WebDriver driver;
    private String url = "https://demoqa.com/login";

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

        By elementXpathUserName = By.xpath("//input[@id='userName']");
        driver.findElement(elementXpathUserName).sendKeys("Vas");

        By elementXpathPassword = By.xpath("//input[@id='password']");
        driver.findElement(elementXpathPassword).sendKeys("Q!W@e3r4");

        By elementXpathLogin = By.xpath("//button[@id='login']");
        driver.findElement(elementXpathLogin).click();

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement goToStore;
        goToStore = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='gotoStore']")));
        goToStore.click();

        WebElement findGit;
        findGit = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Git Pocket Guide']")));
        findGit.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,250)", "");

        WebElement addGit;
        addGit = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='text-right fullButton']//button[@id='addNewRecordButton']")));
        addGit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        WebElement backToStore;
        backToStore = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='text-left fullButton']//button[@id='addNewRecordButton']")));
        backToStore.click();

        js.executeScript("window.scrollBy(0,250)", "");

        WebElement findJS;
        findJS = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/span[1]/a[1]")));
        findJS.click();

        js.executeScript("window.scrollBy(0,250)", "");

        WebElement addJS;
        addJS = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='text-right fullButton']//button[@id='addNewRecordButton']")));
        addJS.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//span[normalize-space()='Profile']")).click();

        js.executeScript("window.scrollBy(0,250)", "");

        WebElement submit;
        submit = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='text-right button di']//button[@id='submit']")));
        submit.click();

        System.out.println("The url test is completed");

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}