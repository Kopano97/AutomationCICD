package za.co.qotsolutions.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import za.co.qotsolutions.Utilities.SwitchEnvironments;
import za.co.qotsolutions.pageObjects.BaseObjects;

import java.io.IOException;

public class Register extends BaseTest{

    @BeforeClass
    public void setup() throws IOException {
        dataProvider.setExcelFile("Register");
    }

    @Test(dataProvider = "myData")
    public void register(String firstName, String lastName, String emailAddress, String password,String Scenario) throws IOException, InterruptedException {
        SwitchEnvironments envSwitcher = new SwitchEnvironments();
        BaseObjects objects = envSwitcher.switchEnv(globalPlatform);
//        objects.catalogue(webSetup.wdriver,"5");
        if(globalPlatform.equals("Mobile")){

            objects.AllownotificationsPopUp(mobSetup.driver).click();
            objects.firstName(mobSetup.driver).sendKeys(firstName);
            objects.lastName(mobSetup.driver).sendKeys(lastName);
            objects.emailAddress(mobSetup.driver).sendKeys(emailAddress);
            objects.password(mobSetup.driver).sendKeys(password);
            objects.seePassword(mobSetup.driver).click();
            objects.newsLetterCheckBox(mobSetup.driver).click();
            objects.closeRegForm(mobSetup.driver).click();


        }else {

            objects.closePopUp(webSetup.wdriver).click();

            objects.account(webSetup.wdriver).click();

            objects.createAccount(webSetup.wdriver).click();
            objects.firstName(webSetup.wdriver).sendKeys(firstName);
            String fname = objects.firstName(webSetup.wdriver).getAttribute("value");
            extentReporter.report(fname, firstName, "First name field populated successfully", "First name field failed to be populated", webSetup.wdriver,"Verify first name field is populated");

            objects.lastName(webSetup.wdriver).sendKeys(lastName);
            String lname = objects.lastName(webSetup.wdriver).getAttribute("value");
            extentReporter.report(lname, lastName, "Last name field populated successfully", "Last name field failed to be populated", webSetup.wdriver,"Verify last name field is populated");

            objects.emailAddress(webSetup.wdriver).sendKeys(emailAddress);
            String email = objects.emailAddress(webSetup.wdriver).getAttribute("value");
            extentReporter.report(email, emailAddress, "Email Address field populated successfully", "Email Address field failed to be populated", webSetup.wdriver,"Verify Email Address field is populated");

            objects.password(webSetup.wdriver).sendKeys(password);
            objects.seePassword(webSetup.wdriver).click();
            String pwd = objects.password(webSetup.wdriver).getAttribute("value");
            extentReporter.report(pwd, password, "Password field populated successfully", "Password field failed to be populated", webSetup.wdriver,"Verify Password field is populated");

            objects.newsLetterCheckBox(webSetup.wdriver).click();

            if (!objects.newsLetterCheckBox(webSetup.wdriver).isSelected()) {

                extentReporter.report("", "", "Check Box clicked successfully", "Check Box not clicked successfully", webSetup.wdriver,"Verify newsletter checkbox is not checked");

            }
            objects.closeRegForm(webSetup.wdriver).click();


        }
    }

    @DataProvider(name = "myData")
    public Object[][] myData() throws IOException {
        return dataProvider.getAllData();
    }
}
