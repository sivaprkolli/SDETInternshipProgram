package com.sip.SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DesiredCapabilitiesAndChromeOptions {
    WebDriver driver;
    @Test
    public void launchApp(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setAcceptInsecureCerts(true);
        desiredCapabilities.setCapability("browserName","chrome");
        desiredCapabilities.setBrowserName("chrome");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.merge(desiredCapabilities);
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--headless");

        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.cacert.org/");
    }
}
