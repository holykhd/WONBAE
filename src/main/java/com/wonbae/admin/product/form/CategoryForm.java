package com.wonbae.admin.product.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryForm {

    private Long id;

    @NotBlank(message = "카테고리명은 반드시 입력하셔야 합니다..")
    private String cateName;

    private Integer cateCode;

    private Integer cateParentCode;

    @Positive
    private Integer cateOrder;

}
