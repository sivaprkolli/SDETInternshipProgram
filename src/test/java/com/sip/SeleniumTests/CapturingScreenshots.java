package com.sip.SeleniumTests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CapturingScreenshots {

    WebDriver driver;

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void getFullPageScreenShot() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourcePage = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(System.getProperty("user.dir")+ "/screenshots/page.png");
        FileUtils.copyFile(sourcePage, destinationFile);
    }

    @Test
    public void getWebElementScreenShot() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.cssSelector("[title=\"ParaBank\"]"));
        File sourcePage = logo.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(System.getProperty("user.dir")+ "/screenshots/element.png");
        FileUtils.copyFile(sourcePage, destinationFile);
    }
}
