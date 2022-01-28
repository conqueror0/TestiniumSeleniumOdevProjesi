package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;
import org.openqa.selenium.By;

import java.lang.reflect.Member;

public class SatınAlPage {
    Methods methods;

    public SatınAlPage(){
        methods = new Methods();
    }

    public void satınAlPage(){
        methods.tikla(By.cssSelector("div[class='right'] a[class='button red']"));
    }
}
