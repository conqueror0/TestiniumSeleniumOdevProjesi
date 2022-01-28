package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.FavorilerimPage;
import org.junit.Test;

public class FavorilerimTest extends BaseTest {
    @Test
    public void favorilerimTest(){
        FavorilerimPage favorilerimPage = new FavorilerimPage();
        favorilerimPage.favorilerimPage();
    }
}
