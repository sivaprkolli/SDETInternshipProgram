package com.sip.oops.inheritance;

import com.sip.javaBasics.HelloWorld;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        HelloWorld helloWorld = new HelloWorld();

        child.test1();
        System.out.println(child.s);
        System.out.println(child.a);
        child.test2();
        HelloWorld.secondFunction();
    }
}
