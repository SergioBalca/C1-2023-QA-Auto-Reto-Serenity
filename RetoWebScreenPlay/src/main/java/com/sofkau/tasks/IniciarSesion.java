package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaInicial.*;

public class IniciarSesion implements Task {

    private String usuario;
    private String password;

    public IniciarSesion conElUsuario(String usuario){
        this.usuario=usuario;
        return this;
    }

    public IniciarSesion yConLaContrasenna(String password){
        this.password=password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(

                    Click.on(BOTON_USUARIO),
                    Enter.theValue(usuario).into(CAMPO_USUARIO),
                    Enter.theValue(password).into(CAMPO_PASSWORD),
                    Click.on(BOTON_INICIO_SESION)
            );

    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
