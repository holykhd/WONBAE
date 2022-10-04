package com.wonbae.admin.product;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/product")
public class AdminProductController {

    /**
     * 카테고리 목록
     */
    @GetMapping("/categoryList")
    public String categoryList() {
        return "admin/product/categoryList";
    }

    /**
     * 카테고리 등록 폼
     */
    @GetMapping("/categoryEdit")
    public String categoryEditForm() {
        return "admin/product/categoryEdit";
    }

    /**
     * 카테고리 등록
     */
    @PostMapping("/categoryEdit")
    public String categoryEdit() {
        return "redirect:/admin/product/categoryList";
    }

    /**
     * 카테고리 수정 폼
     */

    /**
     * 카테고리 수정
     */

    /**
     * 카테고리 삭제
     */
    @DeleteMapping("/categoryRemove")
    public String categoryRemove() {
        return "redirect:/admin/product/categoryList";
    }

    /**
     * 상품 목록
     */
    @GetMapping("/goodsList")
    public String goodsList() {
        return "admin/product/goodsList";
    }

    /**
     * 상품 검색
     */
    @GetMapping("/goodsSearch")
    public String goodsSearch() {
        return "admin/product/goodsSearch";
    }

    /**
     * 상품 상세
     */
    @GetMapping("/goodsDetail")
    public String goodsDetail() {
        return "admin/product/goodsDetail";
    }

    /**
     * 상품 등록 폼
     */
    @GetMapping("/goodsEdit")
    public String goodsEditForm() {
        return "admin/product/goodsEdit";
    }


    /**
     * 상품 등록
     */
    @PostMapping("/goodsEdit")
    public String goodsEdit() {
        return "redirect:admin/product/goodsList";
    }

    /**
     * 상품 수정
     */

    /**
     * 상품 삭제
     */
    @DeleteMapping("/goodsRemove")
    public String goodsRemove() {
        return "redirect:/admin/product/goodsList";
    }

    /**
     * 상품 후기 목록
     */
    @GetMapping("/reviewList")
    public String reviewList() {
        return "admin/product/reviewList";
    }

    /**
     * 상품 후기 검색
     */
    @GetMapping("/reviewSearch")
    public String reviewSearch() {
        return "admin/product/reviewSearch";
    }

    /**
     * 상품 후기 상세
     */
    @GetMapping("/reviewDetail")
    public String reviewDetail() {
        return "admin/product/reviewDetail";
    }

    /**
     * 상품 후기 등록 폼
     */
    @GetMapping("/reviewEdit")
    public String reviewEditForm() {
        return "admin/product/reviewEdit";
    }


    /**
     * 상품 후기 등록
     */
    @PostMapping("/reviewEdit")
    public String reviewEdit() {
        return "redirect:admin/product/reviewList";
    }

    /**
     * 상품 후기 수정
     */

    /**
     * 상품 후기 삭제
     */
    @DeleteMapping("/reviewRemove")
    public String reviewRemove() {
        return "redirect:/admin/product/reviewList";
    }


    /**
     * 상품 문의 목록
     */
    @GetMapping("/goodsQuestionList")
    public String goodsQuestionList() {
        return "admin/product/goodsQuestionList";
    }

    /**
     * 상품 문의 검색
     */
    @GetMapping("/goodsQuestionSearch")
    public String goodsQuestionSearch() {
        return "admin/product/goodsQuestionSearch";
    }

    /**
     * 상품 문의 상세
     */
    @GetMapping("/goodsQuestionDetail")
    public String goodsQuestionDetail() {
        return "admin/product/goodsQuestionDetail";
    }

    /**
     * 상품 문의 등록 폼
     */
    @GetMapping("/goodsQuestionEdit")
    public String goodsQuestionEditForm() {
        return "admin/product/goodsQuestionEdit";
    }


    /**
     * 상품 문의 등록
     */
    @PostMapping("/goodsQuestionEdit")
    public String goodsQuestionEdit() {
        return "redirect:admin/product/goodsQuestionList";
    }

    /**
     * 상품 문의 수정
     */

    /**
     * 상품 문의 삭제
     */
    @DeleteMapping("/goodsQuestionRemove")
    public String goodsQuestionRemove() {
        return "redirect:/admin/product/goodsQuestionList";
    }

}
