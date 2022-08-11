import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorsTest {

    @Test
    public void locatorsTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Document_Object_Model");

        By abbreviation = By.xpath("(//td[@class='infobox-data'])[1]");
        WebElement abbreviationElement = driver.findElement(abbreviation);
        String abbreviationValue = abbreviationElement.getText();

        Assert.assertEquals(abbreviationValue, "DOM2");

        By someElementCSS = By.cssSelector("a[href*='Random']");
        WebElement randomItemWiki = driver.findElement(someElementCSS);
        randomItemWiki.click();

        By someElementXpath = By.xpath("//span[text()='Español']");
        driver.findElement(someElementXpath).click();

        By someElementID = By.id("");

    }
}
