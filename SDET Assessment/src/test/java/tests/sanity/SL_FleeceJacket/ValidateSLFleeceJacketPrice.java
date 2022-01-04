package tests.sanity.SL_FleeceJacket;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.FleeceJacketPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLFleeceJacketPrice extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLFleeceJacketPrice() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to Sauce Labs Fleece Jacket");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLFleeceJacket();

        //Validate Fleece Jacket price
        FleeceJacketPage fleeceJacketPage = new FleeceJacketPage(driver, log);
        String fleeceJacketPriceActual = fleeceJacketPage.getFleeceJacketPrice();
        String fleeceJacketExpected = "$49.99";
        softAssert.assertEquals(fleeceJacketPriceActual, fleeceJacketExpected, "Fleece Jacket Price");
        softAssert.assertAll();
    }
}
