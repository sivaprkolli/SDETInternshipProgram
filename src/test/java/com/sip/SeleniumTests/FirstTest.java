package com.sip.SeleniumTests;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstTest {
    //WebDriver driver;
    public static void main(String[] args) {
//        WebDriver firefoxDriver = new FirefoxDriver();
//        WebDriver safariDriver = new SafariDriver();

       // WebDriver chromeDriver = new ChromeDriver();
//        ChromeDriver chromeDriver1 = new ChromeDriver();
//        ChromiumDriver chromiumDriver2 = new ChromeDriver();
//        RemoteWebDriver remoteWebDriver = new ChromeDriver();
        //SearchContext searchContext = new ChromeDriver();

      //  WebDriver driver1 = new ChromeDriver();
        ChromeDriver chromeDriver1 = new ChromeDriver();
        //FirefoxDriver firefoxDriver = new FirefoxDriver();

        chromeDriver1.get("https://www.salesforce.com/");
        System.out.println();

        chromeDriver1.navigate().to("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        System.out.println();
        chromeDriver1.navigate().refresh();
        chromeDriver1.navigate().back();
        chromeDriver1.navigate().forward();


        chromeDriver1.close();

        chromeDriver1.quit();







    }
}
