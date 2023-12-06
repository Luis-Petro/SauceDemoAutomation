package com.co.vozy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SwagLabsTienda {
        public static final Target FILTRODEPRODUCTOS   = Target.the("Filtro").located(By.className("product_sort_container"));
        public static final Target AGREGARALCARRITO = Target.the("Boton de aggregar al carrito").located(By.id("add-to-cart-sauce-labs-onesie"));
        public static final Target CARRITODECOMPRAS = Target.the("Filtro").located(By.id("shopping_cart_container"));

}
