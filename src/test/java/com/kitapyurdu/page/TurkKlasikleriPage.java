package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class TurkKlasikleriPage {
    Methods methods;

    public TurkKlasikleriPage(){
        methods = new Methods();
    }

    public void turkKlasikleri(){
        methods.waitBySeconds(3);
        methods.tikla(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select"));
        methods.waitBySeconds(3);
        methods.tikla(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select/option[6]"));
        methods.waitBySeconds(2);

    }
}
