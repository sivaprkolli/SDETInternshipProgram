package com.sip.Strings;

public class BasicsOnStrings {

    public static void main(String[] args) {
        String tool = null;
        String tool1 = new String();

        System.out.println("tool :: " + tool);
        System.out.println("tool1 ::" + tool1 + "tool1");

        System.out.println(new BasicsOnStrings());

        String webTool = "Playwright";
        webTool.concat(" Automation tool");
        System.out.println(webTool);

        String webAutomationTool = webTool.concat(" Automation tool");
        System.out.println(webAutomationTool);
    }
}
