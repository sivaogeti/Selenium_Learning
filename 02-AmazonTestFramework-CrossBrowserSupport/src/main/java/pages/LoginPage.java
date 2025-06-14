package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ConfigReader;

public class LoginPage {

		WebDriver driver ;

		private By signlink = By.id("nav-link-accountList-nav-line-1");
		
		private By email_login = By.id("ap_email_login");

		private By continue_link = By.className("a-button-input");

		private By password = By.name("password");

		private By signin_submit = By.id("signInSubmit");
		
		String email = ConfigReader.get("username");
	    String pwd = ConfigReader.get("password");
	    
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    
	    public void login() {
	    	
	    	driver.findElement(signlink).click();
	    	
	    	driver.findElement(email_login).sendKeys(email);
	    	driver.findElement(continue_link).click();
	    	
	    	driver.findElement(password).sendKeys(pwd);
	    	driver.findElement(signin_submit).click();
	    }

}
