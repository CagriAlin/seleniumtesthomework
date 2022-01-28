package com.testinium.test;

import com.testinium.driver.BaseSetup;
import com.testinium.pages.BasketPage;
import org.junit.Test;

public class BasketTest extends BaseSetup {
    
    @Test
    public void basketTest(){

        BasketPage basketPage = new BasketPage();
        basketPage.basket();
        
    }
    
}
