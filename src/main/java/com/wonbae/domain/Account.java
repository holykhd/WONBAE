package com.wonbae.domain;

import com.wonbae.domain.enumType.GenderRole;
import com.wonbae.domain.enumType.UserRole;
import com.wonbae.front.auth.form.SignupForm;
import lombok.Getter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.EnumType.STRING;

/**
 * 회원 테이블
 */
@Getter
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;                        // 회원 고유 아이디(자동 증가값)

    @Column(name = "email", unique = true)
    private String email;                   // 회원 이메일

    private String name;                    // 회원 이름

    private String password;                // 비밀번호

    private String phone;                   // 전화번호

    @Enumerated(STRING)
    private GenderRole gender;              // 성별

    @Column(name = "post_code")
    private String postCode;                // 우편번호

    private String addr1;                   // 주소 1

    private String addr2;                   // 주소 2

    private String city;                    // 시/도

    @Column(name = "gu_gun")
    private String guGun;                   // 구/군

    private String dong;                    // 동

    @Column(name = "apt_name")
    private String aptName;                 // 아파트명

    @Column(name = "dong_ho")
    private String dongHo;                  // 동/호수

    @Column(name = "first_fav_store")
    private String firstFavStore;           // 주 이용 마트명 1

    @Column(name = "second_fav_store")
    private String secondFavStore;          // 주 이용 마트명 2

    @Enumerated(STRING)
    private UserRole role;                    // 회원 권한

    // 문자인증 기능 추가....고민

    // https://naosmall.kr/member/join.html 개인정보/이용약관등 내용 참조
    @Column(name = "agree_privacy")
    private boolean agreePrivacy;            // 개인정보 수집 동의

    @Column(name = "agree_Service")
    private boolean agreeService;            // 이용약관 동의

    @Column(name = "agree_sms")
    private boolean agreeSms;                // sms 수신 동의

    @Column(name = "agree_email")
    private boolean agreeEmail;              // email 수신 동의

//    private String agreeService;             // 이용약관 동의   https://www.shilladfs.com/estore/kr/ko/signup/consent/terms/popup?consent_type=terms1

//    private String checkAgree2;             // 개인정보 수집 이용동의 https://www.shilladfs.com/estore/kr/ko/signup/consent/terms/popup?consent_type=terms2

    @Column(name = "created_date")
    private LocalDateTime createdDate;      // 등록일

    @Column(name = "last_login_date")
    private LocalDateTime lastLoginDate;    // 마지막 로그인

    @PrePersist
    public void createDate() {
        this.createdDate = LocalDateTime.now();
    }

    // 회원을 가입 처리하기
    public void createAccount(SignupForm signupForm, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.email = signupForm.getEmail();
        this.agreePrivacy = signupForm.isAgreePrivacy();
        this.agreeService = signupForm.isAgreeService();
        this.password = bCryptPasswordEncoder.encode(signupForm.getRePassword());
    }
}
