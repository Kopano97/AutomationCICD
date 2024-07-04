package za.co.qotsolutions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.support.ui.WebDriverWait;
//import Utilities.ExternalDataProvider;
import org.testng.annotations.*;
//import za.co.qotsolutions.pageObjects.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
//import za.co.qotsolutions.Utilities.ExtentReporter;

public class AppiumBasics_serviceBuilder {


//    AppiumDriverLocalService service;
//    AndroidDriver driver;
//    mobilePageObjects objects = new mobilePageObjects();
//    static ExtentTest test;
//    static ExtentReports report;
//    ExtentReporter extentReporter;
//    ExternalDataProvider dataProvider = new ExternalDataProvider();
//
//    @BeforeClass
//    public void setUp() throws IOException {
//         service = new AppiumServiceBuilder()
//                .withAppiumJS(new File("C:\\Users\\Kopano\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//                .withIPAddress("127.0.0.1")
//                .usingPort(4723)
//                .build();
//        service.start();
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("Kopano Phone");
//        options.setApp(System.getProperty("user.dir") + "src/test/java/resources/takealot-3-29-0.apk");
//
//         driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
////         dataProvider.setExcelFile();
//
//        extentReporter = new ExtentReporter();
//        extentReporter.createReport();
//
//    }
//
//    @Test(dataProvider = "myData", priority = 1)
//    public void appiumTest(String country, String name, String gender) throws IOException {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//        //spinner for country
//        objects.findSpinner(wait).click();
//        objects.selectSpinnerItem(wait,country).click();
//
//        //enter name
////        objects.findTextField(wait).sendKeys(name);
//
//        // Retrieve the text from the WebElement
//        String populatedName = "";//objects.findTextField(wait).getText();
//        // Expected value
//        String expectedText = name;
//        extentReporter.report(populatedName, expectedText, "name is right", "name is wrong", driver);
//        //radio button for gender
//        objects.findRadioButton(wait,gender).click();
//
//        //lets shop or open cart
//        objects.findLetsShopBtn(wait).click();
//
//        //add to cart
//        objects.findAddToCartBtn(wait).click();
//
//        //open cart
//        objects.findOpenCartBtn(wait).click();
//
//        //check checkbox
//        objects.findCheckBox(wait).click();
//
//        //click back
//        objects.findBackBtn(wait).click();
//
//    }
//
//    @DataProvider(name = "myData")
//    public Object[][] myData() throws IOException {
//        return dataProvider.getAllData();
//    }
//
//    @AfterClass
//    public void tearDown() {
//        // Quit driver and stop Appium server
//        if (driver != null) {
//            driver.quit();
//        }
//        if (service != null) {
//            service.stop();
//        }
//        extentReporter.endReport();
//    }
}
