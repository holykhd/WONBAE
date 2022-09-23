package com.wonbae.front.auth;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class FrontAuthController {
    private final FrontAuthService frontAuthService;

    @GetMapping("/auth/signup")
    public String singUp() {
        return "/front/auth/signup";
    }
}
