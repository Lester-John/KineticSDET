package tests.sanity.SL_BoltTShirt;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BoltTShirtPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLBoltTShirtDescription extends TestUtilities {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLBoltTShirtDescription() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        //Validate SL Bolt TShirt
        log.info("Navigate and validate SL Bolt TShirt");
        productsPage.SLBoldTShirt();

        //Validate SL Bolt TShirt Description
        log.info("Validate SL Bolt TShirt Description");
        BoltTShirtPage boltTShirtPage = new BoltTShirtPage(driver, log);
        String boldTShirtDesc = boltTShirtPage.getBoltTShirtDesc();
        String descriptionActual= "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
        softAssert.assertEquals(descriptionActual,boldTShirtDesc,"SL Bolt TShirt Description");
        softAssert.assertAll();
    }
}
