package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MultipleElements {
    WebDriver driver;

    @Test
    public void verifyNumberOfElementsAdded(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.cssSelector(".example > button"));
        //addElement.click();

        while (driver.findElements(By.cssSelector("#elements > button")).size() >= 0){
            addElement.click();
            if(driver.findElements(By.cssSelector("#elements > button")).size() == 5) break;
        }

        List<WebElement> deleteButtons = driver.findElements(By.cssSelector("#elements > button"));

        for(int i=0; i<deleteButtons.size(); i++){
            if(deleteButtons.size() == 0){
                break;
            } else
            {
                deleteButtons.get(i).click();
            }
        }

        Assert.assertTrue(driver.findElements(By.cssSelector("#elements > button")).size() == 0);

        System.out.println();
    }
}
