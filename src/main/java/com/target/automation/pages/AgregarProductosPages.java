package com.target.automation.pages;

import org.openqa.selenium.By;

public class AgregarProductosPages {

    By BTN_CATEGORIAS = By.xpath("//*[@id=\"categories\"]/span[1]");
    By INP_BUSCADOR = By.id("search");

    public By getBTN_CATEGORIAS() {
        return BTN_CATEGORIAS;
    }

    public By getINP_BUSCADOR() {
        return INP_BUSCADOR;
    }
}
