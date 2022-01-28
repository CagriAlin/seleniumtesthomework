package com.testinium.test;

import com.testinium.driver.BaseSetup;
import com.testinium.pages.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseSetup {

    @Test
    public void loginTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();


    }

}
