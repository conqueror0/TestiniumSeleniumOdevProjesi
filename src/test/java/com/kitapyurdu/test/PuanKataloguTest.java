package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.PuanKataloguPage;
import org.junit.Test;

public class PuanKataloguTest extends BaseTest {
    @Test
    public void puanKatalogu(){
        PuanKataloguPage puanKatalogu = new PuanKataloguPage();
        puanKatalogu.puanKatalogu();
    }

}
