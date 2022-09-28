package com.wonbae.handler.frontHandler.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonExceptionForm<T> {
    private HttpStatus statusCode;
    private String message;
    private T data;
}
