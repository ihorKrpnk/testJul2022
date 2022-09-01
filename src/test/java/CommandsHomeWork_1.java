import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommandsHomeWork_1 {

    private WebDriver driver;
    private String url = "https://shop.demoqa.com/";

    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void checkUp() {

        String title = driver.getTitle();
        int titleLength = title.length();
        String currentUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Title of the page is : " + title);
        System.out.println("Length of the title is : " + titleLength);
        if (currentUrl.equals(url)) {
            System.out.println("Pass - The correct Url is opened");
        } else {
            System.out.println("Fail - An incorrect Url is opened.");
        }
        System.out.println("Length of the Page Source is : " + pageSourceLength);

    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}