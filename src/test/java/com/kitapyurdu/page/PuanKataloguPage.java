package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class PuanKataloguPage {
    Methods methods;

    public PuanKataloguPage(){
        methods = new Methods();
    }

    public void puanKatalogu(){
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("//*[@id=\"mainNav\"]/div[1]/div/div[2]/a"));
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        methods.waitBySeconds(2);
    }
}
