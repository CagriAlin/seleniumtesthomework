package com.testinium.pages;

import com.testinium.driver.BaseSetup;
import com.testinium.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketPage {

    Methods methods;
    Logger logger = LogManager.getLogger(BaseSetup.class);

    public BasketPage(){

        methods = new Methods();

    }

    public void basket(){

        try {
            methods.waitBySeconds(2);
            methods.clear(By.xpath("//input[@value=\"1\"]"));
            methods.waitBySeconds(1);
            methods.sendKey(By.xpath("//input[@value=\"1\"]"),"2");
            methods.waitBySeconds(1);
            methods.click(By.cssSelector(".fa.fa-refresh.green-icon"));
            logger.info("Ürün adedi artırıldı.");
            methods.waitBySeconds(1);
            methods.randomSelect(By.xpath("//a[@class=\"button red\"]"));
            logger.info("Alışveriş başladı.");
            methods.click(By.xpath("//a[@onclick=\"setShippigAddressType('new')\"]"));
            methods.waitBySeconds(1);
            methods.sendKey(By.id("address-firstname-companyname"),"Ömer Çağrı");
            methods.sendKey(By.id("address-lastname-title"),"Alın");
            methods.selectByText(By.id("address-zone-id"),"Hatay");
            methods.waitBySeconds(1);
            methods.selectByText(By.id("address-county-id"),"KIRIKHAN");
            methods.waitBySeconds(1);
            methods.sendKey(By.xpath("//input[@id=\"district\"]"),"YENİ MAH");
            methods.click(By.xpath("//div[contains(text(),'YENİ MAH')]"));
            methods.sendKey(By.id("address-address-text"),"20 TEMMUZ Caddesi no 41");
            methods.sendKey(By.id("address-postcode"),"31440");
            methods.sendKey(By.id("address-telephone"),"5446788386");
            methods.sendKey(By.id("address-mobile-telephone"),"5446788386");
            //methods.sendKey(By.id("address-tax-id"),"11111111111");
            logger.info("Kişisel bilgiler dolduruldu.");
            methods.waitBySeconds(2);
            methods.click(By.id("button-checkout-continue"));
            logger.info("Korgo seçimine ilerlendi.");
            methods.waitBySeconds(2);
            methods.click(By.id("button-checkout-continue"));
            logger.info("Kargo seçimi yapıldı.");
            methods.waitBySeconds(1);
            methods.sendKey(By.id("credit-card-owner"),"Ömer Çağrı Alın");
            methods.sendKey(By.id("credit_card_number_1"),"5282");
            methods.sendKey(By.id("credit_card_number_2"),"0800");
            methods.sendKey(By.id("credit_card_number_3"),"2867");
            methods.sendKey(By.id("credit_card_number_4"),"0396");
            methods.selectByText(By.id("credit-card-expire-date-month"),"10");
            methods.selectByText(By.id("credit-card-expire-date-year"),"2022");
            methods.sendKey(By.id("credit-card-security-code"),"208");
            //methods.click(By.id("credit-card-is-3ds-label"));
            logger.info("Kredi kartı bilgileri girildi.");
            methods.waitBySeconds(2);
            methods.click(By.id("button-checkout-continue"));
            logger.info("Kredi kartı onaylandı.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//input[@type=\"checkbox\"]"));
            logger.info("Alışveriş sözleşmesi okundu.");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//input[@value=\"Siparişi Onaylayın\"]"));
            logger.info("Alışveriş tamamlandı.");
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//div[contains(text(),'Kredi kartınızın limiti yetersizdir.')]")));
            logger.info("Alışveriş Başarısız -- Yetersiz Bakiye (Doğrulandı).");
            methods.waitBySeconds(2);
            methods.click(By.cssSelector(".checkout-logo"));
            logger.info("Anasayfaya gidildi.");
            methods.waitBySeconds(2);
        }
        catch(Exception e){
            logger.error("Hata "+e);
        }

    }
}
