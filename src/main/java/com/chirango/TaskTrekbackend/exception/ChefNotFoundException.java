package com.chirango.TaskTrekbackend.exception;

public class ChefNotFoundException extends RuntimeException {
    public ChefNotFoundException(String message) {
        super(message);
    }

    public ChefNotFoundException(String message, Exception exception) {
        super(message, exception);
    }
}
