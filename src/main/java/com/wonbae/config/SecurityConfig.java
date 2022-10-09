package com.wonbae.config;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }


    // https://mangkyu.tistory.com/77
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(
                        "/user/**"
                        , "/image/**"
                )
                // /user, /image에 대해서는 로그인이 필요함.
                .authenticated()
                // /admin 요청은 ROLE_ADMIN 권한만 접근할 수 있는 페이지임.
                .antMatchers("/admin").hasRole("ADMIN")
                .anyRequest()
                .permitAll()
                .and()
                // 로그인을 할 경우
                .formLogin()
                // 로그인 페이지를 아래의 주소로 사용함.
                .loginPage("/auth/signin")
                // 로그인 프로세스가이 실행됨
                .loginProcessingUrl("/auth/signin")
                // 로그인 성공 시 이동하는 페이지
                .defaultSuccessUrl("/")
                // username을 email로 사용함.
                .usernameParameter("email")
                .and().build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("/main");
    }
}
