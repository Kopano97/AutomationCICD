package za.co.qotsolutions.Tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackSetUp {

    public AndroidDriver driver;
    public void setUp() throws MalformedURLException {
        final String BROWSERSTACK_USERNAME = "kopanomagano_e4yWlK";
        final String BROWSERSTACK_ACCESS_KEY = "x2S9Zh6seAuj1JoqFoBa";
        final String URL = "https://"+BROWSERSTACK_USERNAME + ":" + BROWSERSTACK_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.user", BROWSERSTACK_USERNAME);
        caps.setCapability("browserstack.key", BROWSERSTACK_ACCESS_KEY);
        caps.setCapability("interactiveDebugging", true);


        caps.setCapability("deviceName", "Google Pixel 5");
        caps.setCapability("os_version", "11.0");
        caps.setCapability("app", "bs://fbd734e0ad84ae69aaf955d00c4d018ff75bf014");

         driver = new AndroidDriver(
                new URL(URL), caps);

    }

    public void teerDown() {
        driver.quit();

    }
}
