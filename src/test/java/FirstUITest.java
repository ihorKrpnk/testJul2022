import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstUITest {
    @Test
    public void firstseleniumTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\testJul2022\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("testfort");
        driver.quit();

    }
    @Test
    public void LoginFireFox() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.i.ua/");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("test009");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("111111111");
        driver.findElement(By.xpath("//input[@title='Вхід на пошту']")).click();
        driver.quit();

    }
    @Test
    public void LoginGoogleChrome() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.i.ua/");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("test009");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("111111111");
        driver.findElement(By.xpath("//input[@title='Вхід на пошту']")).click();
        driver.quit();

    }


}
