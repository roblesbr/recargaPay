package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.settings.Settings.cellNumber;

public class RecargaOnlinePage extends BasePage{

    @FindBy (id = "allNumberInput")
    WebElement inputNumber;
    @FindBy (id = "showModalButton")
    WebElement continuar;
    @FindBy(id ="showNumber")
    WebElement labelNumber;

    public void ingresoDatos(){
        inputNumber.sendKeys(cellNumber);
        continuar.click();
    }

    public void checkNumero() {
        String numero = labelNumber.getText();
        Assert.assertEquals(numero, cellNumber);
    }



}
