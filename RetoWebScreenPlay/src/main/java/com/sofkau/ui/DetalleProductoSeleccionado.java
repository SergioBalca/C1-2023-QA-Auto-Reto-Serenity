package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetalleProductoSeleccionado extends PageObject {
    public static final Target AGREGAR_AL_CARRITO = Target.the("agregar al carrito")
            .located(By.xpath("(//*[name()='svg'])[1]"));
}
