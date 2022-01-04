package tests.sanity.SL_BoltTShirt;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BoltTShirtPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLBoltTShirtPrice extends TestUtilities {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLBoltTShirtPrice() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to Sauce Labs Bolt TShirt");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLBoldTShirt();

        //Validate SL Bolt TShirt price
        BoltTShirtPage boltTShirtPage = new BoltTShirtPage(driver, log);
        String boltTShirtPriceActual = boltTShirtPage.getBoltTShirtPrice();
        String boltTShirtExpected = "$15.99";
        softAssert.assertEquals(boltTShirtPriceActual, boltTShirtExpected, "Bolt TShirt Price");
        softAssert.assertAll();
    }
}
