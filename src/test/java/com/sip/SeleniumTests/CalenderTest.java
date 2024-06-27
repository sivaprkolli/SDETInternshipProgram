package com.sip.SeleniumTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CalenderTest {

    WebDriver driver;
    @Test
    public void bookTicket(){
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/flights/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        List<WebElement> yearMonth = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div"));
        WebElement nextMonthNavigateButton = driver.findElement(By.cssSelector(".DayPicker-NavButton[aria-label='Next Month']"));

        List<WebElement> dateButton = driver.findElements(By.cssSelector(".DayPicker-Day > div >p:first-of-type"));

        String date = "July 8 2024";
        String[] dateSplit = date.split(" ");
        String month = dateSplit[0];
        String year = dateSplit[2];
        String dateN = dateSplit[1];


        for (int i=0; i< yearMonth.size(); i++){

            if(yearMonth.get(i).getText().contains(year)){

                for(int j=0; j<12; j++) {
                    if (yearMonth.get(i).getText().contains(month)) {

                        for (int k=0; k<driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]/../following-sibling::div/descendant::div[@class='dateInnerCell']/p[not(@class=' todayPrice')]")).size(); k++) {
                            if (driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]/../following-sibling::div/descendant::div[@class='dateInnerCell']/p[not(@class=' todayPrice')]")).get(k).getText().equals(dateN)) {
                                //dateButton.get(k).click();
                                driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]/../following-sibling::div/descendant::div[@class='dateInnerCell']/p[not(@class=' todayPrice')]")).get(k).click();
                                break;
                            }
                        }
                    }else {
                        nextMonthNavigateButton.click();
                    }
                }
            }else{
                nextMonthNavigateButton.click();
            }
        }

        System.out.println();





    }
}
