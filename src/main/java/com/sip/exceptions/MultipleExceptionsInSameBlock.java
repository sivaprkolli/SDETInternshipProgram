package com.sip.exceptions;

import java.io.FileNotFoundException;

public class MultipleExceptionsInSameBlock {
    public static void main(String[] args) {
        String s[];
        try{
            int a= 5/1;
            try{
                int b = 5/0;
            }finally {
                System.out.println("finally");
            }


        }catch (ArithmeticException | IndexOutOfBoundsException e){
            System.out.println("ArithmeticException Block");

        }
        catch (Throwable aie){
            System.out.println("Throwable Catch Block");
        }

        finally {
            System.out.println("Close DB");

        }
    }
}
