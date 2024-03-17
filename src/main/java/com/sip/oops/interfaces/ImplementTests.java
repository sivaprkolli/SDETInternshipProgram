package com.sip.oops.interfaces;

public class ImplementTests implements InterfaceTest{

    @Override
    public void login() {
        System.out.println("Login");
    }

    @Override
    public void bookTickets() {
        System.out.println("bookTickets");
    }

    @Override
    public void completePayment() {
        System.out.println("completePayment");
    }

    @Override
    public void verifySuccessfulEmailTicket() {
        System.out.println("verifySuccessfulEmailTicket");
    }
}
