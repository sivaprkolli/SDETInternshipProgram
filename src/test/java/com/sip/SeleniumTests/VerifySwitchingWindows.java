package com.sip.SeleniumTests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;
import java.util.zip.DeflaterInputStream;

public class VerifySwitchingWindows {

    WebDriver driver;

    @Test
    public void switchToFrameAndVerifyElement1() {
        driver = new ChromeDriver();
        driver.get("https://naukri.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
       // driver.manage().window().minimize();
        //driver.manage().window().setSize(new Dimension(600, 600));

        Dimension size = driver.manage().window().getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        System.out.println(width);
        System.out.println(height);

        Point point = driver.manage().window().getPosition();

        int x = point.getX();
        int y = point.getY();
        System.out.println(x);
        System.out.println(y);

        int x1 = (int) ((point.x )* (.50));
        int y1 = (int) ((point.y )* (.50));
        System.out.println(x1 + ", " + y1);
        driver.quit();
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
