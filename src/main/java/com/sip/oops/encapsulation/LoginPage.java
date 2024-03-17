package com.sip.oops.encapsulation;

public class LoginPage {

    private int num = 10;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getNum(){
       return num;
    }

    public void login(){
        System.out.println("Login Test");
        System.out.println(num);
    }

}
