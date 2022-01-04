package kinectic.global.Pages.ItemPages;

import kinectic.global.Pages.BasePageObject;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TShirtRedPage extends BasePageObject {

    //Item
    private By testAllThgeThingsTShirt_Red = By.cssSelector(".inventory_details_name.large_size");
    //Add to cart
    private By tShirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    //Price
    private By TShirt_RedPrice = By.className("inventory_details_price");
    //Description
    private By TShirt_RedPriceDesc = By.xpath("//div[@class='inventory_details_desc large_size']");


    public TShirtRedPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //Verify SL TShirtRed
    public String getTShirtRed(){
        return find(testAllThgeThingsTShirt_Red).getText();
    }

    //Navigate to SL TShirtRed
    public void TShirtRed(){
        log.info("click on SL TShirtRed");
        click(testAllThgeThingsTShirt_Red);
    }

    //Verify SL TShirtRed price
    public String getTShirtRedPrice(){
        log.info("SL TShirtRed price Validated");
        return find(TShirt_RedPrice).getText();
    }

    //Verify SL TShirtRed description
    public String getTShirtRedDesc(){
        log.info("SL TShirtRed Description Validated");
        return find(TShirt_RedPriceDesc).getText();
    }

    //Add SL TShirtRed to cart
    public void addTShirtRedToCart(){
        log.info("SL TShirtRed added to cart");
        click(tShirt);
    }

}
