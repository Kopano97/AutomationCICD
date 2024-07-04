package za.co.qotsolutions.Tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import io.appium.java_client.service.local.AppiumServiceBuilder;
import za.co.qotsolutions.Utilities.ExtentReporter;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class mobileSetup {


    public static AndroidDriver driver;

    static AppiumDriverLocalService service;


    public void setUp() throws MalformedURLException {

//        service = new AppiumServiceBuilder()
//                .withAppiumJS(new File("C:\\Users\\Kopano\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//                .withIPAddress("127.0.0.1")
//                .usingPort(4723)
//                .build();
//        service.start();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Kopano Phone");
        options.setApp(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\OneDayOnly_4.0.9_APKPure.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

//        System.out.println("Opening App");
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("app", System.getProperty("user.dir") + "\\src\\test\\java\\resources\\takealot-3-27-0.apk");
//        cap.setCapability("platformName", "Android");
//        cap.setCapability("deviceName", "Kopano Phone2");
//        cap.setCapability("automationName", "UiAutomator2");
//
//        ddriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public static void tearDown() {
        // Quit driver and stop Appium server
        if (driver != null) {
            driver.quit();
        }
        if (service != null) {
            service.stop();
        }

    }
}
