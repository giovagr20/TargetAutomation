package com.target.automation.steps;

import com.target.automation.pages.AgregarProductosPages;
import com.target.automation.utils.InternetConexion;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.Matchers.is;

public class AgregarProductoSteps {

    WebDriver navegador;
    AgregarProductosPages pages;
    private static final String URL = "https://www.target.com/";
    InternetConexion ic;

    public AgregarProductoSteps(WebDriver navegador) {
        this.navegador = navegador;
    }

    @Step
    public void abrirURL(){
        navegador.get(URL);
    }

    @Step
    public void verificarConexion() {
        ic = new InternetConexion();
        String URLEstado = ic.obtenerEstadoConexion(URL);
        if(URLEstado.equalsIgnoreCase("Offline")) {
            Serenity.ignoredStep("No existe conexion");
            navegador.quit();
        }
    }

    @Step
    public void ingresarProducto(String producto) {
        WebDriverWait espera = new WebDriverWait(navegador, 30);
        /*espera.until(
                ExpectedConditions.visibilityOfElementLocated(pages.getBTN_CATEGORIAS()));*/
        /*Assert.assertThat(navegador.findElement(pages.getBTN_CATEGORIAS()).getText(), is("Categories"));*/
        navegador.findElement(pages.getINP_BUSCADOR()).sendKeys(producto);
    }

}
