package com.testinium.test;

import com.testinium.driver.BaseSetup;
import com.testinium.pages.ScoreCatalog;
import org.junit.Test;

public class ScoreKatalogTest extends BaseSetup {

    @Test
    public void scoreCatalogTest(){

        ScoreCatalog scoreCatalog = new ScoreCatalog();
        scoreCatalog.scoreCatalog();

    }

}
