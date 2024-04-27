package com.sip.TestNG;

import org.testng.annotations.Test;

public class MethodDependencyTest {
    @Test
    public void register(){
        System.out.println("Automation Executing Register Test");
    }

    @Test(dependsOnMethods = "register")
    public void login(){
        System.out.println("Automation Executing Login Test");
    }

    @Test(dependsOnMethods = "login")
    public void bookTicket(){
        System.out.println("Automation Executing BookTicket Test");
    }

    @Test(dependsOnMethods = "bookTicket")
    public void sendTicket(){
        System.out.println("Automation Executing SendTicket Test");
    }
}
