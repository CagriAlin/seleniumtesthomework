package com.testinium.pages;

import com.testinium.driver.BaseSetup;
import com.testinium.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseSetup.class);

    public LoginPage(){

        methods = new Methods();

    }

    public void login(){

        try {
            methods.click(By.xpath("//a[contains(text(),'Giriş Yap')]"));
            methods.waitBySeconds(1);
            methods.sendKey(By.id("login-email"),"omercagrialin@gmail.com");
            methods.sendKey(By.id("login-password"),"cacaron5");
            methods.waitBySeconds(1);
            methods.click(By.xpath("//button[contains(text(),'Giriş Yap')]"));
            logger.info("Giriş yapıldı.");
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//span[contains(text(),'Hesap Bilgilerim')]")));
            logger.info("Giriş yapıldığı doğrulandı");
            methods.waitBySeconds(2);
        }

        catch (Exception e) {

            logger.error("Hata: "+e);
        }

    }

}
