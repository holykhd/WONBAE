package com.wonbae.front.auth.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class SignupForm {
    @Email
    private String email;                   // 이메일

    @NotBlank
    private String password;                // 비밀번호

    @NotBlank
    private String rePassword;              // 비밀번호 확인

    @NotBlank
    private String agreePrivacy;            // 개인정보 수집 동의

    private String agreeService;            // 이용약관 동의

    private String agreeSms;                // sms 수신 동의
}
