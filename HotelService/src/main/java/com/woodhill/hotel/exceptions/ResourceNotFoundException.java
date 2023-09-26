package com.woodhill.hotel.exceptions;
import org.springframework.http.HttpStatus;

/**
 * ResourceNotFoundException is a custom exception that is thrown when a resource is not found on the server.
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource not found on the server. " + HttpStatus.NOT_FOUND);
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
