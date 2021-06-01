package com.iti.jets.reportingSystem.customer.exeptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message); //this should call the constructor and pass the message.
    }
}
