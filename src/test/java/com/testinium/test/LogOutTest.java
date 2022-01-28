package com.testinium.test;

import com.testinium.driver.BaseSetup;
import com.testinium.pages.LogOutPage;
import org.junit.Test;

public class LogOutTest extends BaseSetup {

    @Test
    public void logOutTest(){

        LogOutPage logOutPage = new LogOutPage();
        logOutPage.logout();


    }
}
