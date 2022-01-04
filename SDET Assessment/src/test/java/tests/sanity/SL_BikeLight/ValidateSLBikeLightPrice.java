package tests.sanity.SL_BikeLight;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BikeLightPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLBikeLightPrice extends TestUtilities {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLBikeLightPrice() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to Sauce Labs Bike Light");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLBikeLight();

        //Validate Bike Light price
        BikeLightPage bikeLightPage = new BikeLightPage(driver, log);
        String bikeLightPriceActual = bikeLightPage.getBikeLightPrice();
        String bikeLightExpected = "$9.99";
        softAssert.assertEquals(bikeLightPriceActual, bikeLightExpected, "Bike Light Price");
        softAssert.assertAll();
    }
}
