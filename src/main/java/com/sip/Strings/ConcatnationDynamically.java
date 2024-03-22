package com.sip.Strings;

public class ConcatnationDynamically {

    public static void main(String[] args) {
        verifyHeading("Extent");
        verifyHeading("Allure");
        verifyHeading("ReportPortal");
    }

    public static void verifyHeading(String reportName){
        System.out.println("Quick introduction to "+ reportName +" reports with Playwright");
    }
}
