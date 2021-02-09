package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static utils.selenium.Driver.browser;

public class BasePage extends Page {
    public WebDriver driver = browser();

    public static <T extends BasePage> T instanceOf(Class<T> clazz) {
        return PageFactory.initElements(browser(), clazz);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void wait(Integer seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
}

