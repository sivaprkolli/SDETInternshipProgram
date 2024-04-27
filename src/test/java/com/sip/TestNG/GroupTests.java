package com.sip.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTests {

    @Test(groups = "smoke")
    public void register(){
        System.out.println("Automation Executing Register Test");
    }

    @Test(groups = "smoke")
    public void login(){
        System.out.println("Automation Executing Login Test");
    }

    @Test(groups = "smoke")
    public void bookTicket(){
        System.out.println("Automation Executing BookTicket Test");
        Assert.assertTrue(false);
    }

    @Test(groups = "regression")
    public void sendTicket(){
        System.out.println("Automation Executing SendTicket Test");
        Assert.assertTrue(false);
    }
}
