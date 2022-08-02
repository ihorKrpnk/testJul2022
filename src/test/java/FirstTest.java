import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest {

    @AfterMethod
    public void postconds(){
        System.out.println("NG postconds");
    }

    @Test
    public void firstTest(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("NG test");
        int b = 2;
        boolean isSignInPresent = true;
        Assert.assertEquals(b, 2);
        Assert.assertTrue(isSignInPresent);

        softAssert.assertAll();
    }
    @BeforeTest
    public void preconds(){
        System.out.println("NG prec");
    }

}
