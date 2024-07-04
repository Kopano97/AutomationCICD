package za.co.qotsolutions.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import za.co.qotsolutions.Utilities.ExternalDataProvider;
import org.testng.annotations.*;
import za.co.qotsolutions.Utilities.ExtentReporter;
import za.co.qotsolutions.Utilities.SwitchEnvironments;
import za.co.qotsolutions.pageObjects.BaseObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public static webSetup webSetup;
    public static mobileSetup mobSetup;

    public static BrowserStackSetUp browserStackSetUp;

    ExternalDataProvider dataProvider = new ExternalDataProvider();

    public static ExtentReporter extentReporter;
    public static String globalPlatform;

    Properties prop = new Properties();


    public static BaseObjects objects;
    public static SwitchEnvironments envSwitcher = new SwitchEnvironments();
    @Parameters({"platform"})
    @BeforeSuite
    public void setup(String platform) throws IOException {

//        FileInputStream fis = new FileInputStream("src//test//java//resources//GlobalData.properties");
//        prop.load(fis);
//        globalPlatform = System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");

        globalPlatform = platform;
        mobSetup = new mobileSetup();
        webSetup = new webSetup();
        browserStackSetUp = new BrowserStackSetUp();
        if(globalPlatform.equals("Mobile")){
            System.out.println("setting up mobile");
            mobSetup.setUp();


        }else{
            webSetup.setUp(globalPlatform);

            System.out.println("setting up web");
        }

        extentReporter = new ExtentReporter();
        extentReporter.createReport(globalPlatform);
        objects = envSwitcher.switchEnv(globalPlatform);


    }



    @AfterSuite
    public void tearDown() {
        // Quit driver and stop Appium server
        extentReporter.endReport();
        webSetup.tearDown();
        mobileSetup.tearDown();


    }

}
