package tests.sanity.SL_BackPack;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BackPackPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateBackPack extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateBackPack(){

        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        //Validate Back Pack
        log.info("Navigate and validate Back Pack");
        productsPage.SLBackPack();

        log.info("Validate product name");
        BackPackPage backPackPage = new BackPackPage(driver, log);
        String backPackActual = backPackPage.getSLBackPack();
        String backPackExpected = "Sauce Labs Backpack";
        softAssert.assertEquals(backPackActual,backPackExpected,"Back Pack Name");
        softAssert.assertAll();
    }
}
