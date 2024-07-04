package za.co.qotsolutions.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import za.co.qotsolutions.Utilities.SwitchEnvironments;
import za.co.qotsolutions.pageObjects.BaseObjects;

import java.io.IOException;

public class purchase extends BaseTest{


    @BeforeClass
    public void setup() throws IOException {
        dataProvider.setExcelFile("Search");
    }


    @Test(dataProvider = "myData")
    public void shopForItems(String Item, String Scenario) throws IOException, InterruptedException {
        SwitchEnvironments envSwitcher = new SwitchEnvironments();
        BaseObjects objects = envSwitcher.switchEnv(globalPlatform);


        if(globalPlatform.equals("Mobile")){



        } else {
//            objects.closePopUp(webSetup.wdriver).click();
//            objects.everyDayEssentials(webSetup.wdriver).click();

            WebElement catalogueItem = objects.catalogue(webSetup.wdriver,Item);

            if(catalogueItem.isEnabled()) {
                catalogueItem.click();
                extentReporter.report("","","Will Clicking ","Failed to click on catalogue item", webSetup.wdriver, "Verify item is clickable");

            }else{
                extentReporter.report("","","Wont Clicking on catalogue item successful","Failed to click on catalogue item", webSetup.wdriver, "Verify item is clickable");
            }
            String currentURL = webSetup.wdriver.getCurrentUrl();

            String expectedSubstring = "https://www.onedayonly.co.za/products/";

            if(currentURL.contains(expectedSubstring)){
                extentReporter.report("","","Clicking on catalogue item successful","Failed to click on catalogue item", webSetup.wdriver, "Verify that when you click on a catalogue the system moves to a add to cart page");
            }

            objects.options(webSetup.wdriver);

            WebElement addToCart = objects.addToCart(webSetup.wdriver);
            if(addToCart != null) {
            addToCart.click();
                extentReporter.report("","","Clicking on add to cart successful","Failed to click on add to cart ", webSetup.wdriver, Scenario);

            }else {
                extentReporter.report("","not null","Clicking on add to cart successful","Failed to click on add to cart ", webSetup.wdriver, Scenario);

            }
            WebElement popup = objects.popup2(webSetup.wdriver);

            if(popup != null){
                popup.click();
            }
            objects.todaysDeals(webSetup.wdriver).click();

        }

    }

    @DataProvider(name = "myData")
    public Object[][] myData() throws IOException {
        return dataProvider.getAllData();
    }

}


