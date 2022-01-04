package kinectic.global.Pages.ItemPages;

import kinectic.global.Pages.BasePageObject;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BikeLightPage extends BasePageObject {

    //Item
    private By sauceLabsBikeLight = By.cssSelector(".inventory_details_name.large_size");
    //Add to cart
    private By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    //Price
    private By BikeLightPrice = By.className("inventory_details_price");
    //Description
    private By BikeLightDesc = By.cssSelector(".inventory_details_desc.large_size");



    public BikeLightPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //Verify SL Bike Light
    public String getSLBikeLight(){
        return find(sauceLabsBikeLight).getText();
    }

    //Navigate to Bike Light
    public void BikeLight(){
        log.info("click on SL Bike Light");
        click(sauceLabsBikeLight);
    }

    //Verify Bike Light price
    public String getBikeLightPrice(){
        log.info("Bike Light price Validated");
        return find(BikeLightPrice).getText();
    }

    //Verify Bike Light description
    public String getBikeLightDesc(){
        log.info("Bike Light Description validated");
        return find(BikeLightDesc).getText();
    }

    //Add Bike Light to cart
    public void addBikeLightToCart(){
        log.info("BikeLight added to cart");
        click(bikeLight);
    }

}
