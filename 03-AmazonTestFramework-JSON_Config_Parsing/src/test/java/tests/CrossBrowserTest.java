import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import utils.BrowserFactory;

public class CrossBrowserTest {
    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) {
        driver = BrowserFactory.getDriver(browser);
    }

    @Test
    public void testExample() {
        driver.get("https://www.amazon.in/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

