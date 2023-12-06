package com.co.vozy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SwagLabsConfirmacionDeOrden {
    public static final Target BOTONVERIFICAR        = Target.the("Boton checkout").located(By.id("checkout"));
    public static final Target FIRTNAME              = Target.the("campo firt name").located(By.id("first-name"));
    public static final Target LASTNAME              = Target.the("campo last name").located(By.id("last-name"));
    public static final Target POSTACODE             = Target.the("campo postal code").located(By.id("postal-code"));
    public static final Target BUTTONCONTINUE        = Target.the("boton continue").located(By.id("continue"));
    public static final Target BUTTONFINISH          = Target.the("boton finish").located(By.id("finish"));
    public static final Target MENSAJEDECONFIRMACION = Target.the("Texto de confirmacion de orden").located(By.id("checkout_complete_container"));
}
