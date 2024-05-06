package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class StaleElementTest {
    WebDriver driver;

    @AfterMethod
    public void killSession(){
        driver.quit();
    }

    @Test
    public void handleStale() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys("siva9kolli");
        driver.navigate().refresh();

        try{
            element.sendKeys("siva9kolli");
        }catch (StaleElementReferenceException se){
            element = driver.findElement(By.name("username"));
        }

        element.sendKeys("siva9kolli");
    }
}
