package io.fixentropy.exception;

public class DrageeException extends RuntimeException {

    protected DrageeException(String message) {
        super(message);
    }

    protected DrageeException(String message, Throwable innerException) {
        super(message, innerException);
    }

}
