package com.sip.oops.constructors;

public class Test1 {

    public String name;

    public Test1(String city){
        this.name = city;
        System.out.println("name :: " + city);
    }

    public void loginAndVerify(){
        System.out.println("Login Success");
        System.out.println("Verify :: " + name + " present on the page");
    }
}
