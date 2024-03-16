package com.sip.oops.polymorphism;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        child.click();

      //Left-side parent :: Right-side Child
        Parent parent = new Child();
        parent.click();
    }

    @Override
    public void click(){
        System.out.println("Click on element Successfully");
        System.out.println("Return 200 status code");
    }

    @Override
    public void sum(int a, int b){
        System.out.println(a+b);
    }

    @Override
    public void total(int a, int b){
        System.out.println(a+b);
    }
}
