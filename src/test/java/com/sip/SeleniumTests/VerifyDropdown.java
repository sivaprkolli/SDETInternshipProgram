package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class VerifyDropdown {
WebDriver driver;
    @Test
    public void verifyValueSelectedFromList(){
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement jobTitleList = driver.findElement(By.cssSelector("[id^='UserTitle']"));

        Select dropDownSelect = new Select(jobTitleList);

        dropDownSelect.selectByValue("IT_Manager_AP");
        Assert.assertEquals(dropDownSelect.getFirstSelectedOption().getText(), "IT Manager");

        dropDownSelect.selectByVisibleText("Customer Service Manager");

        String firstSelectedOption = dropDownSelect.getFirstSelectedOption().getText();

        Assert.assertEquals(firstSelectedOption, "Customer Service Manager");

        int numberOfItemInTheList = dropDownSelect.getOptions().size();
        System.out.println(numberOfItemInTheList);

        List<String> listValues = new ArrayList<>();
        listValues.add("Job Title");
        listValues.add("Sales Manager");
        listValues.add("Marketing / PR Manager");
        listValues.add("Customer Service Manager");
        listValues.add("CXO / VP / General Manager");
        listValues.add("IT Manager");
        listValues.add("Operations Manager");
        listValues.add("Developer / Software Engineer");
        listValues.add("Student / Job Seeker / Personal Interest");
        listValues.add("Others");

        List<String> actualValues = new ArrayList<>();

        for (int i=0; i<dropDownSelect.getOptions().size(); i++){
        actualValues.add(dropDownSelect.getOptions().get(i).getText());
        }

        System.out.println(actualValues);

        Assert.assertEquals(listValues,actualValues);

    }
}
