package com.category.tree.category.feature.core.integration;


import com.category.tree.category.feature.core.ApplicationTest;
import com.category.tree.category.feature.core.repository.CategoryRepository;
import com.category.tree.category.feature.core.service.CategoryService;
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
    }

    @Test
    @DisplayName("it should return sub-category's correct path")
    void getCategoryPath() {
    }
}
