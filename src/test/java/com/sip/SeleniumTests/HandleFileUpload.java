package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleFileUpload {

    @Test
    public void doFileUpload(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement sourceElement = driver.findElement(By.name("file"));
        sourceElement.sendKeys(System.getProperty("user.dir")+"/testNGSuites/passingData.xml");

    }
}
