package com.sip.Strings;

public class MethodsInStringComaprision {
    public static void main(String[] args) {
        String s = "Selenium";
        String s1 = "Playwright Automation tool";
        String s2 = "Automation";
        String s3 = "tool";
        String s4 = "Selenium Automation";
        String s5 = "Playwright";
        String s6 = "            Playwright Automation tool         ";
        String s7 = "Automation";
        String s8 = "automaTIon";

        System.out.println(s.contains(s4));
        System.out.println(s1.contains(s5));

        System.out.println(s1.startsWith(s5));

        System.out.println(s1.endsWith(s3));

        System.out.println(s7.equalsIgnoreCase(s8));

        System.out.println(s6);
        System.out.println(s6.trim());

    }
}
