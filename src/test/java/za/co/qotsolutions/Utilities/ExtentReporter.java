package za.co.qotsolutions.Utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class ExtentReporter {

    static ExtentReports report;
    static ExtentTest test;


    public void createReport(String platform){

        try {
            report = new ExtentReports("C:\\Workspaces\\WebAndAppAuto\\src\\test\\java\\resources\\"+platform+"oneDayOnly.html");

            System.out.println("created file");


        }catch (Exception e){
            System.out.println("Cant create file");
        }
    }

    public void report(String actualValue, String expectedValue, String passMessage, String failMessage, WebDriver driver, String scenario) throws IOException {
        test = report.startTest(scenario);
        String imageName = scenario + " image.png";
        String screenshotDirectory = "C:\\Workspaces\\WebAndAppAuto\\src\\test\\java\\resources\\screenshots\\"; // Directory to store screenshots

        try {
            Assert.assertEquals(actualValue, expectedValue);
            test.log(LogStatus.PASS, passMessage);
            captureScreenshot(driver, screenshotDirectory + imageName);
            test.log(LogStatus.PASS, "Passed Screenshot below: " + test.addScreenCapture(screenshotDirectory + imageName));
        } catch (AssertionError e) {
            test.log(LogStatus.FAIL, failMessage);
            captureScreenshot(driver, screenshotDirectory + imageName);
            test.log(LogStatus.FAIL, "Failed Screenshot below: " + test.addScreenCapture(screenshotDirectory + imageName));
        } catch (IOException e) {
            test.log(LogStatus.ERROR, "Error taking screenshot: " + e.getMessage());
        }
    }

    private void captureScreenshot(WebDriver driver, String screenshotPath) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File(screenshotPath));
    }
//    public void report(String actualValue, String expectedValue, String passMessage, String failMessage, WebDriver driver, String scenario) throws IOException {
//
//        test = report.startTest(scenario);
//        String imageName = scenario+" image.png";
//        try {
//            Assert.assertEquals(actualValue, expectedValue);
//            test.log(LogStatus.PASS, passMessage);
//            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            String screenshotPath = "C:\\Workspaces\\AppiumDemo\\src\\test\\java\\resources\\screenshots\\"+imageName; // Provide a path to store the screenshot
//            FileHandler.copy(src, new File(screenshotPath));
//            test.log(LogStatus.PASS, "Passed Screenshot below: " + test.addScreenCapture(screenshotPath));
//
//        } catch (AssertionError | IOException e) {
//            test.log(LogStatus.FAIL, failMessage);
//            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            String screenshotPath = "C:\\Workspaces\\AppiumDemo\\src\\test\\java\\resources\\screenshots\\report.png"; // Provide a path to store the screenshot
//            FileHandler.copy(src, new File(screenshotPath));
//            test.log(LogStatus.FAIL, "Failed Screenshot below: " + test.addScreenCapture(screenshotPath));
//        }
//
//
//    }

    public void endReport(){
        report.endTest(test);
        report.flush();
    }
}


