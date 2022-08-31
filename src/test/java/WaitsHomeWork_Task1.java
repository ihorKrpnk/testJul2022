import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        System.out.println("The setup process is completed");
    }

    @Test
    public void checkUp() {

        By ElementXpathUserName = By.xpath("//input[@id='userName']");
        driver.findElement(ElementXpathUserName).sendKeys("Vas");

        By ElementXpathPassword = By.xpath("//input[@id='password']");
        driver.findElement(ElementXpathPassword).sendKeys("Q!W@e3r4");

        By ElementXpathLogin = By.xpath("//button[@id='login']");
        driver.findElement(ElementXpathLogin).click();

        By ElementXpathGoToStore = By.xpath("//button[@id='gotoStore']");
        driver.findElement(ElementXpathGoToStore).click();

        By ElementXpathChooseGit = By.xpath("//a[normalize-space()='Git Pocket Guide']");
        driver.findElement(ElementXpathChooseGit).click();

        By ElementXpathAddGit = By.xpath("//div[@class='text-right fullButton']//button[@id='addNewRecordButton']");
        driver.findElement(ElementXpathAddGit).click();

        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        By ElementXpathBack = By.xpath("//div[@class='text-left fullButton']//button[@id='addNewRecordButton']");
        driver.findElement(ElementXpathBack).click();

        By CssSelectorChooseJS = By.cssSelector("a[href='/books?book=9781491904244']");
        driver.findElement(CssSelectorChooseJS).click();

        By ElementXpathAddJS = By.xpath("//div[@class='text-right fullButton']//button[@id='addNewRecordButton']");
        driver.findElement(ElementXpathAddJS).click();

        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        By ElementXpathProfile = By.xpath("//span[text()='Profile']");
        driver.findElement(ElementXpathProfile).click();

        By ElementXpathDelete = By.xpath("//div[@class='text-right button di']//button[@id='submit']");
        driver.findElement(ElementXpathDelete).click();

        driver.switchTo().alert().accept();//Cant Handle Alert
        driver.switchTo().defaultContent();//Cant Handle Alert

        System.out.println("The url test is completed");

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
        System.out.println("The quit process is completed");
    }
}