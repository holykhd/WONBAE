package com.wonbae.admin.auth;

import com.wonbae.admin.main.form.SignUpForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminAuthController {

    /**
     * 로그인 페이지
     */
    @GetMapping("/singIn")
    public String signInForm() {
        return "admin/auth/signIn";
    }

    /**
     * 로그인
     */
    @PostMapping("/singIn")
    public String signIn(SignUpForm signUpForm) {
        return "admin/index";
    }

    /**
     * 회원가입 페이지
     */
    @GetMapping("/signUp")
    public String signUpFrom() {
        return "admin/auth/signUp";
    }

    /**
     * 회원가입
     */
    @PostMapping("/signUp")
    public String signUp(SignUpForm signUpForm) {
        log.info("signUpForm = {}", signUpForm.getUsername());
        log.info("signUpForm = {}", signUpForm.getPassword());
        log.info("signUpForm = {}", signUpForm.getEmail());
        return "admin/auth/signIn";
    }
}