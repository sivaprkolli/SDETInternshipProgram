package com.sip.AutomationFrameworkUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SIPBase {
    WebDriver driver;
    @BeforeSuite
    public void initializeReports(){
        System.out.println("Initialize Reports");
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }

    @BeforeTest
    public void beforeTest(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
}
