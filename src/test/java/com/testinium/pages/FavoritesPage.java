package com.testinium.pages;

import com.testinium.driver.BaseSetup;
import com.testinium.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FavoritesPage {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseSetup.class);

    public FavoritesPage() {

        methods = new Methods();

    }

    public void favoriteControl(){

        try {
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//div[contains(text(),'Gösterilen: 1 ile 4 arası, toplam: 4 (1 Sayfa)')]")));
            logger.info("Favorilere eklenemiş ürün adedi doğrulandı.");
            methods.waitBySeconds(2);
            methods.click(By.cssSelector(".logo-icon"));
            logger.info("Anasayfaya gidildi.");
        }
        catch (Exception e){
            logger.error("Hata: "+ e);
        }


    }

}
