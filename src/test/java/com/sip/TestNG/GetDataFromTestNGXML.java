package com.sip.TestNG;

import org.testng.annotations.*;

public class GetDataFromTestNGXML {

    @Parameters({"os"})
    @BeforeSuite
    public void initialize(String operatingSystem){
        System.out.println(operatingSystem);
    }

    @Parameters("browser")
    @BeforeTest
    public void launchBrowser(String browserName){
        System.out.println(browserName);
    }

    @Parameters("username")
    @Test
    public void testLogin(String un){
        System.out.println(un);
    }
}
