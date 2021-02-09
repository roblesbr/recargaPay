package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.appium.Driver;

public class TrianguloApp extends Page{

    public AndroidDriver driver = Driver.appDriver();
    private static Logger log = LogManager.getLogger(BasePage.class.getName());
    private String getPageSource() { return driver.getPageSource(); }


    @AndroidFindBy(id = "com.eliasnogueira.trianguloapp:id/txtLado1")
    AndroidElement input1;
    @AndroidFindBy(id = "com.eliasnogueira.trianguloapp:id/txtLado2")
    AndroidElement input2;
    @AndroidFindBy(id = "com.eliasnogueira.trianguloapp:id/txtLado3")
    AndroidElement input3;
    @AndroidFindBy(id = "com.eliasnogueira.trianguloapp:id/btnCalcular")
    AndroidElement calcular;
    @AndroidFindBy(id = "com.eliasnogueira.trianguloapp:id/txtResultado")
    AndroidElement labelResultado;



    public void calcular(){
        calcular.click();
    }



    public void isosceles() throws InterruptedException {
        driver.findElement(By.id("com.eliasnogueira.trianguloapp:id/txtLado1")).sendKeys("1");
        driver.findElement(By.id("com.eliasnogueira.trianguloapp:id/txtLado2")).sendKeys("5");
        driver.findElement(By.id("com.eliasnogueira.trianguloapp:id/txtLado3")).sendKeys("5");
        Thread.sleep(1000);
        calcular.click();
    }

    public void escaleno() throws InterruptedException {
        input1.sendKeys("1");
        input2.sendKeys("3");
        input3.sendKeys("5");
        calcular();
        Thread.sleep(1000);
    }

    public void equilatero() throws InterruptedException {
        input1.sendKeys("5");
        input2.sendKeys("5");
        input3.sendKeys("5");
        calcular();
        Thread.sleep(1000);
    }



}
