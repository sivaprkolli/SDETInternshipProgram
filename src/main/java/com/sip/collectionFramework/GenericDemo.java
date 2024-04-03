package com.sip.collectionFramework;

public class GenericDemo {

    public static void main(String[] args) {
        GenericsTest<Integer> obj = new GenericsTest<Integer>();
        GenericsTest<String> obj1 = new GenericsTest<String>();
        obj.object = 10;
        obj1.automationTool = "Playwright";
        obj1.object = "2";
        obj.test();

        obj1.getAutomationToolDetails();
    }
}
