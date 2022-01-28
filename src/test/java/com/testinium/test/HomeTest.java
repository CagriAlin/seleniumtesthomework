package com.testinium.test;

import com.testinium.driver.BaseSetup;
import com.testinium.pages.HomePage;
import org.junit.Test;

public class HomeTest extends BaseSetup {

    @Test
    public void homeTest(){

        HomePage homePage = new HomePage();
        homePage.home();

    }

}
