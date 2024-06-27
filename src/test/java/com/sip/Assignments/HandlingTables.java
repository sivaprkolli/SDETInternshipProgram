package com.sip.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandlingTables {
WebDriver driver;
public String headerValue = "Email";
    @Test
    public void getDataFromTable(){


        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

       /* WebElement tableLastNameData = driver
                .findElement(By
                        .xpath("//table[@id='table1']/descendant::span[text()='Last Name']/ancestor::table/tbody/tr[1]/td[1]"));

        String lastName = tableLastNameData.getText();
        System.out.println(lastName);*/
        int headerIndex = getIndexOfHeaderItem(headerValue) + 1;
        //Assert.assertEquals(getData(headerValue, headerIndex),"Smith");

        List<String> actualLastNames = getLastNames(headerValue, headerIndex);
        System.out.println(actualLastNames.get(0));
        Assert.assertEquals(actualLastNames.get(0), "jsmith@gmail.com");

        List<String> rowVales = getRowRecord(1);
        System.out.println(rowVales);
        List<String> records = Arrays.asList("Smith", "John", "jsmith@gmail.com", "$50.00","http://www.jsmith.com", "edit delete");

        Assert.assertEquals(rowVales, records);
    }

    public int getIndexOfHeaderItem(String item){
        List<WebElement> headerList = driver.findElements(By.cssSelector("#table1 thead  tr  th"));
        List<String> headerNames = new ArrayList<>();

        for(int i=0; i< headerList.size(); i++){
            headerNames.add(headerList.get(i).getText());
        }
        System.out.println(headerNames);
        int index = headerNames.indexOf(item);
        System.out.println("index :: " +index);
        return index;
    }

    public String getData(String headerName, int index){
        WebElement tableLastNameData = driver
                .findElement(By
                        .xpath("//table[@id='table1']/descendant::span[text()='"+headerName+"']/ancestor::table/tbody/tr[1]/td["+index+"]"));

        System.out.println(tableLastNameData.getText());
        return tableLastNameData.getText();
    }

    public List<String> getLastNames(String headerName, int index){
        List<WebElement> tableLastNameData = driver
                .findElements(By
                        .xpath("//table[@id='table1']/descendant::span[text()='"+headerName+"']/ancestor::table/tbody/tr/td["+index+"]"));

        List<String> lastNames = new ArrayList<>();

        for(int i=0; i< tableLastNameData.size(); i++){
            lastNames.add(tableLastNameData.get(i).getText());
        }
        System.out.println("lastNames :: " + lastNames);
        return lastNames;
    }

    public List<String> getRowRecord(int index){
        List<WebElement> rowItems = driver.findElements(
                By.xpath("//table[@id='table1']/tbody/tr["+index+"]/td[text()]"));

        List<String> rowData = new ArrayList<>();
        for(int i=0; i< rowItems.size(); i++){
            rowData.add(rowItems.get(i).getText());
        }
        System.out.println(rowData);
        return rowData;
    }
}
