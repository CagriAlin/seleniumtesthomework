package com.testinium.pages;

import com.testinium.driver.BaseSetup;
import com.testinium.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseSetup.class);

    public HomePage(){

        methods = new Methods();

    }

    public void home(){

        try {
            logger.info("*************KİTAP YURDU SİTESİ TEST OTOMASYONU*************");
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//div[@class='logo-icon']")));
            logger.info("Anasayfa açıldı.");
            methods.waitBySeconds(2);
        }
        catch (Exception e) {
            logger.error("Hata: "+e);
        }

    }

}
