package com.sip.oops.polymorphism;

public class Selenium {

    public void click(){
        System.out.println("Successfully clicked on Element");
    }

//    public void click(){
//        System.out.println("Successfully clicked on Element");
//    }

    public void sum(){
        int c, a=10, b=20;
        c = a+b;
        System.out.println("c :: " + c);
    }

    public void sum(int a){
        System.out.println("a :: " + a);
    }

    /*
    We cannot achieve method overloading by changing the return type
     */
    /*public int sum(int a){
        System.out.println("a :: " + a);
        return a;
    }*/


    public void sum(float a){
        System.out.println("a :: " + a);
    }

    public void sum(int a, int b){
        System.out.println("a+b :: " + a+b);
    }

    public void sum(int a, double b){
        System.out.println("a+b :: " + a+b);
    }
}
