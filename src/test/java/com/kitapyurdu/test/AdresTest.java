package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.AdresPage;
import org.junit.Test;

public class AdresTest extends BaseTest {
    @Test
    public void adresTest(){
        AdresPage adresPage = new AdresPage();
        adresPage.adresPage();
    }
}
