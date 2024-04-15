package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumWaits {
    WebDriver driver;
    WebDriverWait webDriverWait;
    //format
    //alt+ctlr/cmd/+shift+l

    /**
     * Implicit wait
     */
    @Test
    public void understandImplicitWait() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        //Implicit wait - will applicable for every driver.findElement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.xpath("//a[@href='/abtest']"));
        String text = driver.findElement(By.xpath("//a[@href='/abtest']")).getText();
        element.isDisplayed();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement brokenImagesLink = driver.findElement(By.cssSelector("[href='/broken_imag']"));
        brokenImagesLink.click();
    }

    /**
     * Explicit wait - WedDriverWait
     */
    @Test
    public void understandExplicitWebDriverWait() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));


        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/abtest']")));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[href='/broken_images']")));

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/abtest']"))).click();
        driver.navigate().back();

        Boolean b = webDriverWait.until(ExpectedConditions.titleIs("The Internet")).booleanValue();
        System.out.println(b);

        WebElement abTestLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/abtest']")));
        // abTestLink.click();

        List<WebElement> allLink = webDriverWait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//a"), 46));
        System.out.println(allLink.size());
    }


    /**
     * Explicit wait - Fluent wait
     *
     * @return
     */
    @Test
    public void understandExplicitFluentWait() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebDriverWait test = new WebDriverWait(driver, Duration.ofSeconds(10));
        FluentWait fluentWait = new FluentWait(driver)
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Element not found for given max time")
                .withTimeout(Duration.ofSeconds(10));
        // .ignoring(NoSuchElementException.class);

        fluentWait.until(ExpectedConditions.urlToBe("https://the-internet.herokuapp.com/"));
        fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/abtes']")));

    }

    public WebElement getWebElement() {
        return driver.findElement(By.xpath("//a[@href='/abtest']"));
    }

    public WebElement getWebElement1() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/abtest']")));
    }

    public String getWebElementText() {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/abtest']"))).getText();
    }

    public List<WebElement> getListOfWebElements() {
        return driver.findElements(By.xpath(""));
    }

    public String getMessage() {
        return driver.findElement(By.xpath("//a[@href='/abtest']")).getText();
    }
}
