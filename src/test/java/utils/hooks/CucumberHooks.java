package utils.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import utils.selenium.DriverController;


import java.net.MalformedURLException;


import static utils.settings.Settings.pathStarWars;
import static utils.settings.Settings.urlStarWars;

public class CucumberHooks {

    @Before("@Chrome")
    public void beforeChrome() {
        DriverController.instance.startChrome("--disable-extensions");
    }

    @Before("@Firefox")
    public void beforeFirefox() throws Exception {
        DriverController.instance.startFirefox("--disable-extensions");
    }

    @Before("@HeadlessChrome")
    public void beforeChromeHeadless() {
        DriverController.instance.startChrome("--headless");
    }

    @Before("@HeadlessFirefox")
    public void beforeHeadlessFirefox() throws Exception {
        DriverController.instance.startFirefox("--headless");
    }

    @After
    public void stopWebDriver() {
        DriverController.instance.stopWebDriver();
    }

    @Before("@Api")
    public void setBaseUri() {
        {
            RestAssured.baseURI = urlStarWars;
            RestAssured.basePath = pathStarWars;
        }
    }

    @Before("@Nexus5xOreo")
    public void beforeNexus5xOreo() throws MalformedURLException {
        DriverController.instance.startNexus5xOreo(); //start our Android driver and device when we run a test with "Nexus5xOreo" as the tag
    }

    @After
    public void stopAppDriver() {
        DriverController.instance.stopAppDriver(); //stop the Driver after the scenario or feature has run
    }

}


