package tests.sanity.SL_BoltTShirt;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BoltTShirtPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;

public class AddSLBoltTShirtToCart extends TestUtilities {

    @Test
    public void AddSLBoltTShirtToCart() {

        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to SL Bolt Tshirt");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLBoldTShirt();

        //Add to Cart
        log.info("Adding SL Bolt Tshirt to Cart");
        BoltTShirtPage boltTShirtPage = new BoltTShirtPage(driver, log);
        boltTShirtPage.addBoltTShirtToCart();
    }
}
