package tests.sanity.SL_FleeceJacket;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.FleeceJacketPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLFleeceJacket extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLFleeceJacket(){
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        //Validate SL Fleece Jacket
        log.info("Navigate and validate SL Fleece Jacket");
        productsPage.SLFleeceJacket();

        log.info("Validate product name");
        FleeceJacketPage fleeceJacketPage = new FleeceJacketPage(driver, log);
        String fleeceJacketActual = fleeceJacketPage.getSLFleeceJacket();
        String fleeceJacketExpected = "Sauce Labs Fleece Jacket";
        softAssert.assertEquals(fleeceJacketActual,fleeceJacketExpected,"Sauce Labs Fleece Jacket Name");
        softAssert.assertAll();

    }
}
