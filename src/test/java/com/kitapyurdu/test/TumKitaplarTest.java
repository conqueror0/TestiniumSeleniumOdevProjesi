package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.TumKitaplarPage;
import org.junit.Test;

public class TumKitaplarTest extends BaseTest {
    @Test
    public void tumKitaplarTest(){
        TumKitaplarPage tumKitaplarPage= new TumKitaplarPage();
        tumKitaplarPage.tumKitaplarPage();
    }
}
