package tests.sanity.SL_BackPack;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BackPackPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;

public class AddBackPackToCart extends TestUtilities {


    @Test
    public void AddBackPackToCart() {

        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to Sauce Labs Back Pack");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLBackPack();

        //Add to Cart
        log.info("Adding Back Pack to Cart");
        BackPackPage backPackPage = new BackPackPage(driver,log);
        backPackPage.addBackPackToCart();
    }
}
