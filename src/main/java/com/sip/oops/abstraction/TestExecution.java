package com.sip.oops.abstraction;

public class TestExecution extends TestAbstract {

    public static void main(String[] args) {


        TestAbstract testAbstract = new TestAbstract();
        testAbstract.test1();

        new TestAbstract().test2();

        // leftside grand parent :: rightside child
        // WebDriver driver = new ChromeDriver();
        TestClass testClass = new TestExecution();
        testClass.test1(); //

        TestExecution testExecution = new TestExecution();
        testExecution.test1();


    }
}
