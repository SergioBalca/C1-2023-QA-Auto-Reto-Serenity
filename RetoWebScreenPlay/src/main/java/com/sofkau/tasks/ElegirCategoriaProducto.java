package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaCompra.CATEGORIA_PRODUCTO;

public class ElegirCategoriaProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORIA_PRODUCTO)
        );
    }

    public static ElegirCategoriaProducto elegirCategoriaProducto(){
        return new ElegirCategoriaProducto();
    }
}
