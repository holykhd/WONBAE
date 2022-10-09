package com.wonbae.admin.martStore;

import com.wonbae.admin.account.form.AccountForm;
import com.wonbae.domain.Account;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/martStore")
public class AdminMartStoreController {
    private final AdminMartStoreService adminMartStoreService;

    /**
     * 마트 관리자 목록
     */
    @GetMapping("/martStoreManagerList")
    public String martStoreManagerList(Model model, @PageableDefault(size = 10, sort = "created_date", direction = Sort.Direction.DESC) Pageable pageable) {
        PageImpl<AccountForm> accountList = adminMartStoreService.martStoreManagerListProcessor(pageable);
        model.addAttribute("accountList", accountList);
        return "/admin/martStore/martStoreManagerList";
    }

    /**
     * 마트 관리자 상세
     */
    @GetMapping("/martStoreManagerDetail/{id}")
    public String martStoreManagerDetail(@PathVariable long id, Model model) {
        Account account = adminMartStoreService.selectAccountDetailProcessor(id);
        model.addAttribute("account", account);
        return "/admin/martStore/martStoreManagerDetail";
    }

    /**
     * 관리자 등록 폼
     */
    @GetMapping("/martStoreManagerEdit")
    public String martStoreManagerEditForm() {
        return "/admin/martStore/martStoreManagerEdit";
    }

    /**
     * 마트 관리자 등록
     */
    @PostMapping("/martStoreManagerEdit")
    public String martStoreManagerEdit() {
        return "redirect:/admin/martStore/martStoreManagerList";
    }


    /**
     * 마트 관리자 수정
     */

    /**
     * 마트 관리자 삭제
     */
    @GetMapping("/martStoreManagerRemove")
    public String martStoreManagerRemove() {
        return "/admin/martStore/martStoreManagerRemove";
    }


    /**
     * 입점 마트 목록
     */
    @GetMapping("/martStoreList")
    public String martStoreList() {
        return "/admin/martStore/martStoreList";
    }

    /**
     * 입점 마트 등록 폼
     */
    @GetMapping("/martStoreEdit")
    public String martStoreEditForm() {
        return "/admin/martStore/martStoreEdit";
    }

    /**
     * 입점 마트 등록
     */
    @PostMapping("/martStoreEdit")
    public String martStoreEdit() {
        return "redirect:/admin/martStore/martStoreList";
    }

    /**
     * 입점 마트 상세
     */
    @GetMapping("/martStoreDetail")
    public String martStoreDetail() {
        return "/admin/martStore/martStoreDetail";
    }

    /**
     * 입점 마트 수정
     */

    /**
     * 입점 마트 삭제
     */
    @GetMapping("/martStoreRemove")
    public String martStoreRemove() {
        return "/admin/martStore/martStoreRemove";
    }


    /**
     * 마트 주문 목록
     */
    @GetMapping("/martOrderList")
    public String martOrderList() {
        return "/admin/martStore/martOrderList";
    }

    /**
     * 마트 주문 등록 폼
     */
    @GetMapping("/martOrderEdit")
    public String martOrderEditForm() {
        return "/admin/martStore/martOrderEdit";
    }

    /**
     * 마트 주문 등록
     */
    @PostMapping("/martOrderEdit")
    public String martOrderEdit() {
        return "redirect:/admin/martStore/martOrderList";
    }

    /**
     * 마트 주문 상세
     */
    @GetMapping("/martOrderDetail")
    public String martOrderDetail() {
        return "/admin/martStore/martOrderDetail";
    }

    /**
     * 마트 주문 수정
     */

    /**
     * 마트 주문 삭제
     */
    @GetMapping("/martOrderRemove")
    public String martOrderRemove() {
        return "/admin/martStore/martOrderRemove";
    }


    /**
     * 마트 매출 목록
     */
    @GetMapping("/martSalesList")
    public String martSalesList() {
        return "/admin/martStore/martSalesList";
    }

    /**
     * 마트 매출 등록 폼
     */
    @GetMapping("/martSalesEdit")
    public String martSalesEditForm() {
        return "/admin/martStore/martSalesEdit";
    }

    /**
     * 마트 매출 등록
     */
    @PostMapping("/martSalesEdit")
    public String martSalesEdit() {
        return "redirect:/admin/martStore/martSalesList";
    }

    /**
     * 마트 매출 상세
     */
    @GetMapping("/martSalesDetail")
    public String martSalesDetail() {
        return "/admin/martStore/martSalesDetail";
    }

    /**
     * 마트 매출 수정
     */

    /**
     * 마트 매출 삭제
     */
    @GetMapping("/martSalesRemove")
    public String martSalesRemove() {
        return "/admin/martStore/martSalesRemove";
    }


    /**
     * 마트 코드 목록
     */
    @GetMapping("/martCodeList")
    public String martCodeList() {
        return "/admin/martStore/martCodeList";
    }

    /**
     * 마트 코드 등록 폼
     */
    @GetMapping("/martCodeEdit")
    public String martCodeEditForm() {
        return "/admin/martStore/martCodeEdit";
    }

    /**
     * 마트 코드 등록
     */
    @PostMapping("/martCodeEdit")
    public String martCodeEdit() {
        return "redirect:/admin/martStore/martCodeList";
    }

    /**
     * 마트 코드 상세
     */
    @GetMapping("/martCodeDetail")
    public String martCodeDetail() {
        return "/admin/martStore/martCodeDetail";
    }

    /**
     * 마트 코드 수정
     */

    /**
     * 마트 코드 삭제
     */
    @GetMapping("/martCodeRemove")
    public String martCodeRemove() {
        return "/admin/martStore/martCodeRemove";
    }

}
