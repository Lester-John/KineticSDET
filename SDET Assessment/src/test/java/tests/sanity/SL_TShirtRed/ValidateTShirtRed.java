package tests.sanity.SL_TShirtRed;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.TShirtRedPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateTShirtRed extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateTShirtRed(){

        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        //Validate TShirtRed
        log.info("Navigate and validate TShirtRed");
        productsPage.SLTShirt_Red();

        log.info("Validate product name");
        TShirtRedPage tShirtRedPage = new TShirtRedPage(driver, log);
        String tShirtRedActual = tShirtRedPage.getTShirtRed();
        String tShirtRedExpected = "Test.allTheThings() T-Shirt (Red)";
        softAssert.assertEquals(tShirtRedActual,tShirtRedExpected,"TShirtRed Name");
        softAssert.assertAll();
    }
}
