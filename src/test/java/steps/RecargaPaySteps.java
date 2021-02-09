package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RecargaPay;

public class RecargaPaySteps extends RecargaPay {

    @Given("ingrese al sitio Recarga Pay")
    public void ingrese_al_sitio_recarga_pay() throws InterruptedException {
        loginRecargaPay();
        //throw new io.cucumber.java.PendingException();
    }

    @And("selecciono recarga celular")
    public void selecciono_recarga_celular()throws Throwable{
        recargaCelular();
    }

    @When("ingreso mi numero de telefon y presiono el boton continuar")
    public void ingreso_numero()throws Throwable{
        ingresoNumero();
        clickContinuar();

    }

    @Then("mi numero figura en el popup")
    public void valido_numero()throws Throwable{
        checkNumerotelefono();
    }
}
