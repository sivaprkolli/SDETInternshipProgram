package com.sip.exceptions;

public class AuthenticationException extends Exception{

    public AuthenticationException(String exceptionMessage){
        super(exceptionMessage);
    }

    public AuthenticationException(String exceptionMessage, Throwable te){
        super(exceptionMessage, te);
    }

    public AuthenticationException(String exceptionMessage, ArithmeticException te){
        super(exceptionMessage, te);
    }
}
