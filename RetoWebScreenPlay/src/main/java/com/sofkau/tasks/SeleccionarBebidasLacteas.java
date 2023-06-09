package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaLacteos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarBebidasLacteas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BEBIDAS_LACTEAS),
                Click.on(ORDENAR_POR),
                Click.on(PRECIO),
                Click.on(DESCENDENTE)
        );
    }

    public static SeleccionarBebidasLacteas seleccionarBebidasLacteas(){
        return new SeleccionarBebidasLacteas();
    }
}
