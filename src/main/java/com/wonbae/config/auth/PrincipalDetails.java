package com.wonbae.config.auth;

import com.wonbae.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@RequiredArgsConstructor
public class PrincipalDetails implements UserDetails {
    private final Account account;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collection = new ArrayList<>();
        collection.add(() -> {
            return account.getRole();
        });
        return collection;
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }

    @Override
    public String getUsername() {
        return account.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        // 계정이 만료됐는지 체크한다.
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // 계정이 잠겼는지 체크한다.
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // 계정의 비밀번호를 오랬동안 변경하지 않았을 경우
        return true;
    }

    @Override
    public boolean isEnabled() {
        // 계정을 오랫동안 로그인하지 않았을 경우 비활성화됨.
        return true;
    }
}
