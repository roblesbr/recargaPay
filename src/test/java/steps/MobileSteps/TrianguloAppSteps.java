package steps.MobileSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TrianguloApp;

public class TrianguloAppSteps extends TrianguloApp {

    @Given("estoy dentro de la aplicacion")
    public void dentro_app() {
    }

    @When("ingreso 1,5,5")
    public void ingreso_isosceles() {
    }

    @When("ingreso 1,3,5")
    public void ingreso_escaleno() {
    }

    @When("ingreso 5,5,5")
    public void ingreso_equilatero() {
    }

    @And("presiono calcular")
    public void presiono_calcular() {
    }

    @Then("recibo Isosceles")
    public void check_isosceles(){}

    @Then("recibo Escaleno")
    public void checkEscaleno(){}

    @Then("recibo Equilatero")
    public void checkEquilatero(){}
}
