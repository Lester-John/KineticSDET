package kinectic.global.Pages.ItemPages;

import kinectic.global.Pages.BasePageObject;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoltTShirtPage extends BasePageObject {

    //Item
    private By sauceLabsBoldTShirt = By.cssSelector(".inventory_details_name.large_size");
    //Add to cart
    private By boldTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    //Price
    private By BoldTShirtPrice = By.cssSelector(".inventory_details_price");
    //Description
    private By BoldTShirtDesc = By.cssSelector(".inventory_details_desc.large_size");

    public BoltTShirtPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //Verify SL Bolt TShirt
    public String getSLBoltTShirt(){
        return find(sauceLabsBoldTShirt).getText();
    }

    //Navigate to SL Bolt TShirt
    public void BoltTShirt(){
        log.info("click on SL Bolt TShirt");
        click(sauceLabsBoldTShirt);
    }

    //Verify SL Bolt TShirt price
    public String getBoltTShirtPrice(){
        log.info("Bike Light price validated");
        return find(BoldTShirtPrice).getText();
    }

    //Verify SL Bolt TShirt description
    public String getBoltTShirtDesc(){
        log.info("Bike Light Description validated");
        return find(BoldTShirtDesc).getText();
    }

    //Add SL Bolt TShirt to cart
    public void addBoltTShirtToCart(){
        log.info("Bolt TShirt added to cart");
        click(boldTShirt);
    }

}
