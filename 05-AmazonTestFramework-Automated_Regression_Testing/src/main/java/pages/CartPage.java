package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocatorFactory;

import java.time.Duration;
import java.util.List;

public class CartPage {
	
	WebDriver driver;

	By resultLinks = LocatorFactory.getLocator("cart_page_resultLinks");

	By searchBox = LocatorFactory.getLocator("homepage_searchBox");

	By searchButton = LocatorFactory.getLocator("homepage_searchButton");

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void cart(String query) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(searchBox).sendKeys(query);
		driver.findElement(searchButton).click();

		List<WebElement> links = driver.findElements(resultLinks);

		if (!links.isEmpty()) {
		 links.get(0).click();
		}


		// Switch to new tab (Amazon opens product pages in a new tab sometimes)
		for (String windowHandle : driver.getWindowHandles()) {
		 driver.switchTo().window(windowHandle);
		}

		// Click Add to Cart
		WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
		addToCartButton.click();

		System.out.println("Product added to cart successfully.");
	}

}