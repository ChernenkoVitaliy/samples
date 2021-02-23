package com.company.controllers.exceptionhandler;

public class UserNotLoggedInException extends Exception {

    public UserNotLoggedInException(String message) {
        super(message);
    }
}
