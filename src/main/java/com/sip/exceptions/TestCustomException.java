package com.sip.exceptions;

import javax.security.sasl.AuthenticationException;

public class TestCustomException  {

    public static void main(String[] args) throws AuthenticationException{
        try {

            throw new AuthenticationException("Provide right credentials and try again", new ArithmeticException("use right maths"));
            //throw new AuthenticationException("Provide right credentials and try again", new Throwable("Element not found"));
           // throw new AuthenticationException("Provide right credentials and try again");
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

    }
}
