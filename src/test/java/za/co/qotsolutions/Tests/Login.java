package za.co.qotsolutions.Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import za.co.qotsolutions.Utilities.SwitchEnvironments;
import za.co.qotsolutions.pageObjects.BaseObjects;

import java.io.IOException;
import java.time.Duration;

public class Login extends BaseTest{


    @BeforeClass
    public void setup() throws IOException {
        dataProvider.setExcelFile("Login");
    }
    @Test(dataProvider = "myData")
    public void login(String Email, String Password, String Name, String Scenario) throws IOException, InterruptedException {
        SwitchEnvironments envSwitcher = new SwitchEnvironments();
        BaseObjects objects = envSwitcher.switchEnv(globalPlatform);
        objects.catalogue(webSetup.wdriver,"5");
        if(globalPlatform.equals("Mobile")){

            objects.AllownotificationsPopUp(mobSetup.driver).click();
            objects.account(mobSetup.driver).click();
            objects.openLogIn(mobSetup.driver).click();
            objects.loginEmail(mobSetup.driver).sendKeys(Email);
            String email = objects.loginEmail(mobSetup.driver).getText();
            extentReporter.report(email,Email,"Email field populated successfully", "Email field not populated successfully", mobSetup.driver, "Verify that the login email field is populated");

            objects.loginPassword(mobSetup.driver).sendKeys(Password);
            objects.seeLoginPassword(mobSetup.driver).click();
            String pwd = objects.loginPassword(mobSetup.driver).getText();
            extentReporter.report(email,Email,"Password field populated successfully", "Password field not populated successfully", mobSetup.driver, "Verify that the login password field is populated");

            objects.logInBtn(mobSetup.driver).click();

            WebElement logOut = objects.logout(mobSetup.driver);

            if(logOut != null){
                extentReporter.report("","","User Logged in successfully","User not Logged in successfully", mobSetup.driver, Scenario);
            }else{
                extentReporter.report("","fail test","User Logged in successfully","User not Logged in successfully", mobSetup.driver, Scenario);

            }


        }else {

            objects.account(webSetup.wdriver).click();
            objects.openLogIn(webSetup.wdriver).click();

            objects.loginEmail(webSetup.wdriver).sendKeys(Email);
            String email = objects.loginEmail(webSetup.wdriver).getAttribute("value");
            extentReporter.report(email,Email,"Email field populated successfully", "Email field not populated successfully", webSetup.wdriver, "Verify that the login email field is populated");

            objects.loginPassword(webSetup.wdriver).sendKeys(Password);
            //see password
            objects.seeLoginPassword(webSetup.wdriver).click();
            String pwd = objects.loginPassword(webSetup.wdriver).getAttribute("value");
            extentReporter.report(email,Email,"Password field populated successfully", "Password field not populated successfully", webSetup.wdriver, "Verify that the login password field is populated");

            objects.logInBtn(webSetup.wdriver).click();
            String loggedInName = objects.loginName(webSetup.wdriver).getText();
            System.out.println(loggedInName);
            extentReporter.report(loggedInName,Name,"User Logged in successfully", "User not logged in successfully", webSetup.wdriver, Scenario);

            WebElement cookies = objects.cookies(webSetup.wdriver);
            if(cookies != null){
                cookies.click();
            }
        }

    }

    @DataProvider(name = "myData")
    public Object[][] myData() throws IOException {
        return dataProvider.getAllData();
    }

}
