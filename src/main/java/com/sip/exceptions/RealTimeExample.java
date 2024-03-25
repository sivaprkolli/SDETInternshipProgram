package com.sip.exceptions;

public class RealTimeExample {

    public static void main(String[] args) {
        try{
            int a = 10/0;
            System.out.println(a);
        }catch (Exception e){
            int a = 10/1;
            System.out.println(a);
        } finally {
            System.out.println("Fixed Block");
        }
    }
}
