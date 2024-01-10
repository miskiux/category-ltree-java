package com.category.tree.category.feature.core.service;

import com.category.tree.category.feature.core.dto.CreateCategoryRequest;
import com.category.tree.category.feature.core.entity.Category;
import com.category.tree.category.feature.core.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public void create(CreateCategoryRequest request) {
        Category category = new Category(
                request.name, request.price
        );

        this.repository.save(category);
    }
}
