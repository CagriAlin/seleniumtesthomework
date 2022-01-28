package com.testinium.pages;

import com.testinium.driver.BaseSetup;
import com.testinium.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ScoreCatalog {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseSetup.class);

    public ScoreCatalog(){

        methods = new Methods();

    }

    public void scoreCatalog(){

        try {
            methods.waitBySeconds(2);
            methods.click(By.xpath("//div[@class=\"lvl1catalog\"]"));
            logger.info("Puan kataloğu açıldı");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//img[@title=\"Puan Kataloğundaki Türk Klasikleri\"]"));
            logger.info("Türk klasikleri açıldı.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//select[@onchange=\"location = this.value;\"]"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//option[contains(text(),'Yüksek Oylama')]"));
            logger.info("Yüksek oylama filtresi uygulandı.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//span[@class=\"mn-strong common-sprite\" and text()='Tüm Kitaplar']"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[@class=\"mn-icon icon-angleRight\" and text()='Hobi']"));
            logger.info("Tüm kitaplar altından hobi katagorisi seçildi.");
            methods.waitBySeconds(2);
            methods.randomSelect(By.xpath("//a[@class=\"pr-img-link\"]"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//span[contains(text(),'Sepete Ekle')]"));
            logger.info("Rastegele ürün seçildi.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//div[@class=\"menu top my-list\"]"));
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
            logger.info("Favorilerime gidildi");
        }
        catch(Exception e){
            logger.error("Hata "+e);
        }


    }

}


