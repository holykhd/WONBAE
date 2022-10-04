package com.wonbae.admin.ad;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/ad")
public class AdminAdController {

    /**
     * 메인 배너 관리 목록
     */
    @GetMapping("/mainBannerList")
    public String mainBannerList() {
        return "/admin/ad/mainBannerList";
    }

    /**
     * 메인 배너 관리 등록 폼
     */
    @GetMapping("/mainBannerEdit")
    public String mainBannerEditForm() {
        return "/admin/ad/mainBannerEdit";
    }

    /**
     * 메인 배너 관리 등록
     */
    @PostMapping("/mainBannerEdit")
    public String mainBannerEdit() {
        return "redirect:/admin/ad/mainBannerList";
    }

    /**
     * 메인 배너 관리 상세
     */
    @GetMapping("/mainBannerDetail")
    public String mainBannerDetail() {
        return "/admin/ad/mainBannerDetail";
    }

    /**
     * 메인 배너 관리 수정
     */

    /**
     * 메인 배너 관리 삭제
     */
    @GetMapping("/mainBannerRemove")
    public String mainBannerRemove() {
        return "/admin/ad/mainBannerRemove";
    }


    /**
     * 서브 배너 관리 목록
     */
    @GetMapping("/subBannerList")
    public String subBannerList() {
        return "/admin/ad/subBannerList";
    }

    /**
     * 서브 배너 관리 등록 폼
     */
    @GetMapping("/subBannerEdit")
    public String subBannerEditForm() {
        return "/admin/ad/subBannerEdit";
    }

    /**
     * 서브 배너 관리 등록
     */
    @PostMapping("/subBannerEdit")
    public String subBannerEdit() {
        return "redirect:/admin/ad/subBannerList";
    }

    /**
     * 서브 배너 관리 상세
     */
    @GetMapping("/subBannerDetail")
    public String subBannerDetail() {
        return "/admin/ad/subBannerDetail";
    }

    /**
     * 서브 배너 관리 수정
     */

    /**
     * 서브 배너 관리 삭제
     */
    @GetMapping("/subBannerRemove")
    public String subBannerRemove() {
        return "/admin/ad/subBannerRemove";
    }


    /**
     * 팝업 관리 목록
     */
    @GetMapping("/popupList")
    public String popupList() {
        return "/admin/ad/popupList";
    }

    /**
     * 팝업 관리 등록 폼
     */
    @GetMapping("/popupEdit")
    public String popupEditForm() {
        return "/admin/ad/popupEdit";
    }

    /**
     * 팝업 관리 등록
     */
    @PostMapping("/popupEdit")
    public String popupEdit() {
        return "redirect:/admin/ad/popupList";
    }

    /**
     * 팝업 관리 상세
     */
    @GetMapping("/popupDetail")
    public String popupDetail() {
        return "/admin/ad/popupDetail";
    }

    /**
     * 팝업 관리 수정
     */

    /**
     * 팝업 관리 삭제
     */
    @GetMapping("/popupRemove")
    public String popupRemove() {
        return "/admin/ad/popupRemove";
    }
}