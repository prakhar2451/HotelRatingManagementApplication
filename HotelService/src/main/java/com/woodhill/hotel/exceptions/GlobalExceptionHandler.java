package com.woodhill.hotel.exceptions;

import com.woodhill.hotel.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * GlobalExceptionHandler class handles all exceptions that are thrown by the HotelService application.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * Handles ResourceNotFoundException.
     *
     * @param ex the ResourceNotFoundException
     * @return a ResponseEntity with a 404 Not Found status code and an ApiResponse object containing the error message
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
        String message = ex.getMessage();
        ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
