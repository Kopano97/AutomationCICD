package za.co.qotsolutions.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class webPageObjects extends BaseObjects{


    public WebElement closePopUp(WebDriver driver) {
        try {
            Thread.sleep(3000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"sailthru-overlay-container\"]/div[1]/button"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement account(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/header/div[2]/div[2]/div[3]/div[1]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public WebElement createAccount(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//div[@id='tippy-1']/div[@role='tooltip']//div[@role='link']/div/button[2]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public WebElement openLogIn(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//div[@id='tippy-1']/div[@role='tooltip']//div[@role='link']/div/button[1]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement firstName(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"firstName-:r3:\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement lastName(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"lastName-:r4:\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement emailAddress(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"email-:r5:\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement password(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"password-:r7:\"]"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement seePassword(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"create-account-form\"]/div/div[5]/div/div/button"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement newsLetterCheckBox(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"create-account-form\"]/div/div[7]/label/div"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement signUp(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//form[@id='create-account-form']//button[@type='submit']"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public WebElement signInHere(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("/html//div[@id='__next']/div[@class='css-mt1jh3']/div[4]//div[@class='css-13wstiq']/a[@class='css-1u4ki3w']"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement closeRegForm(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div/div/div[1]/div[2]/div/button"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement loginEmail(WebDriver driver) {
        try {
            Thread.sleep(3000);
            WebElement notNowBtn = driver.findElement(By.cssSelector("#email-\\:ra\\:"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement loginPassword(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.cssSelector("#password-\\:rb\\:"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public WebElement logInBtn(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("/html//div[@id='__next']/div[@class='css-mt1jh3']/div[4]//form//button[@type='submit']"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement everyDayEssentials(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("/html//div[@id='__next']/div[@class='css-mt1jh3']//div[@class='css-1ymiw64']//a[@href='/shops/everyday-essentials']"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public WebElement catalogueItem;
    public WebElement catalogue(WebDriver driver,String number) throws InterruptedException {
        Thread.sleep(2000);

        WebElement parentDiv = driver.findElement(By.cssSelector("#__next > div.css-mt1jh3 > div.css-1c3h18e > div > div > div"));
                                                                  //#__next > div.css-mt1jh3 > div.css-1c3h18e > div > div > div
        List<WebElement> addToCartBtns = parentDiv.findElements(By.className("css-148k5t5"));
        System.out.println("size =");
        System.out.println(addToCartBtns.size());
        int itemNumber = Integer.parseInt(number);
        catalogueItem = addToCartBtns.get(itemNumber);
        return catalogueItem;
    }

    public WebElement options(WebDriver driver) throws InterruptedException {


        // Locate the select element by ID
        List<WebElement> selectElements = driver.findElements(By.tagName("select"));

        int numDropDowns = selectElements.size();

        System.out.println(numDropDowns);
        Select dropdown = new Select(selectElements.get(0));
        dropdown.selectByIndex(1);
    try {
        for (int i = 1; i < selectElements.size(); i++) {
            selectElements = driver.findElements(By.tagName("select"));
            dropdown = new Select(selectElements.get(i));
            List<WebElement> options = dropdown.getOptions();
            int numberOfOptions = options.size();
            // Generate a random index (excluding the first option if it's a placeholder)
            Random rand = new Random();
            int randomIndex = rand.nextInt(numberOfOptions - 1) + 1;
            dropdown.selectByIndex(randomIndex);
        }
    }catch (Exception e){
        System.out.println(e);
    }


        return catalogueItem;
    }


    public WebElement addToCart(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.className("css-1r0om5d"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement popup2(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.xpath("//*[@id=\"disallow-button\"]"));
            return notNowBtn;
        } catch (NoSuchElementException | InterruptedException e) {
           System.out.println(e);
            return null;
        }
    }
    public WebElement cookies(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.cssSelector("#__next > div.css-1gx7o2j > div > div > button"));
            return notNowBtn;
        } catch (NoSuchElementException | InterruptedException e) {
           System.out.println(e);
            return null;
        }
    }

    public WebElement todaysDeals(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.cssSelector("#__next > div.css-mt1jh3 > div.css-lfu7zg > div > header > div.show-for-desktop.css-sncxrr > div.css-1ymiw64 > div.css-5ipae5 > a.css-2sdtkk"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement seeLoginPassword(WebDriver driver) {
        try {
            Thread.sleep(2000);
            WebElement notNowBtn = driver.findElement(By.cssSelector("#__next > div.css-mt1jh3 > div.active.css-inuz5c > div > div > div > form > div > div:nth-child(2) > div > div.css-1aeav6i > button"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public WebElement loginName(WebDriver driver) {
        try {
            Thread.sleep(5000);
            WebElement notNowBtn = driver.findElement(By.cssSelector("#__next > div.css-mt1jh3 > div.css-lfu7zg > div > header > div.show-for-desktop.css-sncxrr > div.css-1ymiw64 > div.css-1r8d8fi > div.show-for-desktop.css-roynbj > div > div"));
            return notNowBtn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}




