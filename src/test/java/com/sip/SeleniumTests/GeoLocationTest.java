package com.sip.SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v125.emulation.Emulation;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GeoLocationTest {
    @Test
    public void setLocation(){
        ChromeDriver chromeDriver = new ChromeDriver();
        DevTools devTools = chromeDriver.getDevTools();
        devTools.send(Emulation.setGeolocationOverride(
                Optional.of(19.077065),
                Optional.of(72.998993),
                Optional.of(1)));
        chromeDriver.get("https://my-location.org/");
    }

    @Test
    public void setMobileView(){
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        Map deviceMetrics = new HashMap()
        {{
            put("width", 430);
            put("height", 930);
            put("mobile", true);
            put("deviceScaleFactor", 50);
        }};
        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);

        driver.get("https://facebook.com");
    }

    @Test
    public void setPerfectMobileView(){
        Map map = new HashMap();
        map.put("deviceName", "iPhone XR");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation",map);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://facebook.com");
    }
}
