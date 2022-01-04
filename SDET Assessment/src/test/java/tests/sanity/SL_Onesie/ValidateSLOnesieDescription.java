package tests.sanity.SL_Onesie;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.OnesiePage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLOnesieDescription extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLOnesieDescription() {
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

        //Validate SL Onesie Description
        log.info("Validate SL Onesie Description");
        OnesiePage onesiePage = new OnesiePage(driver, log);
        String onesieDesc = onesiePage.getSLOnesieDesc();
        String descriptionActual= "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";
        softAssert.assertEquals(descriptionActual,onesieDesc,"SL Onesie Description");
        softAssert.assertAll();
    }
}
