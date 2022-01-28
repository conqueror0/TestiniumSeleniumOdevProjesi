package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class LogOutPage {
    Methods methods;

    public LogOutPage(){
        methods = new Methods();
    }

    public void logOutPage(){
        methods.waitBySeconds(3);
        methods.tikla(By.id("credit-card-owner"));
        methods.sendKeys(By.id("#credit-card-owner") , "Muhammet Fatih Tekin");

        methods.tikla(By.id("credit_card_number_1"));
        methods.sendKeys(By.id("credit_card_number_1") , "5440783266104023");
        methods.waitBySeconds(2);

        methods.tikla(By.id("credit-card-expire-date-month"));
        methods.tikla(By.xpath("//*[@id=\"credit-card-expire-date-month\"]/option[11]"));

        methods.tikla(By.id("credit-card-expire-date-year"));
        methods.tikla(By.xpath("//*[@id=\"credit-card-expire-date-year\"]/option[7]"));
        methods.waitBySeconds(2);

        methods.tikla(By.id("credit-card-security-code"));
        methods.sendKeys(By.id("credit-card-security-code") , "466");
        methods.waitBySeconds(2);

        methods.tikla(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);

        methods.tikla(By.cssSelector("input[value='1'][name='agree']"));
        methods.tikla(By.cssSelector("input[value='Siparişi Onaylayın']"));
        methods.waitBySeconds(2);

        methods.tikla(By.cssSelector("img[title='kitapyurdu.com']"));
        methods.waitBySeconds(2);
        methods.tikla(By.cssSelector("div[class='menu top login'] a[class='common-sprite']"));
        methods.tikla(By.cssSelector("a[href='https://www.kitapyurdu.com/index.php?route=account/logout']"));
        methods.waitBySeconds(3);

    }

}
