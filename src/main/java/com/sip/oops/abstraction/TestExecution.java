package com.sip.oops.abstraction;

public class TestExecution extends TestAbstract {

    public static void main(String[] args) {

        // rightside parent :: leftside child
        TestAbstract testAbstract = new TestAbstract();
        testAbstract.test1();

        new TestAbstract().test2();

        // rightside grand-parent :: leftside child
        TestClass testClass = new TestExecution();
        testClass.test1(); //

    }
}
