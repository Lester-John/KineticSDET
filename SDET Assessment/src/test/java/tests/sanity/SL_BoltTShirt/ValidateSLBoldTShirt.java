package tests.sanity.SL_BoltTShirt;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BoltTShirtPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLBoldTShirt extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLBoldTShirt(){
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        //Validate SL Bold TShirt
        log.info("Navigate and validate SL Bold TShirt");
        productsPage.SLBoldTShirt();

        log.info("Validate product name");
        BoltTShirtPage boltTShirtPage = new BoltTShirtPage(driver, log);
        String boldTShirtActual = boltTShirtPage.getSLBoltTShirt();
        String boldTShirtExpected = "Sauce Labs Bolt T-Shirt";
        softAssert.assertEquals(boldTShirtActual, boldTShirtExpected, "Sauce Labs Bolt T-Shirt Name");
        softAssert.assertAll();

    }
}
