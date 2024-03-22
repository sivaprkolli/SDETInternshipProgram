package com.sip.programs;

public class Conditions {

    public static void main(String[] args) {
        int age = 18;
        String link = "Reset App State";
        if(age > 18){
            System.out.println("Eligible to Vote");
        }
        else if(age == 18 ){
            System.out.println("Apply for Vote");
        }
        else{
            System.out.println("Not Eligible");
        }

        if(link.equals("All Items")){

        } else if(link.equals("About")){

        } else if(link.equals("Logout")){

        } else if(link.equals("Reset App State")){

        } else{
            System.out.println("Provide right link");
        }


        switch (link){
            case "Reset App State":
                System.out.println("Click on Reset App State");
                break;
            case "All Items":
                System.out.println("Click on All Items");
                break;
            case "About":
                System.out.println("Click on About");
                break;
            case "Logout":
                System.out.println("Click on logout");
                break;
            default:
                System.out.println("Please provide right link");
        }
    }
}
