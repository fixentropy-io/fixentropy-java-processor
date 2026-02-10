package io.fixentropy.exception;

public class SerializationFailed extends DrageeException {
    public SerializationFailed(Throwable innerException) {
        super("Failed to serialize dragees", innerException);
    }
}
