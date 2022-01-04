package tests.checks;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import kinectic.global.Pages.LoginPage;

public class Login extends TestUtilities {

	@Test
	public void Login() {

		// Open Sauce Demo
		log.info("Opening Sauce Demo");
		LoginPage loginPage = new LoginPage(driver, log);
		loginPage.openPage();

		// Login into Sauce Demo
		log.info("Starting LogIn Test");
		ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");
	}
}
