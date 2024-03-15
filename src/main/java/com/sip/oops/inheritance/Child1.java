package com.sip.oops.inheritance;

public class Child1 {

    public static void main(String[] args) {
        Child1 child = new Child1();
        Parent parent = new Parent();
        parent.test1();
        System.out.println(parent.s);
        System.out.println(parent.a);
    }
}
