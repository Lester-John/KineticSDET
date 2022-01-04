package tests.sanity.SL_Onesie;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.OnesiePage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLOnesiePrice extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLOnesiePrice() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to Sauce Labs Onesie");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLOnesie();

        //Validate SL Onesie price
        OnesiePage onesiePage = new OnesiePage(driver, log);
        String onesiePriceActual = onesiePage.getSLOnesiePrice();
        String onesieExpected = "$7.99";
        softAssert.assertEquals(onesiePriceActual, onesieExpected, "SL Onesie Price");
        softAssert.assertAll();
    }
}
