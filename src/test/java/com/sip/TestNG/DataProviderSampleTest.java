package com.sip.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSampleTest {

    @Test(dataProvider = "languages")
    public void autoTest(String tool, int version){
        System.out.println("Language :: " + tool + " version :: " + version);
    }

    @DataProvider(name = "automation tools")
    public Object[][] tools(){

        return new Object[][]{
                {"Selenium", 4},
                {"Appium", 2},
                {"WebDriverIO", 6},
                {"Playwright", 1}
        };
    }

    @DataProvider(name = "languages")
    public Object[][] languageList(){

        return new Object[][]{
                {"Java", 11},
                {"Node", 20},
                {"C#", 8},
                {"Ruby", 3}
        };
    }

}
