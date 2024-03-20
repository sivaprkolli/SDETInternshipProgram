package com.sip.Strings;

public class ComparingStrings {
    public static void main(String[] args) {
        String web = "Playwright";
        String web1 = "Playwright";

        String webTool = new String("Playwright");
        String webTool1 = new String("Playwright");

        boolean b = web.equals(webTool); // compoares the values
        boolean b1 = (web == webTool); // compared the address in memory

        System.out.println(b);
        System.out.println(b1);
        System.out.println("****************************");
        System.out.println(webTool == webTool1); // false
        System.out.println(webTool.equals(webTool1)); // true
        System.out.println("****************************");

        System.out.println(web == web1); // true
        System.out.println(web.equals(web1)); // true

        System.out.println("****************************");

        System.out.println(web==webTool.intern());



    }
}
