package com.sip.SeleniumTests;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class VerifyTextMessage {
    WebDriver driver;

    @Test
    public void switchToFrameAndVerifyElement() {
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(".submit")).click();

        WebElement emailErrorMessage = driver.findElement(By.cssSelector("span[id^='UserEmail']"));
        WebElement emailErrorText = driver.findElement(By.xpath("//span[text()='Enter a valid email address']"));

        Assert.assertEquals(emailErrorMessage.getText(), "Enter a valid email address");
        Assert.assertTrue(emailErrorText.isDisplayed());

        String message = getErrorMessage("Last name");
        Assert.assertEquals(message, "Enter your last name");

        List<String> inputFeilds = new ArrayList<>();
        inputFeilds.add("First name");
        inputFeilds.add("Last name");
        inputFeilds.add("Email");
        inputFeilds.add("Job Title");
        inputFeilds.add("Company");
        inputFeilds.add("Employees");
        inputFeilds.add("Phone");

        String eM = getErrorMessage("First name");
        Assert.assertEquals(eM, "Enter your first name");

        String inputFeild1 = inputFeilds.get(0);
        System.out.println(inputFeild1);

        String erMsg = getErrorMessage(inputFeild1);
        System.out.println(erMsg);

        Assert.assertEquals(erMsg, "Enter your first name");

        List<WebElement> errorMessages = driver.findElements(By.cssSelector(".error-msg + div"));
        List<String> actualErrorMessages = new ArrayList<>();

        for (int i=0; i< errorMessages.size(); i++){
            actualErrorMessages.add(getErrorMessage(inputFeilds.get(i)));
            //getErrorMessage(inputFeilds.get(0));
        }

        System.out.println(actualErrorMessages);

        List<String> expectedErrorMessages = new ArrayList<>();
        expectedErrorMessages.add("Enter your first name");
        expectedErrorMessages.add("Enter your last name");
        expectedErrorMessages.add("Enter a valid email address");
        expectedErrorMessages.add("Select your title");
        expectedErrorMessages.add("Enter your company name");
        expectedErrorMessages.add("Select the number of employees");
        expectedErrorMessages.add("Enter a valid phone number");

        Assert.assertTrue(actualErrorMessages.containsAll(expectedErrorMessages));
        Assert.assertEquals(actualErrorMessages, expectedErrorMessages);

        driver.quit();
    }

    public String getErrorMessage(String inputField){
        String msg = driver.findElement(By.xpath("//label[normalize-space()='"+inputField+"']/following-sibling::span")).getText();
        return msg;
    }
}
