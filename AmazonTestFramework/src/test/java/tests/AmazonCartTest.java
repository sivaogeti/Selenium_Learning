package tests;

import org.junit.Test;

import base.BaseTest;
import pages.CartPage;

public class AmazonCartTest extends BaseTest {
	
	@Test
	public void cartTest() {
		System.out.println("came here1");
		CartPage cartPage = new CartPage(driver);
		cartPage.cart();
		System.out.println("came here2");
	}

}	