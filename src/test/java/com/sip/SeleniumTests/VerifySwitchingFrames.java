package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifySwitchingFrames {

    WebDriver driver;

    @Test
    public void switchToFrameAndVerifyElement(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.cssSelector("[src='/frame_top']")));
        driver.switchTo().frame("frame-left");

        WebElement leftElement = driver.findElement(By.xpath("//body[normalize-space()='LEFT']"));
        leftElement.isDisplayed();

        driver.switchTo().parentFrame();
        //driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleElement = driver.findElement(By.cssSelector("#content"));
        middleElement.isDisplayed();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        driver.findElement(By.xpath("//body[normalize-space()='BOTTOM']")).isDisplayed();


    }
}
