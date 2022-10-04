package com.wonbae.config.auth;

import com.wonbae.domain.Account;
import com.wonbae.front.auth.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PrincipalDetailService implements UserDetailsService {

    private final AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account selectEmail = accountRepository.findByEmail(username);
        log.info("selectEmail = {}", selectEmail.getEmail());
        log.info("selectEmail = {}", selectEmail.getId());
        return null;
    }
}
