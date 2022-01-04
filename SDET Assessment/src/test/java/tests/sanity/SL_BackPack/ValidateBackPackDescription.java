package tests.sanity.SL_BackPack;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BackPackPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateBackPackDescription extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateBackPackDescription() {
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

        //Validate Back Pack Description
        log.info("Validate Back Pack Description");
        BackPackPage backPackPage = new BackPackPage(driver, log);
        String backPackDesc = backPackPage.getSLBackPackDesc();
        String descriptionActual= "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        softAssert.assertEquals(descriptionActual,backPackDesc,"Back Pack Description");
        softAssert.assertAll();
    }
}
