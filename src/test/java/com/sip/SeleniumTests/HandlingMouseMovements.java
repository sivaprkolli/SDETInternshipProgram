package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingMouseMovements {

    WebDriver driver;

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void handleMouseMoves() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.next.co.uk/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
        driver.findElement(By.cssSelector("[data-testid=\"country-selector-close-button\"]")).click();
        Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath("//div[text()='women']"));
       // WebElement subMenu = driver.findElement(By.xpath("//span[text()='All Clothing']"));
        actions.moveToElement(mainMenu).perform();
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='All Clothing']"))).click().perform();
        System.out.println();
    }
}
