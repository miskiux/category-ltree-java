package com.category.tree.category.feature.core.dto;

import org.springframework.lang.Nullable;

public class CreateCategoryRequest {
    public String name;
    @Nullable
    public String parentId = null;
}