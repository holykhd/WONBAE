package com.wonbae.admin.main;

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
public class AdminMainController {
    /**
     * 메인
     */
    @GetMapping("")
    public String adminMain() {
        return "admin/index";
    }

}