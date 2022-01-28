package com.testinium.test;

import com.testinium.driver.BaseSetup;
import com.testinium.pages.FavoritesDelete;
import org.junit.Test;

public class FavoritesDeleteTest extends BaseSetup {

    @Test
    public void favoritesDeleteTest(){

        FavoritesDelete favoritesDelete = new FavoritesDelete();
        favoritesDelete.favoritesDelete();
    }
}