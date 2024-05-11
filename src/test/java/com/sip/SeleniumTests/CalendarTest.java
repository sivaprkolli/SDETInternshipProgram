package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class CalendarTest {
    WebDriver driver;

    @AfterTest
    public void killSession() {
        driver.quit();
    }

    @Test
    public void calenderTest() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.cssSelector("[data-cy='closeModal']")).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
       // WebElement cal = driver.findElement(By.cssSelector("#departure"));
        //jse.executeScript("return arguments[0].click()", cal);
        //

        List<WebElement> monthAndYear = driver.findElements(By.cssSelector("div.DayPicker-Caption > div"));
        WebElement nextButton = driver.findElement(By.cssSelector("[aria-label=\"Next Month\"]"));

        List<WebElement> date = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'June')]/../following-sibling::div[@class='DayPicker-Body']/div/descendant::p[not(contains(@class,'todayPrice'))]"));

        //year select
        for(int i=0; i< 12; i++){
            if (monthAndYear.get(i).getText().contains("2024")){
                break;
            }else{
                nextButton.click();
            }
        }

        // select month
        for(int i=0; i< 12; i++){

            if (monthAndYear.get(i).getText().contains("July")){
                break;
            }else{
                nextButton.click();
            }
        }

        // select day
        for(int i=0; i< driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'June')]/../following-sibling::div[@class='DayPicker-Body']/div/descendant::p[not(contains(@class,'todayPrice'))]")).size(); i++){
            if (driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'June')]/../following-sibling::div[@class='DayPicker-Body']/div/descendant::p[not(contains(@class,'todayPrice'))]")).get(i).getText().contains("12")){
                driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'June')]/../following-sibling::div[@class='DayPicker-Body']/div/descendant::p[not(contains(@class,'todayPrice'))]")).get(i).click();
            }else{
                nextButton.click();
            }
        }



    }
}
