package com.chirango.TaskTrekbackend.exception;

public class AssignmentNotFound extends RuntimeException {
    public AssignmentNotFound(String message) {
        super(message);
    }

    public AssignmentNotFound(String message, Exception exception) {
        super(message, exception);
    }
}
