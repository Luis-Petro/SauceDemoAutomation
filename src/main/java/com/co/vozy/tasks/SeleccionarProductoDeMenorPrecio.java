package com.co.vozy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static com.co.vozy.userinterface.SwagLabsTienda.*;
public class SeleccionarProductoDeMenorPrecio implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Price (low to high)").from(FILTRODEPRODUCTOS),
                Click.on(AGREGARALCARRITO),
                Click.on(CARRITODECOMPRAS)
        );
    }

    public static SeleccionarProductoDeMenorPrecio enLaTienda(){
        return Tasks.instrumented(SeleccionarProductoDeMenorPrecio.class);
    }
}
