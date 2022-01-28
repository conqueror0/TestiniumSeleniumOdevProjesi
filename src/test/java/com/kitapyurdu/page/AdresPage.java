package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class AdresPage {
    Methods methods;

    public AdresPage(){
        methods = new Methods();
    }

    public void adresPage(){
        methods.waitBySeconds(3);
        methods.tikla(By.cssSelector("#address-firstname-companyname"));
        methods.sendKeys(By.cssSelector("#address-firstname-companyname") , "fatih");


        methods.tikla(By.cssSelector("#address-lastname-title"));
        methods.sendKeys(By.cssSelector("#address-lastname-title") , "tekin");

        methods.tikla(By.cssSelector("#address-zone-id"));
        methods.tikla(By.xpath("//*[@id=\"address-zone-id\"]/option[28]"));

        methods.tikla(By.cssSelector("#address-county-id"));
        methods.tikla(By.xpath("//*[@id=\"address-county-id\"]/option[8]"));
        methods.waitBySeconds(1);

        methods.tikla(By.id("district"));
        methods.tikla(By.xpath("//*[@id=\"districtautocomplete-list\"]/div[4]"));

        methods.tikla(By.id("address-address-text"));
        methods.sendKeys(By.id("address-address-text") , "nusrettin mahallesi at sokak no 24 daire 21");
        methods.waitBySeconds(2);

        methods.tikla(By.id("address-postcode"));
        methods.sendKeys(By.id("address-postcode") , "81199" );
        methods.waitBySeconds(2);

        methods.tikla(By.id("address-telephone"));
        methods.sendKeys(By.id("address-telephone") , "2164881290");
        methods.waitBySeconds(2);

        methods.tikla(By.id("address-mobile-telephone"));
        methods.sendKeys(By.id("address-mobile-telephone") , "5359871211");
        methods.waitBySeconds(2);

        methods.tikla(By.id("address-tax-id"));
        methods.sendKeys(By.id("address-tax-id") , "41947994298");
        methods.waitBySeconds(3);

        methods.tikla(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);

        //kargo devam
        methods.tikla(By.id("button-checkout-continue"));

    }
}
