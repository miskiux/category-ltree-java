package com.category.tree.category.feature.core.repository;

import com.category.tree.category.feature.core.entity.Category;
import org.springframework.data.repository.Repository;

public interface CategoryRepository extends Repository<Category, Long> {
    Category save(Category category);

}