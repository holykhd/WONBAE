package com.wonbae.admin.account;

import com.wonbae.domain.Account;
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
@RequestMapping("/admin/account")
public class AdminAccountController {
    /**
     *  참고 사이트
     *  http://tplusv50.onedaynet.co.kr/totalAdmin/_coupon.list.php?
     */

    /**
     * 회원 목록
     */
    @GetMapping("/accountList")
    public String accountList() {
        return "admin/account/accountList";
    }

    /**
     * 회원 상세
     */
    @GetMapping("/accountDetail")
    public String accountDetail() {
        return "admin/account/accountDetail";
    }

    /**
     * 회원 등록 폼
     */
    @GetMapping("/accountEdit")
    public String accountEditForm() {
        return "admin/account/accountEdit";
    }

    /**
     * 회원 등록
     */
    @PostMapping("/accountList")
    public String accountEdit() {
        return "redirect:admin/account/accountList";
    }


    /**
     * 회원 수정 폼
     */


    /**
     * 회원 수정
     */

    /**
     * 회원 삭제
     */
    @DeleteMapping("/accountRemove")
    public String accountRemove() {
        return "";
    }

    /**
     * 회원 검색
     */
    @GetMapping("/accountSearch")
    public String accountSearch() {
        return "admin/account/accountList";
    }


    /**
     * 휴면 회원 목록
     */
    @GetMapping("/restAccountList")
    public String restAccountList() {
        return "admin/account/restAccountList";
    }

    /**
     * 휴면회원 상세
     */
    @GetMapping("/restAccountDetail")
    public String restAccountDetail() {
        return "admin/account/restAccountDetail";
    }

    /**
     * 탈퇴회원 목록
     */
    @GetMapping("/leaveAccountList")
    public String leaveAccountList() {
        return "admin/account/leaveAccountList";
    }

    /**
     * 탈퇴회원 상세
     */
    @GetMapping("/leaveAccountDetail")
    public String leaveAccountDetail() {
        return "admin/account/leaveAccountDetail";
    }

    /**
     * 포인트 관리 목록
     */
    @GetMapping("/pointList")
    public String pointList() {
        return "admin/account/pointList";
    }

    /**
     * 포인트 관리 상세
     */
    @GetMapping("/pointDetail")
    public String pointDetail() {
        return "admin/account/pointDetail";
    }

    /**
     * 포인트 등록 폼
     */
    @GetMapping("/pointEdit")
    public String pointEditForm() {
        return "admin/account/pointEditForm";
    }

    /**
     * 포인트 등록
     */
    @PostMapping("/pointEdit")
    public String pointEdit() {
        return "redirect:admin/account/pointList";
    }

    /**
     * 포인트 삭제
     */
    @DeleteMapping("/pointDelete")
    public String pointDelete() {
        return "redirect:admin/account/pointList";
    }

    /**
     * 쿠폰 목록
     */
    @GetMapping("/couponList")
    public String couponList() {
        return "admin/account/couponList";
    }

    /**
     * 쿠폰 등록 폼
     */
    @GetMapping("/couponEdit")
    public String couponEditForm() {
        return "admin/account/couponEdit";
    }

    /**
     * 쿠폰 등록
     */
    @PostMapping("/couponEdit")
    public String couponEdit() {
        return "redirect:admin/coupon/couponList";
    }

    /**
     * 쿠폰 상세
     */
    @GetMapping("/couponDetail")
    public String couponDetail() {
        return "admin/account/couponDetail";
    }

    /**
     * 쿠폰 삭제
     */
    @DeleteMapping("/couponRemove")
    public String couponRemove() {
        return "redirect:admin/coupon/couponList";
    }
}
