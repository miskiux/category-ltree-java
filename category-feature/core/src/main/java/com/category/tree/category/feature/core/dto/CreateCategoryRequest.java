package com.category.tree.category.feature.core.dto;

import com.category.tree.category.feature.core.structures.CategoryID;
import org.springframework.lang.Nullable;

public class CreateCategoryRequest {
    public String name;
    @Nullable
    public CategoryID parentId = null;

    public void setName(String name) {
        this.name = name;
    }
}