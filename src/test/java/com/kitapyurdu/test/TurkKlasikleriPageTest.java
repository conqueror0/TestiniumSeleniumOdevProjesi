package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.TurkKlasikleriPage;
import org.junit.Test;

public class TurkKlasikleriPageTest extends BaseTest {
    @Test
    public void turkKlasikleri(){
        TurkKlasikleriPage turkKlasikleri = new TurkKlasikleriPage();
        turkKlasikleri.turkKlasikleri();
    }
}
