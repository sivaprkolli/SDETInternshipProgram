package com.sip.oops.constructors;

public class Child extends Parent{

    public Child(){
        super("Selenium", 4.18, 2024);
        System.out.println("Child Constructor");
    }
    
    public static void main(String[] args) {
        Child child = new Child();
    }
}
