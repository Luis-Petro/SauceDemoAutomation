package com.co.vozy.tasks;

import com.co.vozy.userinterface.SwagLabsPaginaDeInicio;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    SwagLabsPaginaDeInicio swaglabsHomePage;

    public static AbrirPagina paginaDeInicio() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(swaglabsHomePage));
    }
}
