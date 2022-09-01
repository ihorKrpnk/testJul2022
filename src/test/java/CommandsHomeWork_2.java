import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommandsHomeWork_2 {
    private WebDriver driver;
    private String url = "https://www.toolsqa.com/automation-practice-switch-windows/";//на сайте 404 ошибка
    private String url2 = "https://demoqa.com/browser-windows";

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url2);
        driver.manage().window().maximize();
    }

    @Test
    public void checkUp() {

        By ElementXpathNewWindow = By.xpath("//button[@id='windowButton']");
        driver.findElement(ElementXpathNewWindow).click();

    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}