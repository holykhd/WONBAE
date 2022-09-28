package com.wonbae.front.auth;

import com.wonbae.domain.Account;
import com.wonbae.front.auth.form.SignupForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class FrontAuthService {
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final AccountRepository accountRepository;

    // 회원 가입을 한다.
    public void createAccountProcessor(SignupForm signupForm) {
        Account account = new Account();
        account.createAccount(signupForm, bCryptPasswordEncoder);
        accountRepository.save(account);
    }
}
