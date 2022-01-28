package com.testinium.pages;

import com.testinium.driver.BaseSetup;
import com.testinium.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseSetup.class);


    public ProductPage() {

        methods = new Methods();

    }

    public void productSelect() {

        try {
            methods.sendKey(By.id("search-input"), "oyuncak");
            methods.waitBySeconds(1);
            methods.click(By.cssSelector(".common-sprite.button-search"));
            logger.info("Oyuncak aratıldı");
            methods.waitBySeconds(1);
            methods.scrollWithAction(By.xpath("//div[@class=\"product-cr\"][7]"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[@class='add-to-favorites' and contains(@onclick,'addToFavorites(579686);')]"));
            methods.waitBySeconds(1);
            methods.click(By.xpath("//a[@class='add-to-favorites' and contains(@onclick,'addToFavorites(586888);')]"));
            methods.waitBySeconds(1);
            methods.click(By.xpath("//a[@class='add-to-favorites' and contains(@onclick,'addToFavorites(495681);')]"));
            methods.waitBySeconds(1);
            methods.click(By.xpath("//a[@class='add-to-favorites' and contains(@onclick,'addToFavorites(395206);')]"));
            logger.info("Favorilerime dört ürün eklendi");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//div[@class=\"menu top my-list\"]"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
            logger.info("Favorilerime gidildi.");
        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }
}
