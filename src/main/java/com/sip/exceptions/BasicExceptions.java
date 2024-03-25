package com.sip.exceptions;

public class BasicExceptions {

    public static void main(String[] args) {
        try {
            int a = 5/0;
            System.out.println(a);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Testing Banking Application");
    }

    public void test1(){
        System.out.println("Test");
    }

}
