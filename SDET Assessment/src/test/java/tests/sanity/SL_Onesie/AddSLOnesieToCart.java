package tests.sanity.SL_Onesie;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.OnesiePage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;

public class AddSLOnesieToCart extends TestUtilities {

    @Test
    public void AddSLOnesieToCart() {

        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        loginPage.login("standard_user", "secret_sauce");

        //Navigate
        log.info("Navigate to SL Onesie");
        ProductsPage productsPage = new ProductsPage(driver, log);
        productsPage.SLOnesie();

        //Add to Cart
        log.info("Adding SL Onesie to Cart");
        OnesiePage onesiePage = new OnesiePage(driver, log);
        onesiePage.addSLOnesieToCart();

    }
}
