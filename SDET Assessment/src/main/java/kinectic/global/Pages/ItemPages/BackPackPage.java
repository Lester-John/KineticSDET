package kinectic.global.Pages.ItemPages;

import kinectic.global.Pages.BasePageObject;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackPackPage extends BasePageObject {

    //Item
    private By sauceLabsBackPack = By.cssSelector(".inventory_details_name.large_size");

    //Add to cart
    private By backPack = By.id("add-to-cart-sauce-labs-backpack");

    //Price
    private By BackPackPrice = By.cssSelector(".inventory_details_price");

    //Description
    private By BackPackDesc = By.cssSelector(".inventory_details_desc.large_size");

    public BackPackPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //Verify Back pack
    public String getSLBackPack(){
        return find(sauceLabsBackPack).getText();
    }

    //Navigate to SL Back pack
    public void SLBackPack(){
        log.info("click on SL Back Pack");
        click(sauceLabsBackPack);
    }

    //Verify back pack price
    public String getSLBackPackPrice(){
        log.info("Get back pack price");
        return find(BackPackPrice).getText();
    }

    //Verify back pack description
    public String getSLBackPackDesc(){
        log.info("Get Back pack Description");
        return find(BackPackDesc).getText();
    }

    //Add BackPack to cart
    public void addBackPackToCart(){
        log.info("Back Pack added to cart");
        click(backPack);
    }

}
