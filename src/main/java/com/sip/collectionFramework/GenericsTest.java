package com.sip.collectionFramework;

public class GenericsTest<T> {
     T object;
     String automationTool;

    public void test(){
        System.out.println(object.getClass());
        System.out.println(object.getClass().getName());
    }

    public void getAutomationToolDetails(){
        System.out.println(
                "Automation Tool :: " + automationTool
                + " and Version is :: " + object
        );
    }

}

