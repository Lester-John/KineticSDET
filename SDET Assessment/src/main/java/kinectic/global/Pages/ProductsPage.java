package kinectic.global.Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePageObject {

    //Products
    private By sauceLabsBackPack = By.cssSelector("a[id='item_4_title_link'] div[class='inventory_item_name']");
    private By sauceLabsBikeLight = By.cssSelector("a[id='item_0_title_link'] div[class='inventory_item_name']");
    private By sauceLabsBoldTShirt = By.cssSelector("a[id='item_1_title_link'] div[class='inventory_item_name']");
    private By saucelabsFleeceJacket = By.cssSelector("a[id='item_5_title_link'] div[class='inventory_item_name']");
    private By sauceLabsOnesie = By.cssSelector("a[id='item_2_title_link'] div[class='inventory_item_name']");
    private By testAllThgeThingsTShirt_Red = By.cssSelector("a[id='item_3_title_link'] div[class='inventory_item_name']");

    //Add to cart
    private By backPack = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    private By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private By boldTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By fleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By onesie = By.id("add-to-cart-sauce-labs-onesie");
    private By tShirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    //Price
    private By backPackPrice = By.cssSelector("div[class='inventory_list'] div:nth-child(1) div:nth-child(2) div:nth-child(2) div:nth-child(1)");
    private By bikeLightPrice = By.cssSelector("div[id='inventory_container'] div:nth-child(2) div:nth-child(2) div:nth-child(2) div:nth-child(1)");
    private By boldTShirtPrice = By.cssSelector("div:nth-child(3) div:nth-child(2) div:nth-child(2) div:nth-child(1)");
    private By fleeceJacketPrice = By.cssSelector("div:nth-child(4) div:nth-child(2) div:nth-child(2) div:nth-child(1)");
    private By onesiePrice = By.cssSelector("div:nth-child(5) div:nth-child(2) div:nth-child(2) div:nth-child(1)");
    private By tShirt_RedPrice = By.cssSelector("div:nth-child(6) div:nth-child(2) div:nth-child(2) div:nth-child(1)");

    //Description
    private By backPackDesc = By.cssSelector("body div[id='root'] div[id='page_wrapper'] div[id='contents_wrapper'] div[id='inventory_container'] div div[id='inventory_container'] div[class='inventory_list'] div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1)");
    private By bikeLightDesc = By.cssSelector("body div[id='root'] div[id='page_wrapper'] div[id='contents_wrapper'] div[id='inventory_container'] div div[id='inventory_container'] div[class='inventory_list'] div:nth-child(2) div:nth-child(2) div:nth-child(1) div:nth-child(1)");
    private By boldTShirtDesc = By.cssSelector("body div[id='root'] div[id='page_wrapper'] div[id='contents_wrapper'] div[id='inventory_container'] div div[id='inventory_container'] div[class='inventory_list'] div:nth-child(3) div:nth-child(2) div:nth-child(1) div:nth-child(1)");
    private By fleeceJacketDesc = By.cssSelector("body div[id='root'] div[id='page_wrapper'] div[id='contents_wrapper'] div[id='inventory_container'] div div[id='inventory_container'] div[class='inventory_list'] div:nth-child(4) div:nth-child(2) div:nth-child(1) div:nth-child(1)");
    private By onesieDesc = By.cssSelector("body div[id='root'] div[id='page_wrapper'] div[id='contents_wrapper'] div[id='inventory_container'] div div[id='inventory_container'] div[class='inventory_list'] div:nth-child(5) div:nth-child(2) div:nth-child(1) div:nth-child(1)");
    private By tShirt_RedPriceDesc = By.cssSelector("body div[id='root'] div[id='page_wrapper'] div[id='contents_wrapper'] div[id='inventory_container'] div div[id='inventory_container'] div[class='inventory_list'] div:nth-child(6) div:nth-child(2) div:nth-child(1) div:nth-child(1)");

    public ProductsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //Verify SL Back pack
    public String getSLBackPack(){
        return find((By) sauceLabsBackPack).getText();
    }

    //Verify SL BikeLight
    public String getSLBikeLight(){
        return find(sauceLabsBikeLight).getText();
    }

    //Verify SL BoldTShirt
    public String getSLBoldTShirt(){
        return find(sauceLabsBoldTShirt).getText();
    }

    //Verify SL FleeceJacket
    public String getSLFleeceJacket(){
        return find(saucelabsFleeceJacket).getText();
    }

    //Verify SL Onesie
    public String getSLOnesie(){
        return find(sauceLabsOnesie).getText();
    }

    //Verify SL TShirt_Red
    public String getSLTShirt_Red(){
        return find(testAllThgeThingsTShirt_Red).getText();
    }

    //Navigate to SL Back Pack
    public void SLBackPack(){
        log.info("Click on Back Pack");
        click(sauceLabsBackPack);
    }

    //Navigate to SL BikeLight
    public void SLBikeLight(){
        log.info("Click on BikeLight");
        click(sauceLabsBikeLight);
    }

    //Navigate to SL BoldTShirt
    public void SLBoldTShirt(){
        log.info("Click on BoldTShirt");
        click(sauceLabsBoldTShirt);
    }

    //Navigate to SL FleeceJacket
    public void SLFleeceJacket(){
        log.info("Click on FleeceJacket");
        click(saucelabsFleeceJacket);
    }

    //Navigate to SL Onesie
    public void SLOnesie(){
        log.info("Click on Onesie");
        click(sauceLabsOnesie);
    }

    //Navigate to SL TShirt_Red
    public void SLTShirt_Red(){
        log.info("Click on TShirt_Red");
        click(testAllThgeThingsTShirt_Red);
    }

    //Add BackPack to cart
    public void addBackPackToCart(){
        log.info("add BackPack to cart");
        click(backPack);
    }

    //Add Bike Light to cart
    public void addBikeLightToCart(){
        log.info("add Bike Light to cart");
        click(bikeLight);
    }

    //Add Bold TShirt to cart
    public void addBoldTShirtToCart(){
        log.info("add Bold TShirt to cart");
        click(boldTShirt);
    }

    //Add Fleece Jacket to cart
    public void addFleeceJacketToCart(){
        log.info("add Fleece Jacket to cart");
        click(fleeceJacket);
    }

    //Add Onesie to cart
    public void addOnesieToCart(){
        log.info("add Onesie to cart");
        click(onesie);
    }

    //Add TShirt to cart
    public void addTShirtToCart(){
        log.info("add tShirt to cart");
        click(tShirt);
    }

    //Validate Back Pack Price
    public String getBackPackPrice(){
        return find(backPackPrice).getText();
    }

    //Validate BikeLight Price
    public String getBikeLightPrice(){
        return find(bikeLightPrice).getText();
    }

    //Validate Bold TShirt Price
    public String getBoldTShirtPrice(){
        return find(boldTShirtPrice).getText();
    }

    //Validate Fleece Jacket Price
    public String getFleeceJacketPrice(){
        return find(fleeceJacketPrice).getText();
    }

    //Validate Onesie Price
    public String getOnesiePrice(){
        return find(onesiePrice).getText();
    }

    //Validate TShirt_RedPrice Price
    public String gettShirt_RedPrice(){
        return find(tShirt_RedPrice).getText();
    }

    //Validate Back Pack Description
    public String getBackPackDesc(){
        return find(backPackDesc).getText();
    }

    //Validate Bike Light Description
    public String getBikeLightDesc(){
        return find(bikeLightDesc).getText();
    }

    //Validate Bold TShirt Description
    public String getBoldTShirtDesc(){
        return find(boldTShirtDesc).getText();
    }

    //Validate Fleece Jacket Description
    public String getFleeceJacketDesc(){
        return find(fleeceJacketDesc).getText();
    }

    //Validate Onesie Description
    public String getOnesieDesc(){
        return find(onesieDesc).getText();
    }

    //Validate TShirt_Red Description
    public String gettShirt_RedDesc(){
        return find(tShirt_RedPriceDesc).getText();
    }
}