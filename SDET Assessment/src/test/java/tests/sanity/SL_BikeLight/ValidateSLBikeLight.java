package tests.sanity.SL_BikeLight;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BikeLightPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLBikeLight extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLBikeLight() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        //Validate Back Pack
        log.info("Navigate and validate SL Bike Light");
        productsPage.SLBikeLight();

        log.info("Validate product name");
        BikeLightPage bikeLightPage = new BikeLightPage(driver, log);
        String bikeLightActual = bikeLightPage.getSLBikeLight();
        String bikeLightExpected = "Sauce Labs Bike Light";
        softAssert.assertEquals(bikeLightActual, bikeLightExpected,"Bike Light Name");
        softAssert.assertAll();
    }
}
