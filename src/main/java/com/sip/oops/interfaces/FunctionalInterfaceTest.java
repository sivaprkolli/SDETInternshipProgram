package com.sip.oops.interfaces;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        FunctionalInterface1 functionalInterface1 = new FunctionalInterface1(){
            public void rupali(){
                System.out.println("Automation Testing");
            }
        };

        functionalInterface1.rupali();
    }
}
