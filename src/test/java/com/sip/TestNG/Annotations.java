package com.sip.TestNG;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    public void beforeSuite(){
        //DB connecting
        //Report Initialization
        //Drivers Initialization

        System.out.println("Before Suite");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest(){
        // Launch Application
        // before all the classes
        System.out.println("Before Test");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }


    @BeforeClass
    public void beforeClass(){
        // Every class
        System.out.println("Before Class");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }


    @BeforeMethod
    public void beforeMethod(){
        //Every Testcase
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }


    @Test
    public void autoTest(){
        System.out.println("Automation Testing 1");
    }

    @Test
    public void autoDemo(){
        System.out.println("Automation Testing 2");
    }




}
