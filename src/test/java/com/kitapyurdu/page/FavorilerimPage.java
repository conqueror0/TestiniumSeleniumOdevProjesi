package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.test.FavorilerimTest;
import org.openqa.selenium.By;

public class FavorilerimPage {
    Methods methods;

    public FavorilerimPage(){
        methods = new Methods();
    }

    public void favorilerimPage(){
        methods.waitBySeconds(2);
        methods.tikla(By.cssSelector("div[class='menu top my-list'] a[class='common-sprite']"));
        methods.waitBySeconds(2);
        methods.tikla(By.cssSelector("a[href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[4]/a[3]/i[1]"));
        methods.waitBySeconds(3);

    }
}
