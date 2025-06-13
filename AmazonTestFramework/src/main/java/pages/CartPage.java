package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	WebDriver driver;

	private By addto_cart = By.id("add-to-cart-button");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	 public void cart() {
	    	
	    	driver.findElement(addto_cart).click();
	 }

}
