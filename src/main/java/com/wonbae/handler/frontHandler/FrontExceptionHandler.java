package com.wonbae.handler.frontHandler;

import com.wonbae.handler.frontHandler.exception.CommonExceptionForm;
import com.wonbae.handler.frontHandler.exception.CommonValidationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class FrontExceptionHandler {

    @ExceptionHandler(CommonValidationException.class)
    public CommonExceptionForm<?> validationException(CommonValidationException e) {
        return new CommonExceptionForm(e.getStatusCode(), e.getMessage(), e.getErrorMap());
    }
}