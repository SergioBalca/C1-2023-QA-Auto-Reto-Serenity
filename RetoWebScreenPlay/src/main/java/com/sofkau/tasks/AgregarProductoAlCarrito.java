package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.DetalleProductoSeleccionado.AGREGAR_AL_CARRITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AgregarProductoAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AGREGAR_AL_CARRITO,isClickable()),
                Scroll.to(AGREGAR_AL_CARRITO),
                Click.on(AGREGAR_AL_CARRITO)
        );
    }

    public static AgregarProductoAlCarrito agregarProductoAlCarrito(){
        return new AgregarProductoAlCarrito();
    }
}
