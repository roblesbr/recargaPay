package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.selenium.Driver.browser;
import static utils.settings.Settings.cellNumber;
import static utils.settings.Settings.urlRecargaPay;

public class RecargaPay extends BasePage {

    public static <T extends BasePage> T instanceOf(Class<T> clazz) {
        return PageFactory.initElements(browser(), clazz);
    }

    @FindBy (id = "allNumberInput")
    WebElement inputNumber;
    @FindBy (id = "showModalButton")
    WebElement continuar;
    @FindBy(id ="showNumber")
    WebElement labelNumber;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div/div/div[2]/a/span[1]")
    WebElement recargaCelular;


    public void loginRecargaPay() throws InterruptedException {
        driver.get(urlRecargaPay);
    }

    public void recargaCelular() throws InterruptedException {
        driver.findElement(By.xpath("//div[2]/a/span")).click();
    }

    public void ingresoNumero() throws Throwable {
        driver.findElement(By.id("allNumberInput")).sendKeys(cellNumber);
        Thread.sleep(1000);
    }

    public void clickContinuar() throws InterruptedException {
        driver.findElement(By.id("showModalButton")).click();
        Thread.sleep(1000);
    }

    public void checkNumero() throws InterruptedException {
        Thread.sleep(1000);
        String labelNumero = driver.findElement(By.id("showNumber")).getText();
        System.out.println(labelNumero);
        String prefijo = labelNumero.substring(1, labelNumero.indexOf(")"));
        String numero = labelNumero.substring(labelNumero.indexOf("(") + 5);
        String numeroCelularEditado = prefijo+numero;
        System.out.println(numeroCelularEditado);
        Assert.assertEquals(numeroCelularEditado,cellNumber);

    }

    public boolean checkNumerotelefono() throws InterruptedException {
        try {
            Thread.sleep(1000);
            String labelNumero = driver.findElement(By.id("showNumber")).getText();
            System.out.println(labelNumero);
            String prefijo = labelNumero.substring(1, labelNumero.indexOf(")"));
            String numero = labelNumero.substring(labelNumero.indexOf("(") + 5);
            String numeroCelularEditado = prefijo+numero;
            System.out.println(numeroCelularEditado);
            Assert.assertEquals(numeroCelularEditado,cellNumber);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}