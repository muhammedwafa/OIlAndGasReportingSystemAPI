package com.iti.jets.reportingSystem.exeptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message); //this should call the constructor and pass the message.
    }
}
