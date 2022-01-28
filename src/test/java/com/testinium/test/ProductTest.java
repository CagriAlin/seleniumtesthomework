package com.testinium.test;

import com.testinium.driver.BaseSetup;
import com.testinium.pages.ProductPage;
import org.junit.jupiter.api.Test;

public class ProductTest extends BaseSetup {

    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        productPage.productSelect();
    }

}
