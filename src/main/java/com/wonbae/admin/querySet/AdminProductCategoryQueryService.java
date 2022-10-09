package com.wonbae.admin.querySet;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.wonbae.admin.product.form.CategoryForm;
import com.wonbae.domain.Category;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.wonbae.domain.QCategory.category;

@Slf4j
@Component
@RequiredArgsConstructor
public class AdminProductCategoryQueryService {
    private final JPAQueryFactory queryFactory;

    // 전체 카테고리 가져오기
    public List<CategoryForm> selectAllCategoryList() {
        return queryFactory.select(Projections.bean(CategoryForm.class,
                        category.id,
                        category.cateName,
                        category.cateCode,
                        category.cateParentCode,
                        category.cateOrder
                ))
                .from(category)
                .orderBy(category.cateCode.asc(), category.cateOrder.asc())
                .fetch();
    }

    // 마지막으로 등록된 카테고리 정보 가져오기
    public CategoryForm selectLastCateParentCode() {
        return queryFactory.select(Projections.bean(CategoryForm.class,
                        category.id,
                        category.cateParentCode,
                        category.cateOrder,
                        category.cateCode,
                        category.cateName
                ))
                .from(category)
                .where(category.cateCode.eq(category.cateParentCode))
                .orderBy(category.cateParentCode.desc())
                .fetchFirst();
    }

    // 하위 카테고리 목록 카운트
    public Long selectSubCategoryList(Category entity) {
        return queryFactory.select(category.count())
                .from(category)
                .where(category.cateParentCode.eq(entity.getCateParentCode()))
                .fetchFirst();
    }

    // 하위로 등록할 카테고리의 상위 카테고리 정보 가져오기
    public CategoryForm selectMainCategoryInfo(CategoryForm categoryForm) {
        return queryFactory.select(Projections.bean(CategoryForm.class,
                        category.id,
                        category.cateCode,
                        category.cateName,
                        category.cateParentCode,
                        category.cateOrder
                ))
                .from(category)
                .where(category.id.eq(categoryForm.getId()))
                .fetchOne();
    }

    // 1차 카테고리의 마지막에 등록된 cate_code값을 가져온다.
    public CategoryForm selectLastCateCode(Category categoryForm) {
        return queryFactory.select(Projections.bean(CategoryForm.class,
                        category.cateCode,
                        category.cateOrder,
                        category.cateParentCode
                ))
                .from(category)
                .where(category.cateParentCode.eq(categoryForm.getCateParentCode()).and(category.cateCode.ne(categoryForm.getCateParentCode())))
                .orderBy(category.id.desc())
                .fetchFirst();

    }
}
