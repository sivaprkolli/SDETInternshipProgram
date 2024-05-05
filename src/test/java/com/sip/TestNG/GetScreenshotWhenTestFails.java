package com.sip.TestNG;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class GetScreenshotWhenTestFails {
    WebDriver driver;

    @Test
    public void verifyLogo() throws IOException {
        driver = new ChromeDriver();
        driver.get("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement logo = driver.findElement(By.cssSelector("[title=\"ParaBan\"]"));
    }

    public void takeScreenshot(){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourcePage = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(System.getProperty("user.dir")+ "/screenshots/page1.png");
        try {
            FileUtils.copyFile(sourcePage, destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void getSSWhenTestFails(ITestResult iTestResult, Method method){

        if (iTestResult.getStatus() == ITestResult.FAILURE){
            takeScreenshot();
        }
        Allure.addAttachment(method.getName(), new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

}
