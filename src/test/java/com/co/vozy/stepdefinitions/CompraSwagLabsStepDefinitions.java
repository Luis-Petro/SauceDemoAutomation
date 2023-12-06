package com.co.vozy.stepdefinitions;

import com.co.vozy.questions.ValidarCompraExitosa;
import com.co.vozy.tasks.AbrirPagina;
import com.co.vozy.tasks.ConfirmarOrden;
import com.co.vozy.tasks.IngresarCredenciales;
import com.co.vozy.tasks.SeleccionarProductoDeMenorPrecio;
import com.co.vozy.utils.CucumberUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraSwagLabsStepDefinitions {

    @Before
    public void  setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Que un user ingresa sus credenciales en la pagina$")
        public void thanUserEntersTheWebsite(List<List<String>>datosSesion) {
        Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(datosSesion);
        OnStage.theActorCalled("user").wasAbleTo(
            AbrirPagina.paginaDeInicio(),
            IngresarCredenciales.enFormularioDeLogin(mapTable)
            );
    }

    @When("^Seleccione el producto de menor precio$")
    public void seleccioneElProductoDeMenorPrecio() {
        theActorInTheSpotlight().attemptsTo(
           SeleccionarProductoDeMenorPrecio.enLaTienda()

        );
    }

    @And("^Confirma la orden$")
    public void confirmaLaOrden(List<List<String>>datosCliente) {
        Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(datosCliente);
        theActorInTheSpotlight().attemptsTo(
                ConfirmarOrden.enLaTienda(mapTable)
        );
    }
    @Then("^realizara la orden\\/pedido de manera exitosa$")
    public void realizaraLaOrdenPedidoDeManeraExitosa() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCompraExitosa
                .conMensajeDeConfirmacion("Thank you for your order")));
    }
}
