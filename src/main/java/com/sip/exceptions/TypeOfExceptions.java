package com.sip.exceptions;

import java.io.File;

public class TypeOfExceptions {
    static String s;

    public static void main(String[] args) {

        File file = new File("./oops.xml");

        System.out.println(file.getAbsoluteFile());

    }

    public void stringIndexBoundException(){
        try {
            String s = "Selenium";
            char c[] = s.toCharArray();
            System.out.println(s.charAt(12));
        } catch (StringIndexOutOfBoundsException sie){
            sie.printStackTrace();
            System.out.println(sie.toString());
        }
    }

    public void nullPointerException(){
        BasicExceptions bs= null;
//        arthematicExceptionExample();
//        new TypeOfExceptions().arrayOutOfBoundException();
        bs.test1();
        System.out.println(s + "s");
    }

    public static void arthematicExceptionExample(){
        try {
            int a = 5/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Testing Banking Application");
    }

    public void arrayOutOfBoundException(){
        try{
            int a[] = {1,2,4,6,8,9,9,5,33,56,4};
            System.out.println(a[11]);
        }catch (ArrayIndexOutOfBoundsException aie){
            aie.printStackTrace();
        }
        System.out.println("Selenium Testing");
    }


}
