package tests.sanity.SL_FleeceJacket;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.FleeceJacketPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLFleeceJacketDescription extends TestUtilities {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLFleeceJacketDescription() {
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

        //Validate SL Fleece Jacket Description
        log.info("Validate SL Fleece Jacket Description");
        FleeceJacketPage fleeceJacketPage = new FleeceJacketPage(driver, log);
        String fleeceJacketDesc = fleeceJacketPage.getFleeceJacketDesc();
        String descriptionActual= "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";
        softAssert.assertEquals(descriptionActual,fleeceJacketDesc,"SL Fleece Jacket Description");
        softAssert.assertAll();
    }
}
