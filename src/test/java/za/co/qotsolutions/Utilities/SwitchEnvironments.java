package za.co.qotsolutions.Utilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.qotsolutions.Tests.mobileSetup;
import za.co.qotsolutions.Tests.webSetup;
import za.co.qotsolutions.pageObjects.BaseObjects;
import za.co.qotsolutions.pageObjects.mobilePageObjects;
import za.co.qotsolutions.pageObjects.webPageObjects;

import java.time.Duration;

public class SwitchEnvironments {

    public BaseObjects switchEnv(String platform){

        if(platform.equals("Mobile") || platform.equals("Browserstack"))
        {
            return new mobilePageObjects();

        }else{
            return new webPageObjects();
        }
    }



}
