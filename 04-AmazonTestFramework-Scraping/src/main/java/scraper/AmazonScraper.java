package scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonScraper {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless=new"); // run in headless mode
        WebDriver driver = new ChromeDriver(options);

        try {
            String searchQuery = "laptop";
            //driver.get("https://www.amazon.in/s?k=home+furniture" + searchQuery);
            driver.get("https://www.amazon.in/s?k=home+furniture" );

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-component-type='s-search-result']")));

            List<WebElement> products = driver.findElements(By.cssSelector("div[data-component-type='s-search-result']"));
            System.out.println("Found " + products.size() + " products");

            for (WebElement product : products) {
                try {
                    String title = product.findElement(By.cssSelector("h2 a span")).getText();

                    String price = "N/A";
                    try {
                        price = product.findElement(By.cssSelector("span.a-price-whole")).getText();
                    } catch (Exception e) {}

                    String rating = "N/A";
                    try {
                        rating = product.findElement(By.cssSelector("span.a-icon-alt")).getText();
                    } catch (Exception e) {}

                    String url = product.findElement(By.cssSelector("h2 a")).getAttribute("href");

                    System.out.println("Title: " + title);
                    System.out.println("Price: ₹" + price);
                    System.out.println("Rating: " + rating);
                    System.out.println("URL: " + url);
                    System.out.println("------------------------------------------------");
                } catch (Exception e) {
                    continue;
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (driver != null) {
                try {
                    driver.quit();
                } catch (Exception e) {
                    System.err.println("Error while quitting driver: " + e.getMessage());
                }
            }
            System.exit(0); // Clean shutdown of all threads
        }
    }
}