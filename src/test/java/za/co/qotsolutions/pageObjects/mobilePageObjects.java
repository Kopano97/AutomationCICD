package za.co.qotsolutions.pageObjects;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static io.appium.java_client.touch.offset.PointOption.point;

public class mobilePageObjects extends BaseObjects{



    public WebElement AllownotificationsPopUp(WebDriver driver) {
        try {
            Thread.sleep(10000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


       public WebElement account(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Account\"]/com.horcrux.svg.SvgView"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //Register & Log In
       public WebElement createAccount(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Create Account\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public WebElement openLogIn(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log in\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public WebElement firstName(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.EditText[@text=\"First Name\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public WebElement lastName(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Last Name\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public WebElement emailAddress(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Email address\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public WebElement password(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Password\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public WebElement seePassword(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public WebElement seeLoginPassword(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/com.horcrux.svg.SvgView"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public WebElement newsLetterCheckBox(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"SIGN UP FOR THE NEWSLETTER!\"]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public WebElement signUp(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"SIGN UP\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public WebElement logInBtn(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"LOG IN\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public WebElement signInHere(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Do you have an account? Log In here\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //Log In

    public WebElement loginEmail(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement loginPassword(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement openCart(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.Button[contains(@content-desc, 'Cart')]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement proceedToCheckout(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"PROCEED TO CHECKOUT\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement logout(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Logout\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void testInteractWithCartItem(AndroidDriver driver) throws InterruptedException {
        // Locate the cart view
        Thread.sleep(2000);

        WebElement cartView = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup"));

        // Locate all items in the cart
        List<WebElement> cartItems = cartView.findElements(By.xpath("//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        WebElement item1 = cartItems.get(0);

        // Perform actions on elements inside each cart item
        WebElement elementInsideItem = item1.findElement(By.xpath("android.view.ViewGroup/android.view.ViewGroup[3]"));
        elementInsideItem.click();

//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Remove\"));"));
//        WebElement remove = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Remove\"]"));
//        remove.click();
        WebElement removeElement = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".scrollIntoView(new UiSelector().text(\"Remove\"));"
        ));
        Thread.sleep(2000);
        removeElement.click();
    }


    public void catalogueItem(AndroidDriver driver){

        // Initialize an empty list to store the catalogue items
        List<WebElement> catalogueItems = new ArrayList<>();

        // Assuming the banner is already visible and you want to start scrolling from there
        boolean moreItems = true;
        int instance = 0;

        while (moreItems) {
            try {
                // Scroll to the next item in the catalogue
                WebElement item = driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                                ".scrollIntoView(new UiSelector().className(\"android.view.ViewGroup\").instance(" + instance + "));"
                ));

                // Add the found item to the list
                catalogueItems.add(item);

                // Increment the instance to find the next item
                instance++;
            } catch (NoSuchElementException e) {
                // No more items found, stop the loop
                moreItems = false;
            }
        }
    }


}
