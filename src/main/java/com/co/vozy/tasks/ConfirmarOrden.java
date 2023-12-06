package com.co.vozy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.Map;

import static com.co.vozy.userinterface.SwagLabsConfirmacionDeOrden.*;

public class ConfirmarOrden implements Task {
    private Map<String, String> datosCliente;
    public ConfirmarOrden(Map<String, String> datosCliente) {
        this.datosCliente = datosCliente;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTONVERIFICAR),
                Enter.theValue(datosCliente.get("primer_nombre")).into(FIRTNAME),
                Enter.theValue(datosCliente.get("apellidos")).into(LASTNAME),
                Enter.theValue(datosCliente.get("codigo_postal")).into(POSTACODE),
                Click.on(BUTTONCONTINUE),
                Click.on(BUTTONFINISH)
        );
    }
    public static ConfirmarOrden enLaTienda(Map<String, String> datosCliente){
        return Tasks.instrumented(ConfirmarOrden.class, datosCliente);

    }
}
