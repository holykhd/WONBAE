package com.wonbae.admin.community;

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
@RequestMapping("/admin/community")
public class AdminCommunityController {

    /**
     * 게시판 관리는 나중에 추가작업 예정
     */


    /**
     * 공지사항 게시판 목록
     */
    @GetMapping("/noticeList")
    public String noticeList() {
        return "admin/community/noticeList";
    }

    /**
     * 공지사항 게시판 검색
     */
    @GetMapping("/noticeSearch")
    public String noticeSearch() {
        return "admin/community/noticeList";
    }

    /**
     * 공지사항 게시판 상세
     */
    @GetMapping("/noticeDetail")
    public String noticeDetail() {
        return "admin/community/noticeDetail";
    }

    /**
     * 공지사항 게시판 등록 폼
     */
    @GetMapping("/noticeEdit")
    public String noticeEditForm() {
        return "admin/community/noticeEdit";
    }

    /**
     * 공지사항 게시판 등록
     */
    @PostMapping("/noticeEdit")
    public String noticeEdit() {
        return "redirect:/admin/community/noticeList";
    }

    /**
     * 공지사항 게시판 삭제
     */
    @DeleteMapping("/noticeRemove")
    public String noticeRemove() {
        return "redirect:/admin/community/noticeList";
    }

    /**
     * 개인 게시판 목록
     */
    @GetMapping("/privateList")
    public String privateList() {
        return "admin/community/privateList";
    }

    /**
     * 개인 게시판 검색
     */
    @GetMapping("/privateSearch")
    public String privateSearch() {
        return "admin/community/privateList";
    }

    /**
     * 개인 게시판 상세
     */
    @GetMapping("/privateDetail")
    public String privateDetail() {
        return "admin/community/privateDetail";
    }

    /**
     * 개인 게시판 등록 폼
     */
    @GetMapping("/privateEdit")
    public String privateEditForm() {
        return "admin/community/privateEdit";
    }

    /**
     * 개인 게시판 등록
     */
    @PostMapping("/privateEdit")
    public String privateEdit() {
        return "redirect:/admin/community/privateList";
    }

    /**
     * 개인 게시판 삭제
     */
    @DeleteMapping("/privateRemove")
    public String privateRemove() {
        return "redirect:/admin/community/privateList";
    }


    /**
     * Q&A 게시판 목록
     */
    @GetMapping("/qnaList")
    public String qnaList() {
        return "admin/community/qnaList";
    }

    /**
     * Q&A 게시판 검색
     */
    @GetMapping("/qnaSearch")
    public String qnaSearch() {
        return "admin/community/qnaList";
    }

    /**
     * Q&A 게시판 상세
     */
    @GetMapping("/qnaDetail")
    public String qnaDetail() {
        return "admin/community/qnaDetail";
    }

    /**
     * Q&A 게시판 등록 폼
     */
    @GetMapping("/qnaEdit")
    public String qnaEditForm() {
        return "admin/community/qnaEdit";
    }

    /**
     * Q&A 게시판 등록
     */
    @PostMapping("/qnaEdit")
    public String qnaEdit() {
        return "redirect:/admin/community/qnaList";
    }

    /**
     * Q&A 게시판 삭제
     */
    @DeleteMapping("/qnaRemove")
    public String qnaRemove() {
        return "redirect:/admin/community/qnaList";
    }


    /**
     * FAQ 게시판 목록
     */
    @GetMapping("/faqList")
    public String faqList() {
        return "admin/community/faqList";
    }

    /**
     * FAQ 게시판 검색
     */
    @GetMapping("/faqSearch")
    public String faqSearch() {
        return "admin/community/faqList";
    }

    /**
     * FAQ 게시판 상세
     */
    @GetMapping("/faqDetail")
    public String faqDetail() {
        return "admin/community/faqDetail";
    }

    /**
     * FAQ 게시판 등록 폼
     */
    @GetMapping("/faqEdit")
    public String faqEditForm() {
        return "admin/community/faqEdit";
    }

    /**
     * FAQ 게시판 등록
     */
    @PostMapping("/faqEdit")
    public String faqEdit() {
        return "redirect:/admin/community/faqList";
    }

    /**
     * FAQ 게시판 삭제
     */
    @DeleteMapping("/faqRemove")
    public String faqRemove() {
        return "redirect:/admin/community/faqList";
    }


    /**
     * 제휴/입점 게시판 목록
     */
    @GetMapping("/storeList")
    public String storeList() {
        return "admin/community/storeList";
    }

    /**
     * 제휴/입점 게시판 검색
     */
    @GetMapping("/storeSearch")
    public String storeSearch() {
        return "admin/community/storeList";
    }

    /**
     * 제휴/입점 게시판 상세
     */
    @GetMapping("/storeDetail")
    public String storeDetail() {
        return "admin/community/storeDetail";
    }

    /**
     * 제휴/입점 게시판 등록 폼
     */
    @GetMapping("/storeEdit")
    public String storeEditForm() {
        return "admin/community/storeEdit";
    }

    /**
     * 제휴/입점 게시판 등록
     */
    @PostMapping("/storeEdit")
    public String storeEdit() {
        return "redirect:/admin/community/storeList";
    }

    /**
     * 제휴/입점 게시판 삭제
     */
    @DeleteMapping("/storeRemove")
    public String storeRemove() {
        return "redirect:/admin/community/storeList";
    }


    /**
     * 마트 등록요청 게시판 목록
     */
    @GetMapping("/martRegisterList")
    public String martRegisterList() {
        return "admin/community/martRegisterList";
    }

    /**
     * 마트 등록요청 게시판 검색
     */
    @GetMapping("/martRegisterSearch")
    public String martRegisterSearch() {
        return "admin/community/martRegisterList";
    }

    /**
     * 마트 등록요청 게시판 상세
     */
    @GetMapping("/martRegisterDetail")
    public String martRegisterDetail() {
        return "admin/community/martRegisterDetail";
    }

    /**
     * 마트 등록요청 게시판 등록 폼
     */
    @GetMapping("/martRegisterEdit")
    public String martRegisterEditForm() {
        return "admin/community/martRegisterEdit";
    }

    /**
     * 마트 등록요청 게시판 등록
     */
    @PostMapping("/martRegisterEdit")
    public String martRegisterEdit() {
        return "redirect:/admin/community/martRegisterList";
    }

    /**
     * 마트 등록요청 게시판 삭제
     */
    @DeleteMapping("/martRegisterRemove")
    public String martRegisterRemove() {
        return "redirect:/admin/community/martRegisterList";
    }

}
