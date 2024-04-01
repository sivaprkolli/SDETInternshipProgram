package com.sip.javaBasics;

public class AboutStatic {

    static int counter=0;
    int a = 10;
    static int b = 20;

    public AboutStatic(){
        counter++;
        System.out.println(counter);
    }

    public void test3(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void test4(){
        System.out.println(b);
    }


    public static void main(String[] args) {
        System.out.println("Test Execution by Playwright");
        new AboutStatic();
        new AboutStatic();
        new AboutStatic();
        new AboutStatic();
        new AboutStatic();
    }

    static {
        System.out.println("Test Automation by Selenium");
    }

    public void test1(){
        System.out.println("Test1");
    }

    public static void test2(){
        System.out.println("Test2");
    }
    public static class Static1{
        public static void main(String[] args) {
            test2();
           AboutStatic aboutStatic = new AboutStatic();
           aboutStatic.test1();
        }
    }
}
