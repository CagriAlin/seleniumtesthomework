package com.testinium.test;

import com.testinium.driver.BaseSetup;
import com.testinium.pages.*;
import org.junit.Test;

public class MainTest extends BaseSetup {

    @Test
    public void mainTest(){

        HomePage homePage = new HomePage();
        homePage.home();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.productSelect();
        FavoritesPage favoritesPage =new FavoritesPage();
        favoritesPage.favoriteControl();
        ScoreCatalog scoreCatalog = new ScoreCatalog();
        scoreCatalog.scoreCatalog();
        FavoritesDelete favoritesDelete = new FavoritesDelete();
        favoritesDelete.favoritesDelete();
        BasketPage basketPage = new BasketPage();
        basketPage.basket();
        LogOutPage logOutPage = new LogOutPage();
        logOutPage.logout();

    }

}
