package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaLacteos.*;

public class SeleccionarBebidasLacteas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BEBIDAS_LACTEAS),
                Click.on(ORDENAR_POR),
                Click.on(PRECIO),
                Click.on(DESCENDENTE),
                Click.on(ELEGIR_PRODUCTO)
        );
        try {
            Thread.sleep(2000);
        } catch (Exception e){

        }
    }

    public static SeleccionarBebidasLacteas seleccionarBebidasLacteas(){
        return new SeleccionarBebidasLacteas();
    }
}
