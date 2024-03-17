package com.sip.oops.interfaces;

public class TestExecution extends ImplementTests{

    public static void main(String[] args) {
        //grand-parent = grand-child
        InterfaceTest interfaceTest = new TestExecution();
        interfaceTest.login();
        interfaceTest.bookTickets();
        interfaceTest.completePayment();
        interfaceTest.verifySuccessfulEmailTicket();
    }
}
