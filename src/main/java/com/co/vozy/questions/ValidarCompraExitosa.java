package com.co.vozy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.co.vozy.userinterface.SwagLabsConfirmacionDeOrden.*;

public class ValidarCompraExitosa implements Question<Boolean> {
    private String textoEsperado;

    public ValidarCompraExitosa(String textoEsperado) {
        this.textoEsperado = textoEsperado;
    }

    public static ValidarCompraExitosa conMensajeDeConfirmacion(String textoDeConfirmacion) {return new ValidarCompraExitosa(textoDeConfirmacion);}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String textoEnPagina = Text.of(MENSAJEDECONFIRMACION).answeredBy(actor);
        resultado = textoEnPagina.contains(textoEsperado);
        return resultado;
    }
}
