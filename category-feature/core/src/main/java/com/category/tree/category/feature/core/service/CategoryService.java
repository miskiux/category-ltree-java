package com.category.tree.category.feature.core.service;

import com.category.tree.category.feature.core.builder.PathBuilder;
import com.category.tree.category.feature.core.dto.CreateCategoryRequest;
import com.category.tree.category.feature.core.entity.Category;
import com.category.tree.category.feature.core.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public String create(CreateCategoryRequest request) {
        String ancestorPath = null;
        PathBuilder pathBuilder = new PathBuilder();

        if (request.parentId != null) {
            ancestorPath = this.categoryRepository.findById(request.parentId).getPath();
        }

        String path = pathBuilder.buildPath(ancestorPath, request.name);

        Category category = this.categoryRepository.create(
                new Category(request.name, path)
        );

        return category.getId();
    }
}