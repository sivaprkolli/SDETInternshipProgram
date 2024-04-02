package com.sip.programs;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
                  //0,1,2,3,4,5,6,7,8,9,10,11
        int a[] = {98,2,96,4,99,95,3,97,1,5,100};

        Arrays.sort(a);

        for (int i=0; i<a.length; i++){

            if(a[i] > 96){
               break;
            }else
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();

        System.out.println("****************************************");

        for (int i=0; i<a.length; i++){

            if(a[i] < 5){
                continue;
            }else
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();

        for(int k:a){
            System.out.println(k);
        }

        String str = "Selenium";
        char[] c1 = str.toCharArray();
        Arrays.sort(c1);

        for(char c: c1){
            System.out.print(c);
        }
    }


}
