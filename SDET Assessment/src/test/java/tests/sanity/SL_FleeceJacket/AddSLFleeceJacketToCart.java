package tests.sanity.SL_FleeceJacket;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.FleeceJacketPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;

public class AddSLFleeceJacketToCart extends TestUtilities {

    @Test
    public void AddSLFleeceJacketToCart() {

        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to SL Fleece Jacket");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLFleeceJacket();

        //Add to Cart
        log.info("Adding SL Fleece Jacket to Cart");
        FleeceJacketPage fleeceJacketPage = new FleeceJacketPage(driver, log);
        fleeceJacketPage.addFleeceJacketToCart();
    }
}
