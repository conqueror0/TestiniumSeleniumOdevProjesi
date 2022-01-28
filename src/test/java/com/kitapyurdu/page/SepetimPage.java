package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class SepetimPage {
    Methods methods;

    public SepetimPage(){
        methods = new Methods();
    }

    public void sepetimPage(){
        methods.waitBySeconds(2);
        methods.tikla(By.id("cart"));
        methods.waitBySeconds(2);
        methods.tikla(By.id("js-cart"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/form[1]/input[1]")).sendKeys("0");
        methods.waitBySeconds(2);
        methods.tikla(By.cssSelector("i[title='Güncelle']"));
        methods.waitBySeconds(2);


    }
}
