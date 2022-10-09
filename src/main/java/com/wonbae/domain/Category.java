package com.wonbae.domain;

import com.querydsl.core.Tuple;
import com.wonbae.admin.product.form.CategoryForm;
import lombok.Getter;

import javax.persistence.*;

import static com.wonbae.domain.QCategory.category;

@Getter
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                // 고유아이디

    @Column(name = "cate_name")
    private String cateName;       // 카테고리명

    @Column(name = "cate_order")
    private int cateOrder;         // 카테고리 정렬

    @Column(name = "cate_code")
    private int cateCode;           // 카테고리 구분 코드(1차, 2차 구분코드)

    @Column(name = "cate_parent_code")
    private int cateParentCode;     // 부모 카테고리 코드

    // 카테고리 정보 가져오기
    public void selectCategoryInfo(Tuple tuple) {
        this.id = tuple.get(category.id);
        this.cateName = tuple.get(category.cateName);
        this.cateParentCode = tuple.get(category.cateParentCode);
        this.cateOrder = tuple.get(category.cateOrder);
        this.cateCode = tuple.get(category.cateCode);
    }

    // 카테고리 정보 업데이트하기
    public void updateCategoryInfo(CategoryForm category) {
        this.cateName = category.getCateName();
        this.cateOrder = category.getCateOrder();
    }

    // 2차 카테고리 등록하기
    public void createSubCategoryInfo(CategoryForm category, CategoryForm selectCategory) {
        this.cateName = category.getCateName();
        this.cateOrder = selectCategory.getCateOrder() + 1;
        this.cateCode = selectCategory.getCateCode() + 1;
        this.cateParentCode = selectCategory.getCateParentCode();
    }
}
