package com.sip.exceptions;

public class FinalyBlock {

    public static void main(String[] args) {
        try{
            int a= 5/1;
            System.out.println(a);
        }catch (ArithmeticException aie){
            aie.printStackTrace();
        }finally {
            System.out.println("Close DB");
        }
    }
}
