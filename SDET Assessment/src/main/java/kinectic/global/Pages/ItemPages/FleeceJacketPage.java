package kinectic.global.Pages.ItemPages;

import kinectic.global.Pages.BasePageObject;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FleeceJacketPage extends BasePageObject {

    //Item
    private By saucelabsFleeceJacket = By.cssSelector(".inventory_details_name.large_size");
    //Add to cart
    private By fleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    //Price
    private By FleeceJacketPrice = By.className("inventory_details_price");
    //Description
    private By FleeceJacketDesc = By.xpath("//div[@class='inventory_details_desc large_size']");


    public FleeceJacketPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //Verify SL Fleece Jacket
    public String getSLFleeceJacket(){
        return find(saucelabsFleeceJacket).getText();
    }

    //Navigate to SL Fleece Jacket
    public void FleeceJacket(){
        log.info("click on SL Fleece Jacket");
        click(saucelabsFleeceJacket);
    }

    //Verify SL Fleece Jacket price
    public String getFleeceJacketPrice(){
        log.info("SL Fleece Jacket price Validated");
        return find(FleeceJacketPrice).getText();
    }

    //Verify SL Fleece Jacket description
    public String getFleeceJacketDesc(){
        log.info("SL Fleece Jacket Description validated");
        return find(FleeceJacketDesc).getText();
    }

    //Add SL Fleece Jacket to cart
    public void addFleeceJacketToCart(){
        log.info("SL Fleece Jacket added to cart");
        click(fleeceJacket);
    }

}
