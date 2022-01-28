package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static com.kitapyurdu.driver.BaseTest.driver;

public class TumKitaplarPage {
    Methods methods;

    public TumKitaplarPage(){
        methods= new Methods();
    }

    public void tumKitaplarPage(){
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySeconds(2);
        methods.tikla(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        methods.waitBySeconds(2);

        Random rand = new Random();
        List<WebElement> allProducts = driver.findElements(By.cssSelector("li[class='mg-b-10']"));
        List<WebElement> allSepets = driver.findElements(By.cssSelector("a[class='add-to-cart']"));
        //  karta ekle yeri  "a[class='add-to-cart']"

        int randomProduct = rand.nextInt(allProducts.size());

        Actions builder = new Actions(driver);
        WebElement x = allProducts.get(randomProduct);
        WebElement sepettekiYeri = allSepets.get(randomProduct);
        methods.waitBySeconds(4);
        builder.moveToElement(x).build().perform();
        methods.waitBySeconds(4);
        sepettekiYeri.click();
        methods.waitBySeconds(4);

    }
}
