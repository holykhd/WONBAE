package com.wonbae.handler.frontHandler.exception;

import org.springframework.http.HttpStatus;

import java.util.Map;

public class CommonValidationException extends RuntimeException {
    private HttpStatus statusCode;
    private Map<String, Object> errorMap;

    public CommonValidationException(HttpStatus statusCode, String message, Map<String, Object> errorMap) {
        super(message);
        this.statusCode = statusCode;
        this.errorMap = errorMap;
    }

    public Map<String, Object> getErrorMap() {
        return errorMap;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }
}
