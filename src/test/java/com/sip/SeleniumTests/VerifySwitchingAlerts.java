package com.sip.SeleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifySwitchingAlerts {

    WebDriver driver;

    @Test
    public void switchToFrameAndVerifyElement() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("[onclick^='jsAlert']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.cssSelector("[onclick^='jsPrompt']")).click();

        alert.sendKeys("Selenium Automation");
        alert.dismiss();
        System.out.println();




    }
    }
