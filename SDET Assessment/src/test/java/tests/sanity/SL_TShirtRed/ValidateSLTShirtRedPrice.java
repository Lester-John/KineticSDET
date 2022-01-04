package tests.sanity.SL_TShirtRed;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.TShirtRedPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLTShirtRedPrice extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLTShirtRedPrice() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to Sauce Labs TShirt Red");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLTShirt_Red();

        //Validate SL TShirt Red price
        TShirtRedPage tShirtRedPage = new TShirtRedPage(driver, log);
        String tShirtRedPriceActual = tShirtRedPage.getTShirtRedPrice();
        String tShirtRedExpected = "$15.99";
        softAssert.assertEquals(tShirtRedPriceActual, tShirtRedExpected, "SL TShirt Red Price");
        softAssert.assertAll();
    }
}
