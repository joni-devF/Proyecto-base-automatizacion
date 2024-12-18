package com.proyecto.co.utilities;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class OpenWeb {

    @Steps(shared = true)
    PageObject web;


    public void navegarA(String url){
        web.setDefaultBaseUrl(url);
        web.open();
    }

}
