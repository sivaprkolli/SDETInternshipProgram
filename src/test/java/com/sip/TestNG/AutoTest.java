package com.sip.TestNG;

import org.testng.annotations.Test;

public class AutoTest {

    @Test(groups = "smoke")
    public void autoTest(){
        System.out.println("Automation Executing Test 1");
    }
}
