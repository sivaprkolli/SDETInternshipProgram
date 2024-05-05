package com.sip.oops.interfaces;

public class FuncInterTest {
    public static void main(String[] args) {
        FuncInter funcInter = (int a, int b) ->
        {
            return a + b;
        };

        int a = funcInter.sum(10, 30);
        System.out.println(a);
    }
}
