package com.sip.Strings;

public class StringBufferVsStringBuilder {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Selenium");
        StringBuffer stringBuffer1 = new StringBuffer("Appium");
        StringBuffer stringBuffer2 = new StringBuffer();

        StringBuffer sb = new StringBuffer("Playwright");
        StringBuffer sb1 = new StringBuffer("Playwright");
        StringBuffer sb2 = new StringBuffer("playwright");

        stringBuffer.append(" Automation");
        stringBuffer.insert(0, "Training ");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer1.capacity());
        System.out.println(stringBuffer2.capacity());

        System.out.println(sb == sb1);
        System.out.println(sb.equals(sb1));
        System.out.println(sb.compareTo(sb1));
        System.out.println(sb.compareTo(sb2));


    }
}
