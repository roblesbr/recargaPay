package steps.APISteps;

import apis.StarWarsApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StarWarsApiSteps extends StarWarsApi {

    @Given("I'm a Star Wars fan")
    public void mensajeInicial() {
        System.out.println("Soy fanatico de Star Wars");
    }

    @When("ask what was the last movie of my favorite characters")
    public void pregunta() {
        System.out.println("Quiero saber cuales fueron las ultimas peliculas de Bobba Fett, Darth Vader y Obi Wan");
    }

    @Then("receive the names of the characters and the last movie filmed")
    public void respuesta() {
        ultimaPelicula();
    }
}
