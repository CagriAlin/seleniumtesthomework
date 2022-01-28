package com.testinium.pages;

import com.testinium.driver.BaseSetup;
import com.testinium.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LogOutPage {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseSetup.class);

    public LogOutPage(){

        methods = new Methods();

    }

    public void logout(){

        try {
            methods.scrollWithAction(By.xpath("//a[@class=\"common-sprite\" and text()='Merhaba ']"));
            methods.click(By.xpath("//a[contains(text(),'Çıkış')]"));
            logger.info("Çıkış yapıldı.");
            logger.info("**************************TEST SONU*************************");
        }
        catch(Exception e){
            logger.error("Hata "+e);
        }
    }
}