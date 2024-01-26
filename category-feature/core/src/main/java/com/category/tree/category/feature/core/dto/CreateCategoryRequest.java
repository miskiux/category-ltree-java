package com.category.tree.category.feature.core.dto;

import com.category.tree.category.feature.core.structures.CategoryID;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class CreateCategoryRequest {
    public String name;
    @Nullable
    public CategoryID parentId = null;
}