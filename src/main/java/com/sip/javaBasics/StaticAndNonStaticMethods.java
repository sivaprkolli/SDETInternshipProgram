package com.sip.javaBasics;

public class StaticAndNonStaticMethods {
    public int a = 10;
    public static int sum = 100;

    public void test1(){
        System.out.println("Test1");
    }

    public static void test2(){
        System.out.println("Test2");
    }

    public static void main(String[] args) {
        test2();
        System.out.println(sum);

        StaticAndNonStaticMethods differentTypesOfMethods = new StaticAndNonStaticMethods();
        differentTypesOfMethods.test1();

        int b = differentTypesOfMethods.a;
        System.out.println(b);
        HelloWorld.secondFunction();
        System.out.println(HelloWorld.f);
    }
}
