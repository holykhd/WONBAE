package com.wonbae.admin.product;

import com.wonbae.admin.product.form.CategoryForm;
import com.wonbae.admin.product.form.GoodsForm;
import com.wonbae.common.ResponseMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/product")
public class AdminProductController {
    private final AdminProductService adminProductService;

    /**
     * 카테고리 목록
     */
    @GetMapping("/categoryList")
    public String categoryList(Model model) {
        List<CategoryForm> categoryList = adminProductService.selectCategoryList();
        model.addAttribute(new CategoryForm());
        model.addAttribute("list", categoryList);
        return "admin/product/categoryList";
    }

    /**
     * 카테고리 등록/수정 폼
     */
    @GetMapping("/categoryEdit/{id}")
    public String categoryEditForm(Model model, CategoryForm categoryForm) {
        // 등록일 경우
        if (categoryForm.getId() == null) {
            model.addAttribute(new CategoryForm());
        }
        // 수정일 경우
        if (categoryForm.getId() != null) {
            CategoryForm category = adminProductService.selectMainCategory(categoryForm);
            model.addAttribute("categoryForm", category);
        }
        return "admin/product/categoryEdit";
    }

    /**
     * 카테고리 등록/수정
     */
    @PostMapping("/categoryEdit")
    public String categoryEdit(RedirectAttributes redirectAttributes, @Valid CategoryForm categoryForm, Errors errors) {
        if (errors.hasErrors()) {
            // 카테고리명을 입력하지 않을경우 오류처리
            redirectAttributes.addFlashAttribute("message", ResponseMessage.NOT_BLANK_CATEGORY);
            return "redirect:/admin/product/categoryList";
        }
        adminProductService.createMainCategory(categoryForm);
        return "redirect:/admin/product/categoryList";
    }

    /**
     * 하위 카테고리 등록 폼
     */
    @GetMapping("/subCategoryAdd/{id}")
    public String categoryAddForm(Model model, CategoryForm categoryForm) {
        CategoryForm categoryInfo = adminProductService.selectMainCategory(categoryForm);
        model.addAttribute("categoryForm", categoryForm);
        model.addAttribute("category", categoryInfo);
        return "admin/product/subCategoryAdd";
    }

    /**
     * 하위 카테고리 등록
     */
    @PostMapping("/subCategoryAdd")
    public String categoryAdd(Model model, CategoryForm categoryForm) {
        adminProductService.createSubCategory(categoryForm);
        return "redirect:/admin/product/categoryList";
    }

    /**
     * 하위 카테고리 수정 폼
     */
    @GetMapping("/subCategoryEdit/{id}")
    public String subCategoryEditForm(Model model, CategoryForm categoryForm) {
        model.addAttribute("categoryForm", categoryForm);
        return "admin/product/subCategoryEdit";
    }

    /**
     * 하위 카테고리 수정
     */
    @PostMapping("/subCategoryEdit/{id}")
    public String subCategoryEdit(CategoryForm categoryForm) {
        return "redirect:/admin/product/categoryList";
    }

    /**
     * 카테고리 삭제
     */
    @DeleteMapping("/categoryRemove/{id}")
    public String categoryRemove(@PathVariable Long id) {
        adminProductService.removeCategory(id);
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
    public String goodsEditForm(GoodsForm goodsForm) {
        // 카테고리 정보 가져오기
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
