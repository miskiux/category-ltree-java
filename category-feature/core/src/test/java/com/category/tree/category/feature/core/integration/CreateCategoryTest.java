package com.category.tree.category.feature.core.integration;


import com.category.tree.category.feature.core.ApplicationTest;
import com.category.tree.category.feature.core.dto.CreateCategoryRequest;
import com.category.tree.category.feature.core.entity.Category;
import com.category.tree.category.feature.core.repository.CategoryRepository;
import com.category.tree.category.feature.core.service.CategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@ApplicationTest
public class CreateCategoryTest {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryService categoryService;

    @Test
    @DisplayName("it should create category")
    public void createCategory() {
        String name = "Catalog";
        CreateCategoryRequest request = new CreateCategoryRequest();
        request.setName(name);
        String categoryId = this.categoryService.create(
                request
        );
        Category category = this.categoryRepository.findById(categoryId);
        Assertions.assertEquals(categoryId, category.getId());
    }

    @Test
    @DisplayName("it should return sub-category's correct path")
    void getCategoryPath() {
    }
}
