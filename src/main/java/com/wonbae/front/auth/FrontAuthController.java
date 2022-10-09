package com.wonbae.front.auth;

import com.wonbae.config.auth.PrincipalDetailService;
import com.wonbae.config.auth.PrincipalDetails;
import com.wonbae.front.auth.form.SigninForm;
import com.wonbae.front.auth.form.SignupForm;
import com.wonbae.handler.frontHandler.exception.CommonValidationException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class FrontAuthController {
    private final FrontAuthService frontAuthService;

    /**
     * 회원 가입 폼
     */
    @GetMapping("/signup")
    public String singUpForm() {
        return "front/auth/signup";
    }

    /**
     * 회원가입
     */
    @PostMapping("/signup")
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

        return "redirect:/auth/signin";
    }

    /**
     * 로그인 폼
     */
    @GetMapping("/signin")
    public String signinForm(SigninForm signinForm) {
        return "front/auth/signin";
    }

    /**
     * 로그인
     */
    @PostMapping("/signin")
    public String signin(@AuthenticationPrincipal PrincipalDetails principalDetails, SigninForm signinForm) {
        return "front/auth/signin";
    }

}
