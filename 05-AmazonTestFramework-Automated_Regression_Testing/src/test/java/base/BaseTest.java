package base;

import utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;

@Listeners({AllureTestNg.class})
public class BaseTest {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) {
        driver = BrowserFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            //driver.quit();
        }
    }
}