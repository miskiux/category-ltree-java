package com.category.tree.category.feature.core.service;

import com.category.tree.category.feature.core.builder.PathBuilder;
import com.category.tree.category.feature.core.dto.CreateCategoryRequest;
import com.category.tree.category.feature.core.entity.Category;
import com.category.tree.category.feature.core.repository.CategoryRepository;
import com.category.tree.category.feature.core.structures.CategoryID;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public Category create(CreateCategoryRequest request) {
        String ancestorPath = null;
        PathBuilder pathBuilder = new PathBuilder();
        CategoryID categoryID = new CategoryID(UUID.randomUUID());

        if (request.parentId != null) {
            ancestorPath = this.categoryRepository.findById(request.parentId).getPath();
        }

        String path = pathBuilder.buildPath(ancestorPath, request.name);

        Category category = this.categoryRepository.create(
                new Category(categoryID, request.name, path)
        );

        return category;
    }
}