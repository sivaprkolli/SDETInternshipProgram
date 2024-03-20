package com.sip.oops.constructors;

public class TestConstructor {
    int a;

    public static void main(String[] args) {
        TestConstructor testConstructor = new TestConstructor();
        TestConstructor testConstructor1 = new TestConstructor("Selenium");
        TestConstructor testConstructor2 = new TestConstructor("Selenium", 4);
        //new TestConstructor();

    }

    public TestConstructor(String tool){
        System.out.println("Test Automation tool :: "  +tool);
        a = 1009787876;
        System.out.println(a);
    }

    public TestConstructor(String tool, int a){
        System.out.println("Test Automation tool :: "  +tool);
        System.out.println(a);
    }

    public TestConstructor(){
        System.out.println("Test Automation class");
    }


/*    public void TestConstructor(){
        System.out.println("Test Automation");
    }*/
}
