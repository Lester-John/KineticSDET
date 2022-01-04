package tests.sanity.SL_BackPack;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BackPackPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateBackPackPrice extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateBackPackPrice() {

        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to Sauce Labs Back Pack");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLBackPack();

        //Validate back pack price
        BackPackPage backPackPage = new BackPackPage(driver, log);
        String backPackPriceActual = backPackPage.getSLBackPackPrice();
        String backPackExpected = "$29.99";
        softAssert.assertEquals(backPackPriceActual, backPackExpected, "Back Pack Price");
        softAssert.assertAll();
    }
}
