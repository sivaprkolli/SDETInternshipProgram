package com.sip.oops.constructors;

public class Parent {

    public Parent(){
        System.out.println("Parent Constructor");
    }

    private Parent(String name){
        System.out.println("Automation tool :: " + name);
    }


    public Parent(String name, double version){
        System.out.println("Automation tool :: " + name);
    }

    public Parent(String name, double version, int year){
        System.out.println("Automation tool :: " + name);
        System.out.println("Automation version :: " + version);
        System.out.println("Released year :: " + year);
    }




    public void test1(){
        System.out.println("Test1");
    }
}
