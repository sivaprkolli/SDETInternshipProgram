package com.sip.javaBasics;

public class Child extends Parent{
    int a = 20;
    String city = "Vizag";

    public void test1(){
        int c = this.a;
        String s = this.city;
        String str = super.city;
        System.out.println("City :: " + s + " and number :: " + c);
        System.out.println("City hyd :: " + str);
        super.login();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.test1();

    }

}
