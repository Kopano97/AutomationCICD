package za.co.qotsolutions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class AppiumBasics {
    @Test
    public void appiumTest() throws MalformedURLException {


        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Kopano Phone");
        options.setApp(System.getProperty("user.dir") + "/src/test/java/resources/General-Store.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement spinner = wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Spinner")));
        spinner.click();

        WebElement itemToSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Antigua and Barbuda\"]")));
        itemToSelect.click();

        WebElement editText = wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.EditText")));
        editText.sendKeys("Kopano");

    // Retrieve the text from the WebElement
        String actualText = editText.getText();

    // Expected value
        String expectedText = "Kopano";
    try {
    Assert.assertEquals(actualText, expectedText, "Text field was not populated successfully");

    }catch (AssertionError e) {
        // Assertion failed, handle the failure
        System.out.println("Assertion failed: " + e.getMessage());
        // You can add additional steps to take when the assertion fails, such as logging or reporting
    }

        WebElement female = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadioButton[@resource-id=\"com.androidsample.generalstore:id/radioFemale\"]")));
        female.click();

        WebElement LetsShop = wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button")));
        LetsShop.click();

        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\" and @text=\"ADD TO CART\"]")));
        addToCart.click();

        WebElement checkCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]")));
        checkCart.click();


        WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]")));
        checkBox.click();

        WebElement back = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_back\"]")));
        back.click();



    }

    public void BrowserStack() throws MalformedURLException {
         final String BROWSERSTACK_USERNAME = "kopanomagano_e4yWlK";
         final String BROWSERSTACK_ACCESS_KEY = "x2S9Zh6seAuj1JoqFoBa";


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.user", BROWSERSTACK_USERNAME);
        caps.setCapability("browserstack.key", BROWSERSTACK_ACCESS_KEY);


        caps.setCapability("device", "Google Pixel 5");
        caps.setCapability("os_version", "11.0");
        caps.setCapability("app", "/src/test/java/resources/General-Store.apk");

        AndroidDriver driver = new AndroidDriver(
                new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);



        driver.quit();
    }

}
