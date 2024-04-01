package com.sip.javaBasics;

public class AboutStatic2 {
    int empId;
    String name;
    static String org = "Qualizeal";

    public AboutStatic2(int empId, String name){
        System.out.println("empId ::" + empId);
        System.out.println("name ::" + name);
    }

    public void company(){
        org = "Apple";
        System.out.println(org);
    }

    public static void main(String[] args) {
        new AboutStatic2(10, "Siva");
        new AboutStatic2(11, "Rahul");

        new AboutStatic2(12, "Rupali").company();
    }
}
