package com.sip.Strings;

public class MethodsInStrings {

    public static void main(String[] args) {
        String value = "500";
        System.out.println(Integer.parseInt(value));

        String price = "$200";
        System.out.println(price.substring(1));

        String price1 = "$3023457758hsdjsdjkhks1247!#@^#*@#*ghgfhfhRDFCHGVJBJGHFDS4564564564564&@0";
        System.out.println(price1.replaceAll("[^0-9]",""));
        System.out.println(price1.replaceAll("[^a-z]",""));
        System.out.println(price1.replaceAll("[^A-Z]",""));
        System.out.println(price1.replaceAll("[^A-Za-z]",""));
        System.out.println(price1.replaceAll("[^A-Za-z0-9]",""));
        System.out.println(price1.replaceAll("[A-Za-z0-9]",""));

        System.out.println(price1.length());

        String message = "Welcome to training program and $10k payment";
        int index1 = message.indexOf("$");
        System.out.println(index1);
        String subMessage = message.substring(index1);
        System.out.println(subMessage);
        int index2 = subMessage.indexOf("k") ;
        System.out.println(index2);
        String actualMessage = subMessage.substring(0, index2);
        System.out.println(actualMessage);
    }
}
