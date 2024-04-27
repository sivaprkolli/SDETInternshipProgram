package com.sip.TestNG;

import org.testng.annotations.Test;

public class AutoTest2 extends AutoDemoBase{

    @Test(groups = "regression")
    public void autoTest2(){
        System.out.println("Automation Executing Test 2");
    }

    @Test(groups = "regression")
    public void autoTest3(){
        System.out.println("Automation Executing Test 3");
    }
}
