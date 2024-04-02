package com.sip.javaBasics;

public class MultiDimentionalArray {

    public static void main(String[] args) {
        int[] a = {1,2,34,45,5,66};

        int[][] b = {
                {1,2,3,4},
                {5,6,7,8},
                {9, 10, 11,12},
                {13,14,15,16}
        };

        //outer loop
        for (int i=0; i<4; i++){
             //inner loop
            for(int j=0; j<4; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("***********************************");

        for(int[] k: b){
            //System.out.println();
            for(int l: k){
                System.out.print(l + " ");
            }
            System.out.println();
        }

    }
}
