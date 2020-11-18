package com.target.automation.pages;

import org.openqa.selenium.By;

public class AgregarProductosPages {

    By BTN_CATEGORIAS = By.xpath("//*[@id=\"categories\"]/span[1]");
    By INP_BUSCADOR = By.id("search");
    By BTN_PRODUCTO_COMPRA = By.xpath("//*[@id=\"mainContainer\"]/div[4]/div[2]/div/div[2]/div[3]/div/ul/li[2]/div/div[1]/h3/a");
    By OPT_COLOR = By.xpath("//*[@id=\"viewport\"]/div[5]/div/div[2]/div[2]/div[4]/div[2]/div[1]/button");
    By BTN_COMPRAR = By.xpath("//*[@id=\"viewport\"]/div[5]/div/div[2]/div[3]/div[1]/div/div[2]/div[1]/div[2]/button");


    public By getBTN_CATEGORIAS() {
        return BTN_CATEGORIAS;
    }

    public By getINP_BUSCADOR() {
        return INP_BUSCADOR;
    }

    public By getBTN_PRODUCTO_COMPRA() {
        return BTN_PRODUCTO_COMPRA;
    }

    public By getOPT_COLOR() {
        return OPT_COLOR;
    }

    public By getBTN_COMPRAR() {
        return BTN_COMPRAR;
    }
}
