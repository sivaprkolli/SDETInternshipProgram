package com.sip.javaBasics;

public class HelloWorld {
    int a =10;
    String str = "Java";
    boolean b = true;
    char chr = 'S';
    public static float f = 9.6f;

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.firstFunction();
    }

    public void firstFunction(){
        System.out.println("Test Function");
    }


    public static void secondFunction(){
        System.out.println("Second Function");
    }
}
