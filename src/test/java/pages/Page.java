package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static utils.selenium.Driver.browser;

public class Page {
    public static <T extends BasePage> T instanceOf(Class<T> clazz) {
        return PageFactory.initElements(browser(), clazz);
    }

    public WebDriver driver = browser();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void wait(Integer seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
}