package utils.selenium;

import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.appium.AppiumServer;
import utils.drivers.AndroidAppDriver;
import utils.drivers.ChromeWebDriver;

import java.net.MalformedURLException;

public class DriverController {

    private static final Logger log = LogManager.getLogger(DriverController.class.getName());
    public static DriverController instance = new DriverController();
    WebDriver webDriver;
    AndroidDriver androidDriver;

    public void startChrome(String arg) {
        if (instance.webDriver != null) return;
        instance.webDriver = ChromeWebDriver.loadChromeDriver(arg);
    }

    public void startFirefox(String arg) {
        if (instance.webDriver != null) return;
        instance.webDriver = java.utils.drivers.FirefoxWebDriver.loadFirefoxDriver(arg);
    }

    public void stopWebDriver() {
        if (instance.webDriver == null) return;

        try {
            instance.webDriver.quit();
            instance.webDriver.close();
        } catch (Exception e) {
            log.error(e + "::WebDriver stop error");
        }

        instance.webDriver = null;
        log.debug("::WebDriver stopped");
    }

    public void startNexus5xOreo() throws MalformedURLException {
        if (instance.androidDriver != null) return;
        instance.androidDriver = AndroidAppDriver.loadNexus5xOreo();
    }

    public void stopAppDriver() {
        if (instance.androidDriver == null) return;
        try {
            instance.androidDriver.quit();
        } catch (Exception e) {
            log.error(e + ":: AndroidDriver stop error");
        }
        AppiumServer.stop();
        instance.androidDriver = null;
        log.debug(":: AndroidDriver stopped");
    }
}
