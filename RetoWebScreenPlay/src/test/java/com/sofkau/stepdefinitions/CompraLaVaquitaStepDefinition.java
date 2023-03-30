package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.ElegirCategoriaProducto.elegirCategoriaProducto;
import static com.sofkau.tasks.SeleccionarBebidasLacteas.seleccionarBebidasLacteas;

public class CompraLaVaquitaStepDefinition extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(CompraLaVaquitaStepDefinition.class);
    Properties properties = new Properties();

    @Given("el usuario ingresa a la pagina web de la vaquita")
    public void elUsuarioIngresaALaPaginaWebDeLaVaquita() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()

            );

        } catch (Exception e){
            LOGGER.info("Fallo en la configuracion inicial");
            LOGGER.warn(e.getMessage());
            quitarDriver();
            Assertions.fail();
        }
    }

    @When("diligencia el formulario de inicio de sesion")
    public void diligenciaElFormularioDeInicioDeSesion() {
        try {
            properties.load(new FileInputStream(new File("src/test/resources/valores.properties")));
            String user = properties.get("USER").toString();
            String password = properties.get("PASSWORD").toString();

            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
                            .conElUsuario(user)
                            .yConLaContrasenna(password)
            );
        } catch (Exception e){
            LOGGER.info("Fallo en el inicio de session");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("el usuario selecciona un producto para comprar")
    public void elUsuarioSeleccionaUnProductoParaComprar() {
        theActorInTheSpotlight().attemptsTo(
            elegirCategoriaProducto(),
            seleccionarBebidasLacteas()

        );
    }

    @Then("deberia visualizar un mensaje para realizar el pago")
    public void deberiaVisualizarUnMensajeParaRealizarElPago() {

    }

}
