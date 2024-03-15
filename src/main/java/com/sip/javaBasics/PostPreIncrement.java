package com.sip.javaBasics;

public class PostPreIncrement {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a++;
        System.out.println(a); //11
        System.out.println(a++); //11
        System.out.println(a); //12

        ++a;
        System.out.println(a); // 13
        System.out.println(++a); // 14

        --b;
        System.out.println(b);
        System.out.println(--b);

        b--;
        System.out.println(b);
        System.out.println(b--);
        System.out.println(b);

    }
}
