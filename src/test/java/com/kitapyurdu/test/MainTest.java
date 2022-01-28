package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.*;
import org.junit.Test;

public class MainTest extends BaseTest {
    @Test
    public void mainTest(){

        HomePage homePage = new HomePage();
        homePage.home();

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        PuanKataloguPage puanKatalogu = new PuanKataloguPage();
        puanKatalogu.puanKatalogu();

        TurkKlasikleriPage turkKlasikleriPage = new TurkKlasikleriPage();
        turkKlasikleriPage.turkKlasikleri();

        TumKitaplarPage tumKitaplarPage = new TumKitaplarPage();
        tumKitaplarPage.tumKitaplarPage();

        FavorilerimPage favorilerimPage = new FavorilerimPage();
        favorilerimPage.favorilerimPage();

        SepetimPage sepetimPage = new SepetimPage();
        sepetimPage.sepetimPage();

        SatınAlPage satınAlPage = new SatınAlPage();
        satınAlPage.satınAlPage();

        AdresPage adresPage = new AdresPage();
        adresPage.adresPage();

        LogOutPage logoutpage = new LogOutPage();
        logoutpage.logOutPage();
    }
}
