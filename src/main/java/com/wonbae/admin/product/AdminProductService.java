package com.wonbae.admin.product;

import com.wonbae.admin.product.form.CategoryForm;
import com.wonbae.admin.querySet.AdminProductCategoryQueryService;
import com.wonbae.common.ResponseMessage;
import com.wonbae.domain.Category;
import com.wonbae.handler.frontHandler.exception.AlertScriptException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.*;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AdminProductService {
    private final AdminProductCategoryQueryService adminProductCategoryQueryService;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    // 카테고리 목록 가져오기
    public List<CategoryForm> selectCategoryList() {
        // 카테고리 목록 가져오기
        List<CategoryForm> fetchCategoryList = adminProductCategoryQueryService.selectAllCategoryList();
        return fetchCategoryList;
    }

    // 1차 카테고리 등록/수정 하기
    public void createMainCategory(CategoryForm categoryForm) {
        // 카테고리 등록하기
        if (categoryForm.getId() == null) {
            createOneDepthCategory(categoryForm);
        }
        // 카테고리 수정하기
        if (categoryForm.getId() != null) {
            updateOneDepthCategory(categoryForm);
        }
    }

    private void createOneDepthCategory(CategoryForm categoryForm) {
        // 마지막으로 등록된 부모 카테고리 정보를 가져와서 100을 더해준다.
        CategoryForm categoryInfo = adminProductCategoryQueryService.selectLastCateParentCode();
        Long isCategoryInfo = null;
        if (categoryInfo != null) {
            isCategoryInfo = categoryInfo.getId();
        }

        categoryForm.setCateParentCode(isCategoryInfo == null ? 100 : categoryInfo.getCateParentCode() + 100);     // 마지막 등록된 부모 카테고리에 100을 더한다.
        categoryForm.setCateCode(isCategoryInfo == null ? 100 : categoryInfo.getCateParentCode() + 100);                 // 마지막 등록된 카테고리 코드에 100을 더한다.
        categoryForm.setCateOrder(isCategoryInfo == null ? 1 : categoryInfo.getCateOrder() + 1);                          // 마지막 등록된 카테고리 정렬값에 1을 더한다.

        Category createCategory = modelMapper.map(categoryForm, Category.class);

        categoryRepository.save(createCategory);
    }

    private void updateOneDepthCategory(CategoryForm categoryForm) {
        Category category = categoryRepository.findById(categoryForm.getId()).orElseThrow(() -> new EntityNotFoundException());
        category.updateCategoryInfo(categoryForm);
    }

    // 카테고리 삭제하기
    public void removeCategory(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new AlertScriptException(HttpStatus.CONFLICT, ResponseMessage.NOT_FOUND_CATEGORY, null));

        // 1차 카테고리일 경우 하위 카테고리가 있으면 삭제 안된다.
        Long subCateCnt = adminProductCategoryQueryService.selectSubCategoryList(category);
        if ((category.getCateCode() == category.getCateParentCode()) && subCateCnt > 1) {
            Map<String, Object> map = new HashMap<>();
            map.put("cnt", subCateCnt);
            throw new AlertScriptException(HttpStatus.CONFLICT, ResponseMessage.FIRST_CATEGORY_NOT_REMOVE_SUB_CATEGORY, map);
        }

        categoryRepository.delete(category);

    }

    // 하위로 등록할 카테고리의 상위 카테고리 정보 가져오기
    public CategoryForm selectMainCategory(CategoryForm categoryForm) {
        return adminProductCategoryQueryService.selectMainCategoryInfo(categoryForm);
    }

    // 2차 카테고리 등록하기
    public void createSubCategory(CategoryForm categoryForm) {
        Category selectCategory = categoryRepository.findById(categoryForm.getId()).orElseThrow(() -> new AlertScriptException(HttpStatus.CONFLICT, ResponseMessage.NOT_FOUND_CATEGORY, null));
        CategoryForm selectCategoryInfo = adminProductCategoryQueryService.selectLastCateCode(selectCategory);

        Category category = new Category();
        if (selectCategoryInfo == null) {
            selectCategoryInfo = new CategoryForm();

            selectCategoryInfo.setCateCode(selectCategory.getCateCode());
            selectCategoryInfo.setCateParentCode(selectCategory.getCateParentCode());
            selectCategoryInfo.setCateOrder(0);
        }

        category.createSubCategoryInfo(categoryForm, selectCategoryInfo);

        categoryRepository.save(category);
    }
}
