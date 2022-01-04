package tests.sanity.SL_Onesie;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.OnesiePage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLOnesie extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLOnesie() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        //Validate SL Onesie
        log.info("Navigate and validate SL Onesie");
        productsPage.SLOnesie();

        log.info("Validate product name");
        OnesiePage onesiePage = new OnesiePage(driver, log);
        String SLOnesiekActual = onesiePage.getSLOnesie();
        String SLOnesieExpected = "Sauce Labs Onesie";
        softAssert.assertEquals(SLOnesiekActual, SLOnesieExpected, "SL Onesie Name");
        softAssert.assertAll();
    }
}
