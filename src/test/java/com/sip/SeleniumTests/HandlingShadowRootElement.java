package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingShadowRootElement {
    WebDriver driver;

    @AfterTest
    public void killSession() {
        driver.quit();
    }

    @Test
    public void handleMouseMoves() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        SearchContext rootElement = driver.findElement(By.cssSelector("[apptitle=\"BOOKS\"]")).getShadowRoot();
        rootElement.findElement(By.cssSelector("[slot='input']")).sendKeys("TestAutomation");

        System.out.println();
        driver.quit();
    }

    @Test
    public void findMultipleElements(){
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement mainElement = driver.findElement(By.cssSelector(".form_submit_button"));
        mainElement.findElement(By.cssSelector("[name=\"start my free trial\"]")).click();
        System.out.println();

//        String errorMessage = mainElement.findElement(By.cssSelector(".error-msg")).getText();
//        System.out.println(errorMessage);

    }
}
