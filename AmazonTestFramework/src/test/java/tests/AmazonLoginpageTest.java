package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AmazonLoginpageTest extends BaseTest {
	
	@Test
	public void logintest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}
}