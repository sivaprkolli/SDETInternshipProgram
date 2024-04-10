package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerificationMethods {
    WebDriver driver;

    @Test
    public void verifyCheckBox(){

        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        //driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement subscriptionAgreement = driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']"));
        System.out.println(subscriptionAgreement.isSelected());


        WebElement subscriptionCheckBox = driver.findElement(By.xpath("//div[contains(@id,'SubscriptionAgreement')]/preceding-sibling::div[contains(@class,'checkbox-ui')]"));
        subscriptionCheckBox.click();

       // WebElement checkBox2 = driver.findElement(By.xpath("(//form/input)[2]"));

        System.out.println(subscriptionAgreement.isSelected());

        WebElement startMyFreeTrailButton = driver.findElement(By.cssSelector(".submit.salesforce-sans-regular"));
        System.out.println(startMyFreeTrailButton.isDisplayed());

        driver.quit();

    }

    @Test
    public void verifyRadioButton(){
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        //driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement radioButton1 = driver.findElement(By.cssSelector("form>input[value='green']"));
        WebElement radioButton = driver.findElement(By.cssSelector("form>input[value='blue']"));
        System.out.println(radioButton.isSelected());

        radioButton1.click();
        System.out.println(radioButton.isSelected());
        Assert.assertTrue(radioButton.isSelected(), "Radio button is not selected");
    }

    @Test
    public void verifyIsElementEnabled(){
        driver = new ChromeDriver();
        driver.get("https://www.prettylittlething.com/black-faux-suede-square-toe-double-buckle-lace-up-high-heeled-sandals.html");
        //driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[text()='Accept All']")).click();
        WebElement selectSize = driver.findElement(By.xpath("//button[text()='Select size']"));
        System.out.println(selectSize.isEnabled());
        Assert.assertFalse(selectSize.isEnabled());

        driver.findElement(By.xpath("//span[text()='8']")).click();
        System.out.println(selectSize.isEnabled());
        Assert.assertTrue(selectSize.isEnabled());

    }
}
