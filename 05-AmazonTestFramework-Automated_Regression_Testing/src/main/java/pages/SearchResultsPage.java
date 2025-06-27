package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LocatorFactory;

import java.util.List;

public class SearchResultsPage {
    WebDriver driver;

    By resultLinks = LocatorFactory.getLocator("searchpage_resultLinks");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstResult() {
        List<WebElement> links = driver.findElements(resultLinks);
        
        if (!links.isEmpty()) {        	
            links.get(0).click();            
        }
    }
}
