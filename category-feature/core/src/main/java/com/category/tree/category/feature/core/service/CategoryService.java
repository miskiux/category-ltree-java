package com.category.tree.category.feature.core.service;

import com.category.tree.category.feature.core.builder.PathBuilder;
import com.category.tree.category.feature.core.dto.CreateCategoryRequest;
import com.category.tree.category.feature.core.entity.Category;
import com.category.tree.category.feature.core.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public void create(CreateCategoryRequest request) {
        String ancestorPath = null;
        PathBuilder pathBuilder = new PathBuilder();

        if (request.parentId != null) {
            ancestorPath = this.categoryRepository.findById(request.parentId).getPath();
        }

        pathBuilder.buildPath(ancestorPath, request.name);

        this.categoryRepository.create(
                new Category(request.name, pathBuilder.getPath())
        );
    }
}