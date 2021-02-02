package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static utils.settings.Settings.urlRecargaPay;

public class HomePage extends BasePage {

    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div/div/div[2]/a/span[1]")
    WebElement recargaDeCelular;

    public void loginRecargaPay() {
        driver.get(urlRecargaPay);
    }

    public void recargaCelular(){
        recargaDeCelular.click();
    }




    public void validarIngresoBanorte() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://banorte-qa.infosel.com/");
    }
}