package za.co.qotsolutions.Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import za.co.qotsolutions.Utilities.SwitchEnvironments;
import za.co.qotsolutions.pageObjects.BaseObjects;

import java.io.IOException;

public class DeleteCart extends BaseTest{


    @Test()
    public void deleteCart() throws IOException, InterruptedException {
        SwitchEnvironments envSwitcher = new SwitchEnvironments();
        BaseObjects objects = envSwitcher.switchEnv(globalPlatform);
        if(globalPlatform.equals("Mobile")){

            objects.openCart(mobSetup.driver).click();
            WebElement proceedToCheckout = objects.proceedToCheckout(mobSetup.driver);
            if(proceedToCheckout != null){
                extentReporter.report("","","Cart opened successfully","Cart not opened successfully", mobSetup.driver, "Verify cart can be opened by clicking the cart icon");
            }
            objects.testInteractWithCartItem(mobSetup.driver);
        }else {

        }
    }

}
