package kinectic.global.Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject{
	
	private String DEMO = "https://www.saucedemo.com/";
	
	public By usernameLocator = By.name("user-name");
	public By passwordLocator = By.name("password");
	public By loginButtonLocator = By.name("login-button");

	public LoginPage(WebDriver driver, Logger log) {
		super(driver, log);
	}
	
	//Open Sauce Demo with pageUrl
	public void openPage() {
		log.info("Opening Sauce Demo: " + DEMO);
		openUrl(DEMO);
		click(loginButtonLocator);
		log.info("Page Opened");
	}
	
	//Execute Login
	public ProductsPage login(String username, String password) {
		log.info("Login in with: " + username + ": " + password);
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(loginButtonLocator);
		return new ProductsPage(driver, log);
	}

}
