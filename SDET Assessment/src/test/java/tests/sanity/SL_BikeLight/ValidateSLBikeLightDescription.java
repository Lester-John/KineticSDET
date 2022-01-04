package tests.sanity.SL_BikeLight;

import kinectic.global.BaseTest.TestUtilities;
import kinectic.global.Pages.ItemPages.BikeLightPage;
import kinectic.global.Pages.LoginPage;
import kinectic.global.Pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateSLBikeLightDescription extends TestUtilities {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void ValidateSLBikeLightDescription() {
        // Open Sauce Demo
        log.info("Opening Sauce Demo");
        LoginPage loginPage = new LoginPage(driver, log);
        loginPage.openPage();

        // Login into Sauce Demo
        log.info("Starting LogIn Test");
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        //Validate SL Bike Light
        log.info("Navigate and validate SL Bike Light");
        productsPage.SLBikeLight();

        //Validate SL Bike Light Description
        log.info("Validate SL Bike Light Description");
        BikeLightPage bikeLightPage = new BikeLightPage(driver, log);
        String bikeLightDesc = bikeLightPage.getBikeLightDesc();
        String descriptionActual= "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
        softAssert.assertEquals(descriptionActual,bikeLightDesc,"Bike Light Description");
        softAssert.assertAll();
    }
}
