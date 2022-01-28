package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void login() {
        methods.tikla(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"),"testkitatyurdu@protonmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"),"testkitapyurdu");
        methods.waitBySeconds(1);
        methods.tikla(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(5);


        methods.waitBySeconds(1);
        methods.tikla(By.id("search-input"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.waitBySeconds(1);
        methods.tikla(By.xpath("//*[@id=\"search\"]/span"));
        methods.waitBySeconds(1);

        //login kontrolu
        Assert.assertTrue(methods.isElementVisible(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/a")));

        //kaydırma işlemi
        methods.scrollWithAction(By.xpath("//*[@id=\"faceted-search-group-6\"]/div[2]"));
        methods.waitBySeconds(1);

        //favori ekleme yeri
        methods.waitBySeconds(5);
        methods.findElement(By.cssSelector("div[id='product-341772'] i[class='fa fa-heart']")).click();
        methods.waitBySeconds(5);
        methods.findElement(By.cssSelector("div[id='product-399518'] i[class='fa fa-heart']")).click();
        methods.waitBySeconds(5);
        methods.findElement(By.cssSelector("div[id='product-394421'] i[class='fa fa-heart']")).click();
        methods.waitBySeconds(5);
        methods.findElement(By.cssSelector("div[id='product-133053'] i[class='fa fa-heart']")).click();
        methods.waitBySeconds(5);

        methods.tikla(By.xpath("//*[@id=\"header-bottom\"]/div/div[2]/a/img"));
    }



}
