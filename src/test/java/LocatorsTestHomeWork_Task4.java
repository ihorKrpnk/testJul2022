import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LocatorsTestHomeWork_Task4 {

    @Test
    public void locatorsTestHomeWork() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        By ElementXpathBankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");
        driver.findElement(ElementXpathBankManagerLogin).click();

        By ElementXpathCustomers = By.xpath("//button[normalize-space()='Customers']");
        driver.findElement(ElementXpathCustomers).click();

        By ElementXpathDelete = By.xpath("//button[text()='Delete']");
        List<WebElement> webElementList = driver.findElements(ElementXpathDelete);

        for (int i = 0; i < webElementList.size(); i++) {
            driver.findElement(ElementXpathDelete).click();
        }

        driver.quit();
    }
}