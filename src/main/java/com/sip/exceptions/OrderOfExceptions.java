package com.sip.exceptions;

public class OrderOfExceptions {

    public static void main(String[] args) {
        try {
            int a = 5/0;
            System.out.println(a);
        }

        catch (ArithmeticException re){
            re.printStackTrace();
        }

        catch (ArrayIndexOutOfBoundsException aie){
            aie.printStackTrace();
        }

        catch (IndexOutOfBoundsException ie){
            ie.printStackTrace();
        }

        catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("Testing Banking Application");
    }
}
