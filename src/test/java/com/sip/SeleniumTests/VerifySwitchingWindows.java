package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class VerifySwitchingWindows {

    WebDriver driver;

    @Test
    public void switchToFrameAndVerifyElement1() {
        driver = new ChromeDriver();
        driver.get("https://naukri.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));

        String parentWindow = driver.getWindowHandle();

        System.out.println("parentWindow :: " + parentWindow);
        Set<String> windowIds = driver.getWindowHandles();

        for (String window : windowIds) {
            driver.switchTo().window(window);
            if(driver.getTitle().equals("")){

            }
            String pageHeading = driver.findElement(By.tagName("h3")).getText();
            System.out.println(pageHeading);
        }
    }

    @Test
    public void switchToFrameAndVerifyElement() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));

        String parentWindow = driver.getWindowHandle();
        System.out.println("parentWindow :: " + parentWindow);

        WebElement clickHereLink = driver.findElement(By.cssSelector("[href='/windows/new']"));
        clickHereLink.click();
        webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> windowIds = driver.getWindowHandles();

        System.out.println("windowIds :: " + windowIds);

        for (String window : windowIds) {
            driver.switchTo().window(window);
            if(driver.getTitle().equals("New Window")){
                String pageHeading = driver.findElement(By.tagName("h3")).getText();
                System.out.println(pageHeading);

            }
        }

        driver.close();

        driver.switchTo().window(parentWindow);
        Assert.assertTrue(clickHereLink.isDisplayed());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.quit();
    }
}
