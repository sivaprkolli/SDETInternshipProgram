package com.sip.Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Playwright";
        char[] c = s.toCharArray();

        for (int i=c.length-1; i>=0; i--){
            System.out.print(c[i]);
        }

        for(int j=s.length()-1; j>=0; j--){
            System.out.print(s.charAt(j));
        }
    }
}
