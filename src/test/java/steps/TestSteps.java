package steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.*;
import jdk.nashorn.internal.runtime.Context;
import pages.HomePage;

public class TestSteps extends HomePage{

    @Given("Que me logee a RecargaPay")
    public void ingreso() throws Throwable {
        loginRecargaPay();
    }

    @When("Hago click en Recarga Celular")
    public void clickRecargaCelular()throws Throwable{
        recargaCelular();
    }

    @And("Ingreso un numero de celular")
    public void ingresoNumero()throws Throwable{}

    @And("Presiono el boton Continuar")
    public void presionoContinuar()throws Throwable{

    }

    @Then("Valido que el numero ingresado es correcto")
    public void validoNumero()throws Throwable{}
}
