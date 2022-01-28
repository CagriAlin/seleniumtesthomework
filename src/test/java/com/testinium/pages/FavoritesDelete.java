package com.testinium.pages;

import com.testinium.driver.BaseSetup;
import com.testinium.methods.Methods;
import org.apache.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.apache.log4j.Logger;

public class FavoritesDelete {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseSetup.class);

    public FavoritesDelete() {

        methods = new Methods();

    }
    public void favoritesDelete() {

        try {
            methods.waitBySeconds(1);
            methods.click(By.xpath("//a[@data-title=\"Favorilerimden Sil\" and contains(@onclick,'removeFromFavorites(586888);')]"));
            logger.info("Üçüncü ürün silindi.");
            methods.waitBySeconds(1);
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//div[contains(text(),'Gösterilen: 1 ile 3 arası, toplam: 3 (1 Sayfa)')]")));
            logger.info("Ürünün silindiği doğrulandı.");
            methods.waitBySeconds(2);
            methods.click(By.id("cart-items"));
            methods.waitBySeconds(2);
            methods.click(By.id("js-cart"));
            logger.info("Sepetime gidildi.");
        } catch (Exception e) {
            logger.error("Hata " + e);
        }
    }
}
