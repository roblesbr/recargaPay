package utils.appium;

import io.appium.java_client.service.local.AppiumDriverLocalService;


public class AppiumServer {

    private static final AppiumDriverLocalService appiumServer = AppiumDriverLocalService.buildDefaultService();

    public static void start(){
        appiumServer.start();
    }

    public static void stop(){
        appiumServer.stop();
    }

}
