package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabsSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class AirbnbSearchStepsDefs {

    @Steps
    SwagLabsSteps airbnbSearchSteps;

    @Given("que me encuentro en la página de login")
    public void que_me_encuentro_en_el_login() {

        //airbnbSearchSteps.clickClose();
       // Assert.assertEquals("exito","exito");
    }
    @When("inicio sesión con las credenciales usuario: {string} y contraseña: {string} y el mensaje exito es {string}")
    public void iniciar_sesion(String usuario, String password, String exitoso) {
        airbnbSearchSteps.login(usuario, password);
        //Assert.assertEquals(airbnbSearchSteps.getResultDespuesLogin(),exitoso);
    }
    @Then("valido que debería aparecer el título de {string}")
    public void muestra_el_texto(String text) {
        Assert.assertEquals(airbnbSearchSteps.getResultDespuesLogin(),text);
    }
}
