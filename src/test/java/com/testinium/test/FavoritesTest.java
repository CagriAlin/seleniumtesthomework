package com.testinium.test;

import com.testinium.driver.BaseSetup;
import com.testinium.pages.FavoritesPage;
import org.junit.jupiter.api.Test;

public class FavoritesTest extends BaseSetup {

    @Test
    public void favoritesPage(){

        FavoritesPage favoritesPage =new FavoritesPage();
        favoritesPage.favoriteControl();
    }

}
