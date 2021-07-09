package tests;;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Driver;

public class BaseTest {

    public Driver driver;
    public final String url = "http://automationpractice.com/";

    @BeforeMethod
    public void setup() {
        driver = new Driver();
        driver.navigate(url);
    }

    @AfterMethod
    public void closeDriver() {
        driver.webDriver.close();
        driver.exit();
    }

}
