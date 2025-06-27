package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.JsonConfigReader;
import utils.LocatorFactory;

public class LoginPage {

		WebDriver driver ;

		By signlink = LocatorFactory.getLocator("sign_link");

		By emaillogin = LocatorFactory.getLocator("email_login");

		By continuelink = LocatorFactory.getLocator("continue_link");

		By passwordlink = LocatorFactory.getLocator("password_link");

		By signinsubmit = LocatorFactory.getLocator("signin_submit");

		String email = JsonConfigReader.getCredential("username");

		String pwd = JsonConfigReader.getCredential("password");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    
	    public void login() {
	    	
	    	driver.findElement(signlink).click();
	    	
	    	driver.findElement(emaillogin).sendKeys(email);
	    	driver.findElement(continuelink).click();
	    	
	    	driver.findElement(passwordlink).sendKeys(pwd);
	    	driver.findElement(signinsubmit).click();
	    }

}
