package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.SepetimPage;
import org.junit.Test;

public class SepetimTest extends BaseTest {
    @Test
    public void sepetimTest(){
        SepetimPage sepetimPage = new SepetimPage();
        sepetimPage.sepetimPage();
    }
}
