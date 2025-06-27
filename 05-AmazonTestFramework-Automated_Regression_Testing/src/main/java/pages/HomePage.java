package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JsonConfigReader;
import utils.LocatorFactory;

public class HomePage {
    WebDriver driver;

    By searchBox = LocatorFactory.getLocator("homepage_searchBox");
    By searchButton = LocatorFactory.getLocator("homepage_searchButton");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String query) {
        driver.findElement(searchBox).sendKeys(query);
        driver.findElement(searchButton).click();
    }
}
