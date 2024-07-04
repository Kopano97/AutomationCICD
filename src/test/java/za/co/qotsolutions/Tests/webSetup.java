package za.co.qotsolutions.Tests;

import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class webSetup {

    final String BROWSERSTACK_USERNAME = "kopanomagano_e4yWlK";
    final String BROWSERSTACK_ACCESS_KEY = "x2S9Zh6seAuj1JoqFoBa";
    final String URL = "https://"+BROWSERSTACK_USERNAME + ":" + BROWSERSTACK_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    WebDriver wdriver;

    public void setUpChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        wdriver = new ChromeDriver(chromeOptions);
        wdriver.manage().window().maximize();

    }
    public void setUpChromeBS() throws MalformedURLException {
        MutableCapabilities capabilities = new MutableCapabilities();
        HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
        capabilities.setCapability("browserName", "Chrome");
        bstackOptions.put("os", "Windows");
        bstackOptions.put("osVersion", "11");
        bstackOptions.put("browserVersion", "124.0");
        bstackOptions.put("consoleLogs", "info");
        bstackOptions.put("seleniumVersion", "4.18.1");
        bstackOptions.put("debug", "true");
        capabilities.setCapability("bstack:options", bstackOptions);

        wdriver = new RemoteWebDriver(new URL(URL), capabilities);
        wdriver.manage().window().maximize();
    }

    public void setUpFirefox() throws MalformedURLException {
        System.out.println("Opening firefox");
        WebDriverManager.firefoxdriver().setup();
        wdriver = new FirefoxDriver();
        wdriver.manage().window().maximize();

    }

    public void setUpEdge() throws MalformedURLException {
        WebDriverManager.edgedriver().setup();
        wdriver = new EdgeDriver();
        wdriver.manage().window().maximize();

    }

    public void setUp(String browser) throws MalformedURLException {
        switch (browser.toLowerCase()) {
            case "chrome":
                setUpChrome();
                break;
            case "firefox":

                setUpFirefox();
                break;
            case "edge":
                setUpEdge();
                break;
            case "chromebs":
                setUpChromeBS();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser name: " + browser);
        }
        wdriver.get("https://www.onedayonly.co.za/");
    }

    public void tearDown() {
        // Quit driver and stop Appium server
        if (wdriver != null) {
            wdriver.quit();
        }
    }
}
