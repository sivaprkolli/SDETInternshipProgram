package com.sip.oops.upDowncasting;

public class Child extends Parent{

    public void test2(){
        System.out.println("Test2");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();

        Parent parent1 = (Parent) new Child();
        Parent parent2 = new Child();

        parent1.test1();
        parent1.test1();

        new Child().test2();
        new Child().test1();

        Child child1 = (Child) parent2;
        child1.test2();
        child1.test1();
    }
}
