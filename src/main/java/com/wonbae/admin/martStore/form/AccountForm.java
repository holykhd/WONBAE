package com.wonbae.admin.martStore.form;

import com.wonbae.domain.enumType.GenderRole;
import com.wonbae.domain.enumType.UserRole;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
public class AccountForm {
    private Long id;

    @Email
    private String email;                   // 회원 이메일

    @NotBlank
    private String name;                    // 회원 이름

    @NotBlank
    private String password;                // 비밀번호

    private String phone;                   // 전화번호

    private GenderRole gender;              // 성별

    private String postCode;                // 우편번호

    private String addr1;                   // 주소 1

    private String addr2;                   // 주소 2

    private String firstFavStore;           // 주 이용 마트명 1

    private String secondFavStore;          // 주 이용 마트명 2

    private String city;                    // 시/도

    private String guGun;                   // 구/군

    private String dong;                    // 동

    private String aptName;                 // 아파트명

    private String dongHo;                  // 동/호수

    @NotBlank
    private UserRole role;                    // 회원 권한

    private boolean agreePrivacy;            // 개인정보 수집 동의

    private boolean agreeService;            // 이용약관 동의

    private boolean agreeSms;                // sms 수신 동의

    private boolean agreeEmail;              // email 수신 동의

    private LocalDateTime createdDate;      // 등록일
}