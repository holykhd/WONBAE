package com.wonbae.admin.shopStatistics;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/shopStatistics")
public class AdminShopStatisticsController {

    /**
     * 지역별 통계 목록
     */
    @GetMapping("/localList")
    public String localList() {
        return "/admin/shopStatistics/localList";
    }

    /**
     * 지역별 통계 등록 폼
     */
    @GetMapping("/localEdit")
    public String localEditForm() {
        return "/admin/shopStatistics/localEdit";
    }

    /**
     * 지역별 통계 등록
     */
    @PostMapping("/localEdit")
    public String localEdit() {
        return "redirect:/admin/shopStatistics/localList";
    }

    /**
     * 지역별 통계 상세
     */
    @GetMapping("/localDetail")
    public String localDetail() {
        return "/admin/shopStatistics/localDetail";
    }

    /**
     * 지역별 통계 수정
     */

    /**
     * 지역별 통계 삭제
     */
    @GetMapping("/localRemove")
    public String localRemove() {
        return "/admin/shopStatistics/localRemove";
    }

    /**
     * 장바구니별 통계 목록
     */
    @GetMapping("/cartList")
    public String cartList() {
        return "/admin/shopStatistics/cartList";
    }

    /**
     * 장바구니별 통계 등록 폼
     */
    @GetMapping("/cartEdit")
    public String cartEditForm() {
        return "/admin/shopStatistics/cartEdit";
    }

    /**
     * 장바구니별 통계 등록
     */
    @PostMapping("/cartEdit")
    public String cartEdit() {
        return "redirect:/admin/shopStatistics/cartList";
    }

    /**
     * 장바구니별 통계 상세
     */
    @GetMapping("/cartDetail")
    public String cartDetail() {
        return "/admin/shopStatistics/cartDetail";
    }

    /**
     * 장바구니별 통계 수정
     */

    /**
     * 장바구니별 통계 삭제
     */
    @GetMapping("/cartRemove")
    public String cartRemove() {
        return "/admin/shopStatistics/cartRemove";
    }


    /**
     * 위시리스트 목록
     */
    @GetMapping("/wishList")
    public String wishList() {
        return "/admin/shopStatistics/wishList";
    }

    /**
     * 위시리스트 등록 폼
     */
    @GetMapping("/wishEdit")
    public String wishEditForm() {
        return "/admin/shopStatistics/wishEdit";
    }

    /**
     * 위시리스트 등록
     */
    @PostMapping("/wishEdit")
    public String wishEdit() {
        return "redirect:/admin/shopStatistics/wishList";
    }

    /**
     * 위시리스트 상세
     */
    @GetMapping("/wishDetail")
    public String wishDetail() {
        return "/admin/shopStatistics/wishDetail";
    }

    /**
     * 위시리스트 수정
     */

    /**
     * 위시리스트 삭제
     */
    @GetMapping("/wishRemove")
    public String wishRemove() {
        return "/admin/shopStatistics/wishRemove";
    }


    /**
     * 검색어 통계 목록
     */
    @GetMapping("/searchWordList")
    public String searchWordList() {
        return "/admin/shopStatistics/searchWordList";
    }

    /**
     * 검색어 통계 등록 폼
     */
    @GetMapping("/searchWordEdit")
    public String searchWordEditForm() {
        return "/admin/shopStatistics/searchWordEdit";
    }

    /**
     * 검색어 통계 등록
     */
    @PostMapping("/searchWordEdit")
    public String searchWordEdit() {
        return "redirect:/admin/shopStatistics/searchWordList";
    }

    /**
     * 검색어 통계 상세
     */
    @GetMapping("/searchWordDetail")
    public String searchWordDetail() {
        return "/admin/shopStatistics/searchWordDetail";
    }

    /**
     * 검색어 통계 수정
     */

    /**
     * 검색어 통계 삭제
     */
    @GetMapping("/searchWordRemove")
    public String searchWordRemove() {
        return "/admin/shopStatistics/searchWordRemove";
    }


    /**
     * 상품 후기 목록
     */
    @GetMapping("/reviewList")
    public String reviewList() {
        return "/admin/shopStatistics/reviewList";
    }

    /**
     * 상품 후기 등록 폼
     */
    @GetMapping("/reviewEdit")
    public String reviewEditForm() {
        return "/admin/shopStatistics/reviewEdit";
    }

    /**
     * 상품 후기 등록
     */
    @PostMapping("/reviewEdit")
    public String reviewEdit() {
        return "redirect:/admin/shopStatistics/reviewList";
    }

    /**
     * 상품 후기 상세
     */
    @GetMapping("/reviewDetail")
    public String reviewDetail() {
        return "/admin/shopStatistics/reviewDetail";
    }

    /**
     * 상품 후기 수정
     */

    /**
     * 상품 후기 삭제
     */
    @GetMapping("/reviewRemove")
    public String reviewRemove() {
        return "/admin/shopStatistics/reviewRemove";
    }


    /**
     * 재입고 알림 목록
     */
    @GetMapping("/alarmList")
    public String alarmList() {
        return "/admin/shopStatistics/alarmList";
    }

    /**
     * 재입고 알림 등록 폼
     */
    @GetMapping("/alarmEdit")
    public String alarmEditForm() {
        return "/admin/shopStatistics/alarmEdit";
    }

    /**
     * 재입고 알림 등록
     */
    @PostMapping("/alarmEdit")
    public String alarmEdit() {
        return "redirect:/admin/shopStatistics/alarmList";
    }

    /**
     * 재입고 알림 상세
     */
    @GetMapping("/alarmDetail")
    public String alarmDetail() {
        return "/admin/shopStatistics/alarmDetail";
    }

    /**
     * 재입고 알림 수정
     */

    /**
     * 재입고 알림 삭제
     */
    @GetMapping("/alarmRemove")
    public String alarmRemove() {
        return "/admin/shopStatistics/alarmRemove";
    }
}