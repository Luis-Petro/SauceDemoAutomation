package com.co.vozy.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compra_swaglabs.feature",
        plugin = {"pretty"},
        tags = "@CompraExitosa",
        glue = "com.co.vozy.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class CompraSwagLabsRunner {
}
