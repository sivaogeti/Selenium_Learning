package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    WebDriver driver;

    private By resultLinks = By.xpath("//div[@data-component-type='s-search-result']");

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
