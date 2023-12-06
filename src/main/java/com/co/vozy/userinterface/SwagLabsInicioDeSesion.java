package com.co.vozy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SwagLabsInicioDeSesion {
    public static final Target USER        = Target.the("Campo Usuario").located(By.id("user-name"));
    public static final Target PASSWORD    = Target.the("Campo Contraseña").located(By.id("password"));
    public static final Target LOGINBUTTON = Target.the("Botón de login").located(By.id("login-button"));
}
