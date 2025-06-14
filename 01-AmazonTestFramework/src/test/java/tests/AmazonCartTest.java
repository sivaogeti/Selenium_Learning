package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import pages.CartPage;

public class AmazonCartTest extends BaseTest  {

	@Test
	public void addToCartAndProceed() {
		CartPage cart = new CartPage(driver);
		cart.cart("Home Furniture");

	}
}
