package tests.sanity.SL_TShirtRed;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.TShirtRedPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLTShirtRedDescription extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLTShirtRedDescription() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        //Validate SL TShirt Red
        log.info("Navigate and validate SL TShirt Red");
        productsPage.SLTShirt_Red();

        //Validate SL TShirt Red Description
        log.info("Validate SL TShirt Red Description");
        TShirtRedPage tShirtRedPage = new TShirtRedPage(driver, log);
        String tShirtRedDesc = tShirtRedPage.getTShirtRedDesc();
        String descriptionActual= "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";
        softAssert.assertEquals(descriptionActual,tShirtRedDesc,"SL TShirt Red Description");
        softAssert.assertAll();
    }
}
