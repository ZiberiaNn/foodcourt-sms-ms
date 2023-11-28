package com.pragma.powerup.infrastructure.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice

public class AuthControllerAdvisor {
    private static final String MESSAGE = "message";

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<Map<String, String>> handleBadCredentialsException(
            BadCredentialsException ignoredException) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(Collections.singletonMap(MESSAGE, ignoredException.getMessage()));
    }
    @ExceptionHandler(InternalAuthenticationServiceException.class)
    public ResponseEntity<Map<String, String>> handleForbiddenException(
            InternalAuthenticationServiceException ignoredException) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(Collections.singletonMap(MESSAGE, ignoredException.getMessage()));
    }
}
