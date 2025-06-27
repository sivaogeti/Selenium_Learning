package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import io.qameta.allure.*;

public class AmazonLoginpageTest extends BaseTest {

	@Epic("Amazon Website")
	@Feature("Amazon Login Functionality")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verifying Amazon Login with Valid Credentials")

	@Test
	public void logintest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}
}