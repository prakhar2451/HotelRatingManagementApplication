package com.woodhill.hotel.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

/**
 * ApiResponse class is a DTO used to represent API responses.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;
}
