package com.target.automation.steps;



import com.target.automation.pages.AgregarProductosPages;
import com.target.automation.utils.InternetConexion;
import com.target.automation.utils.ficheros.CSVLector;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static org.hamcrest.Matchers.is;

public class AgregarProductoSteps {

    WebDriver navegador;
    AgregarProductosPages pages;
    private static final String URL = "https://www.target.com/";
    InternetConexion ic;
    CSVLector lector = new CSVLector();

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
        espera.until(
                ExpectedConditions.visibilityOfElementLocated(pages.getBTN_CATEGORIAS()));
        Assert.assertThat(navegador.findElement(pages.getBTN_CATEGORIAS()).getText(), is("Categories"));
        navegador.findElement(pages.getINP_BUSCADOR()).sendKeys(producto);
    }

    @Step
    public void escogerProductoEspecificacion(String color, String cantidad) {
        if(color.equalsIgnoreCase("Negro") && cantidad.equalsIgnoreCase("1")) {
            navegador.findElement(pages.getBTN_PRODUCTO_COMPRA()).click();
            navegador.findElement(pages.getOPT_COLOR()).click();
        }
    }

    @Step
    public void hacerCompra() {
        navegador.findElement(pages.getBTN_COMPRAR()).click();
        ic = new InternetConexion();
        String URLEstado = ic.obtenerEstadoConexion(URL);
        if(URLEstado.equalsIgnoreCase("Offline")) {
            Serenity.ignoredStep("No existe conexion");
            navegador.quit(); }
    }

    @Step
    public void validarCompra() {
        try {
            String[] data = lector.escribirProductos("ficheros/Productos.csv");
            for (int i=0; i<data.length; i++ ){
                System.out.println(data[i]);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
