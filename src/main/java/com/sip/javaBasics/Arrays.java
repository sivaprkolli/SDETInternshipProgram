package com.sip.javaBasics;

public class Arrays {

    int j;
    String str1;
    char c1;
    double d1;

    public static void main(String[] args) {
        //test2();
        test1();
        Arrays arrays = new Arrays();
        int a[];
        int[] b;


        //Allocating the size
        int c[] = new int[6];
                         //0, 1, 2, 3, 4, 5, 6
       int[] d = new int[]{1, 2, 3, 4, 5, 6, 7};

      //  System.out.println(c[6]);
        String st = new String("One two three");
        String[] s = {"one","two","three"};
        int[] i = {1,2,4,5,6,7,7};

        int j;
        String str1;
        char c1;
        double d1;

        System.out.println(arrays.j);
        System.out.println(arrays.str1);
        System.out.println(arrays.c1);
        System.out.println(arrays.d1);
    }

    public static void test1(){
       int[] a = {99, 22, 55, 44, 66};
       String s = "Playwright";

       for (int i=0; i<a.length; i=i+2){
           System.out.println(a[i]);
       }
    }

    public static void test2(){
        int[] a = {99, 22, 55, 44, 66};
        String s = "Playwright";

        for(int i:a){
            System.out.println(i);
        }
    }
}
