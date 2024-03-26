package com.sip.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowVsThrows {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        sleep(1000);

        System.out.println("**********************************");
        try{
            int a= 5/0;
//            System.out.println(a);
            //throw new ArithmeticException("Please check your maths code");
            System.out.println("Try Block");

        }

        catch (ArithmeticException aie){
            System.out.println("Catch Block");
            //aie.printStackTrace();
            System.exit(0);
            throw new ArithmeticException("Please check your maths code");

        }

        finally {
            System.out.println("Close DB");

        }
    }


    public static void sleep(int time) throws FileNotFoundException {
        File file = new File("");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
            throw new FileNotFoundException("Provide right path ");
        }

        System.out.println("FileInputStream Method");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sleep Method");
    }
}
