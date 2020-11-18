package com.target.automation.stepdefinitions;

import com.target.automation.models.Especificaciones;
import com.target.automation.steps.AgregarProductoSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AgregarProductoStepDefinitions {

    WebDriver navegador;
    AgregarProductoSteps agregarProductos;

    @Before
    public void configuracion(){
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        agregarProductos = new AgregarProductoSteps(navegador);
    }

    @Given("^el Usuario abre pagina$")
    public void elUsuarioAbrePagina() {
        agregarProductos.abrirURL();
    }

    @Given("^se verifica conexion a internet$")
    public void seVerificaConexionAInternet() {
        agregarProductos.verificarConexion();
    }

    @Given("^el Usuario busca \"([^\"]*)\"$")
    public void elUsuarioBusca(String producto) {
        agregarProductos.ingresarProducto(producto);
    }

    @When("^el Usuario elige especificacion$")
    public void elUsuarioEligeEspecificacion(List<Especificaciones> especificaciones) {
        agregarProductos.escogerProductoEspecificacion(especificaciones.get(1).getColor(),
                especificaciones.get(1).getCantidad());
    }

    @Then("^el Uusario realiza la compra$")
    public void elUusarioRealizaLaCompra() {
        agregarProductos.hacerCompra();
    }

    @Then("^se verifica la compra$")
    public void seVerificaLaCompra() {
        agregarProductos.validarCompra();
    }

}
