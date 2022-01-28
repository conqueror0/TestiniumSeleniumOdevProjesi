package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.SatınAlPage;
import org.junit.Test;

public class SatınAlTest extends BaseTest {
    @Test
    public void satınAlTest(){
        SatınAlPage satınAlPage = new SatınAlPage();
        satınAlPage.satınAlPage();
    }
}
