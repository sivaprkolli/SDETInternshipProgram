package com.sip.javaBasics;

public class AboutStatic3 {


    public void changeCompany(){
        AboutStatic2.org = "MicroSoft";
        System.out.println(AboutStatic2.org);
    }
    public static void main(String[] args) {
    AboutStatic3 aboutStatic3 = new AboutStatic3();

   aboutStatic3.changeCompany();

    }
}
