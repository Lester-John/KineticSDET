package kinectic.global.Pages.ItemPages;

import kinectic.global.Pages.BasePageObject;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnesiePage extends BasePageObject {

    //Item
    private By sauceLabsOnesie = By.cssSelector(".inventory_details_name.large_size");
    //Add to cart
    private By onesie = By.id("add-to-cart-sauce-labs-onesie");
    //Price
    private By OnesiePrice = By.className("inventory_details_price");
    //Description
    private By onesieDesc = By.cssSelector(".inventory_details_desc.large_size");

    public OnesiePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //Verify SL Onesie
    public String getSLOnesie(){
        return find(sauceLabsOnesie).getText();
    }

    //Navigate to SL Onesie
    public void SLOnesie(){
        log.info("click on SL Onesie");
        click(sauceLabsOnesie);
    }

    //Verify SL Onesie price
    public String getSLOnesiePrice(){
        log.info("SL Onesie price validated");
        return find(OnesiePrice).getText();
    }

    //Verify SL Onesie description
    public String getSLOnesieDesc(){
        log.info("SL Onesie Description Validated");
        return find(onesieDesc).getText();
    }

    //Add SL Onesie to cart
    public void addSLOnesieToCart(){
        log.info("SL Onesie added to cart");
        click(onesie);
    }

}
