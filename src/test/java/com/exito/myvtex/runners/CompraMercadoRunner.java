package com.exito.myvtex.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/exito/myvtex/features/CompraMercado.feature",
        glue = "com.exito.myvtex.stepdefinitions",
        tags = "@TestCase1",
        snippets = SnippetType.CAMELCASE
      
)

public class CompraMercadoRunner {
	

}
