package com.wonbae.front.auth;

import com.wonbae.front.auth.form.SignupForm;
import com.wonbae.handler.frontHandler.exception.CommonValidationException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
public class FrontAuthController {
    private final FrontAuthService frontAuthService;

    @GetMapping("/auth/signup")
    public String singUpForm() {
        return "front/auth/signup";
    }

    @PostMapping("/auth/signup")
    public String signUp(@Valid SignupForm signupForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            Map<String, Object> errorMap = new HashMap<>();
            StringBuffer sb = new StringBuffer();

            for (FieldError error : bindingResult.getFieldErrors()) {
                sb.append(error.getDefaultMessage());
                errorMap.put(error.getField(), error.getDefaultMessage());
            }
            throw new CommonValidationException(HttpStatus.BAD_REQUEST, "유효성 검사 실패", errorMap);
        }

        frontAuthService.createAccountProcessor(signupForm);

        return "front/auth/signup";
    }
}
