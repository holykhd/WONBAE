package com.wonbae.handler.frontHandler;

import com.wonbae.handler.frontHandler.exception.AlertScriptException;
import com.wonbae.handler.frontHandler.exception.AlertScriptForm;
import com.wonbae.handler.frontHandler.exception.CommonExceptionForm;
import com.wonbae.handler.frontHandler.exception.CommonValidationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class AlertScriptExceptionHandler {

    @ExceptionHandler(AlertScriptException.class)
    public String validationException(AlertScriptException e) {
//        return AlertScriptForm.back(e.getErrorMap().toString());
        return AlertScriptForm.back(e.getMessage());
    }
}