package com.wonbae.admin.site;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/site")
public class AdminSiteController {

    /**
     * 쇼핑몰 관리자 관리 목록
     */
    @GetMapping("/siteList")
    public String siteList() {
        return "admin/site/siteList";
    }

    /**
     * 쇼핑몰 관리자 검색
     */

    /**
     * 쇼핑몰 관리자 등록 폼
     */
    @GetMapping("/siteEdit")
    public String siteEditForm() {
        return "admin/site/siteEdit";
    }

    /**
     * 쇼핑몰 관리자 등록
     */
    @PostMapping("/siteEdit")
    public String siteEdit() {
        return "redirect:admin/site/siteList";
    }

    /**
     * 쇼핑몰 관리자 수정 폼
     */

    /**
     * 쇼핑몰 관리자 수정
     */

    /**
     * 쇼핑몰 관리자 삭제
     */

    /**
     * 관리페이지 메뉴 관리 목록
     */
    @GetMapping("/menuList")
    public String menuList() {
        return "admin/site/menuList";
    }

    /**
     * 관리자별 메뉴 설정
     */
    @GetMapping("/menuEdit")
    public String menuEditForm() {
        return "admin/site/menuEdit";
    }

    /**
     * 관리자별 메뉴 설정
     */
    @PostMapping("/menuEdit")
    public String menuEdit() {
        return "redirect:admin/site/menuList";
    }

    /**
     * 약관 및 정책 설정
     */
    @GetMapping("/agreeEdit")
    public String agreeEditForm() {
        return "admin/site/agreeEdit";
    }

    /**
     * 약관 및 정책 설정
     */
    @PostMapping("/agreeEdit")
    public String agreeEdit() {
        return "redirect:admin/site/agreeEdit";
    }
}
