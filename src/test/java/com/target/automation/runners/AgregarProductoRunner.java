package com.target.automation.runners;

/*FALTARON ALGUNOS PASOS POR TEMAS CONTRACTUALES Y PERSONALES*/


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/agregar_producto.feature"},
        glue = "com.target.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AgregarProductoRunner {
}
