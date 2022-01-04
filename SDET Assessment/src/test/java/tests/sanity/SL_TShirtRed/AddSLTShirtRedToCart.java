package tests.sanity.SL_TShirtRed;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.TShirtRedPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;

public class AddSLTShirtRedToCart extends TestUtilities {

    @Test
    public void AddSLTShirtRedToCart() {

        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to SL TshirtRed");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLTShirt_Red();

        //Add to Cart
        log.info("Adding SL TshirtRed to Cart");
        TShirtRedPage tShirtRedPage = new TShirtRedPage(driver, log);
        tShirtRedPage.addTShirtRedToCart();

    }
}
