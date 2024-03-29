package com.category.tree.category.feature.core.service;

import com.category.tree.category.feature.core.builder.PathBuilder;
import com.category.tree.category.feature.core.dto.CreateCategoryRequest;
import com.category.tree.category.feature.core.entity.Category;
import com.category.tree.category.feature.core.repository.CategoryRepository;
import com.category.tree.category.feature.core.structures.CategoryID;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category create(CreateCategoryRequest request) {
        final String ancestorPath = request.parentId != null
                ? this.categoryRepository.findById(request.parentId).getPath()
                : null;

        PathBuilder pathBuilder = new PathBuilder();
        CategoryID categoryID = new CategoryID(UUID.randomUUID());

        //  UUID primary keys are incompatible in ltree extension, thus using name for constructing path hierarchy.
        String path = pathBuilder.buildPath(ancestorPath, request.name);

        return this.categoryRepository.create(
                new Category(categoryID, request.name, path)
        );
    }

    public List<Category> getAncestorList(String name) {
        return this.categoryRepository.getAncestorListByName(name);
    }
}