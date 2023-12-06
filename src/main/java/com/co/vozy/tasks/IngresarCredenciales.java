package com.co.vozy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import static com.co.vozy.userinterface.SwagLabsInicioDeSesion.*;
import java.util.Map;

public class IngresarCredenciales implements Task {
    private Map<String, String> loginData;

    public IngresarCredenciales(Map<String, String> loginData) {
        this.loginData = loginData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginData.get("user")).into(USER),
                Enter.theValue(loginData.get("password")).into(PASSWORD),
                Click.on(LOGINBUTTON)
        );
    }

    public static IngresarCredenciales enFormularioDeLogin(Map<String, String> loginData){
        return Tasks.instrumented(IngresarCredenciales.class, loginData);
    }
}
