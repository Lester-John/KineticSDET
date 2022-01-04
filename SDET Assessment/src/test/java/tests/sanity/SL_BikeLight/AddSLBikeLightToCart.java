package tests.sanity.SL_BikeLight;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BikeLightPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;

public class AddSLBikeLightToCart extends TestUtilities {

    @Test
    public void AddSLBikeLightToCart() {

        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to SL  Bike Light");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLBikeLight();

        //Add to Cart
        log.info("Adding Bike Light to Cart");
        BikeLightPage bikeLightPage = new BikeLightPage(driver, log);
        bikeLightPage.addBikeLightToCart();
    }
}
