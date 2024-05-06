package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ColorValidation {

    @Test
    public void verifyColorOfElement() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yatra.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> sourceElement = driver.findElements(By.xpath("(//div[@class=\"join-yatra-prime-unit\"])"));

        String colour = sourceElement.get(0).getCssValue("color");
        String backGourndColor = sourceElement.get(0).getCssValue("background-color");

        System.out.println(colour);
        System.out.println(backGourndColor);

        Assert.assertEquals(Color.fromString(colour).asHex(), "#000000");

        driver.quit();

    }
}

