package com.sip.javaBasics;

public class AboutStatic4 {
    int empID;
    String empName;
   static String orgName;

    public void getEmpDetails(){
        System.out.println(
                "EmpId :: " + empID +
                " EmpName :: " + empName +
                " EmpOrg :: " + orgName
        );
    }

    public static void main(String[] args) {
        AboutStatic4 aboutStatic4 = new AboutStatic4();
        aboutStatic4.empID = 10;
        aboutStatic4.empName = "Siva";
        AboutStatic4.orgName = "Qualizeal";


        AboutStatic4 aboutStatic5 = new AboutStatic4();
        aboutStatic5.empID = 123;
        aboutStatic5.empName = "Prasad";
        AboutStatic4.orgName = "Ness Tech";


       // aboutStatic4.orgName = "Apple";

        aboutStatic5.getEmpDetails();
        aboutStatic4.getEmpDetails();


    }
}
